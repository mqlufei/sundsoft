package com.sundsoft.utils;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

import org.apache.commons.httpclient.Header;
import org.apache.commons.httpclient.HttpClient;
import org.apache.commons.httpclient.HttpException;
import org.apache.commons.httpclient.HttpStatus;
import org.apache.commons.httpclient.MultiThreadedHttpConnectionManager;
import org.apache.commons.httpclient.methods.GetMethod;
import org.apache.commons.httpclient.methods.PostMethod;
import org.apache.commons.httpclient.methods.StringRequestEntity;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;

/**
 * HTTP工具类
 * 
 * @author 
 * 
 */
public class HttpUtils {

	private static final Logger log = LogManager.getLogger(HttpUtils.class);

	/**
	 * 定义编码格式 UTF-8
	 */
	public static final String URL_PARAM_DECODECHARSET_UTF8 = "UTF-8";

	/**
	 * 定义编码格式 GBK
	 */
	public static final String URL_PARAM_DECODECHARSET_GBK = "GBK";

	private static final String URL_PARAM_CONNECT_FLAG = "&";

	private static final String EMPTY = "";

	private static MultiThreadedHttpConnectionManager connectionManager = null;

	private static int connectionTimeOut = 25000;

	private static int socketTimeOut = 25000;

	private static int maxConnectionPerHost = 20;

	private static int maxTotalConnections = 20;

	private static HttpClient client;

	static {
		connectionManager = new MultiThreadedHttpConnectionManager();
		connectionManager.getParams().setConnectionTimeout(connectionTimeOut);
		connectionManager.getParams().setSoTimeout(socketTimeOut);
		connectionManager.getParams().setDefaultMaxConnectionsPerHost(maxConnectionPerHost);
		connectionManager.getParams().setMaxTotalConnections(maxTotalConnections);
		client = new HttpClient(connectionManager);
	}

	/**
	 * POST方式提交数据
	 * @param url
	 * 			待请求的URL
	 * @param xmlString
	 * 			要提交的数据
	 * @param enc
	 * 			编码
	 * @param contentType
	 * 		        数据类型
	 * @return
	 * 			响应结果
	 * @throws IOException
	 * 			IO异常
	 */
	public static String URLPost(String url, String xmlString, String enc, String contentType) {
		if ("xml".equals(contentType)) {
			contentType = "text/xml";
		}
		else {
			contentType = "application/json";// 默认是json
		}
		HttpClient client = new HttpClient();
		PostMethod myPost = new PostMethod(url);
		client.getParams().setSoTimeout(300 * 1000);
		String responseString = null;
		try {
			log.debug(url +"  POST 请求参数  =  " + xmlString);
			myPost.setRequestEntity(new StringRequestEntity(xmlString, contentType, enc));
			int statusCode = client.executeMethod(myPost);
			if (statusCode == HttpStatus.SC_OK) {
				BufferedInputStream bis = new BufferedInputStream(myPost.getResponseBodyAsStream());
				byte[] bytes = new byte[1024];
				ByteArrayOutputStream bos = new ByteArrayOutputStream();
				int count = 0;
				while ((count = bis.read(bytes)) != -1) {
					bos.write(bytes, 0, count);
				}
				byte[] strByte = bos.toByteArray();
				responseString = new String(strByte, 0, strByte.length, enc);
				bos.close();
				bis.close();
			}
		}
		catch (Exception e) {
			log.error(e.getMessage(), e);
		}
		myPost.releaseConnection();
		client.getHttpConnectionManager().closeIdleConnections(0);
		System.out.println("responseString:" + responseString);
		return responseString;
	}

	/**
	 * POST方式提交数据
	 * @param url
	 * 			待请求的URL
	 * @param params
	 * 			要提交的数据
	 * @param enc
	 * 			编码
	 * @return
	 * 			响应结果
	 * @throws IOException
	 * 			IO异常
	 */
	public static String URLPost(String url, Map<String, String> params, String enc) throws IOException {

		String response = EMPTY;
		PostMethod postMethod = null;
		StringBuffer sb = new StringBuffer();
		try {
			postMethod = new PostMethod(url);
			postMethod.setRequestHeader("Content-Type", "application/x-www-form-urlencoded;charset=" + enc);
			// 将表单的值放入postMethod中
			if (params != null) {
				Set<String> keySet = params.keySet();
				for (String key : keySet) {
					String value = params.get(key);
					postMethod.addParameter(key, value);
					sb.append(key+":"+value).append(",");
				}
			}
			log.debug(url +"  POST 请求参数  = " + sb.toString().substring(0, sb.length()-1));
			// 执行postMethod
			int statusCode = client.executeMethod(postMethod);
			if (statusCode == HttpStatus.SC_OK) {
				BufferedInputStream bis = new BufferedInputStream(postMethod.getResponseBodyAsStream());
				byte[] bytes = new byte[1024];
				ByteArrayOutputStream bos = new ByteArrayOutputStream();
				int count = 0;
				while ((count = bis.read(bytes)) != -1) {
					bos.write(bytes, 0, count);
				}
				byte[] strByte = bos.toByteArray();
				response = new String(strByte, 0, strByte.length, enc);
				bos.close();
				bis.close();
			}else if (statusCode == 302) {
			    Header header = postMethod.getResponseHeader("location"); // 跳转的目标地址是在 HTTP-HEAD 中的
			    String newuri = header.getValue(); // 这就是跳转后的地址，再向这个地址发出新申请，以便得到跳转后的信息是啥。
			    log.error("响应状态码 = " + postMethod.getStatusCode()+" , redirect url = " + newuri);
			}
			else {
				log.error("响应状态码 = " + postMethod.getStatusCode());
			}
		}
		catch (HttpException e) {
			log.error("发生致命的异常，可能是协议不对或者返回的内容有问题", e);
			throw e;
		}
		catch (IOException e) {
			log.error("发生网络异常", e);
			throw e;
		}
		finally {
			if (postMethod != null) {
				postMethod.releaseConnection();
				postMethod = null;
			}
		}

		return response;
	}

	/**
	 * GET方式提交数据
	 * @param url
	 * 			待请求的URL
	 * @param params
	 * 			要提交的数据
	 * @param enc
	 * 			编码
	 * @return
	 * 			响应结果
	 * @throws IOException
	 * 			IO异常
	 */
	public static String URLGet(String url, Map<String, String> params, String enc) {

		String response = EMPTY;
		GetMethod getMethod = null;
		StringBuffer strtTotalURL = new StringBuffer(EMPTY);

		if (url.indexOf("?") == -1) {
			if (params == null) {
				strtTotalURL.append(url);
			}
			else {
				strtTotalURL.append(url).append("?").append(getUrl(params, enc));
			}
		}
		else {
			if (params == null) {
				strtTotalURL.append(url);
			}
			else {
				strtTotalURL.append(url).append("&").append(getUrl(params, enc));
			}
		}
		log.debug(url +"  GET请求URL = \n" + strtTotalURL.toString());

		try {
			getMethod = new GetMethod(strtTotalURL.toString());
			getMethod.setRequestHeader("Content-Type", "application/x-www-form-urlencoded;charset=" + enc);
			// 执行getMethod
			int statusCode = client.executeMethod(getMethod);
			if (statusCode == HttpStatus.SC_OK) {
				response = getMethod.getResponseBodyAsString();
			}
			else {
				log.debug("响应状态码 = " + getMethod.getStatusCode());
			}
		}
		catch (HttpException e) {
			log.error("发生致命的异常，可能是协议不对或者返回的内容有问题", e);
		}
		catch (IOException e) {
			log.error("发生网络异常", e);
		}
		catch (Exception e) {
			log.error("其他异常", e);
		}
		finally {
			if (getMethod != null) {
				getMethod.releaseConnection();
				getMethod = null;
			}
		}

		return response;
	}

	/**
	 * 据Map生成URL字符串
	 * @param map
	 * 			Map
	 * @param valueEnc
	 * 			URL编码
	 * @return
	 * 			URL
	 */
	private static String getUrl(Map<String, String> map, String valueEnc) {

		if (null == map || map.keySet().size() == 0) {
			return (EMPTY);
		}
		StringBuffer url = new StringBuffer();
		Set<String> keys = map.keySet();
		for (Iterator<String> it = keys.iterator(); it.hasNext();) {
			String key = it.next();
			if (map.containsKey(key)) {
				String val = map.get(key);
				String str = val != null ? val : EMPTY;
				try {
					str = URLEncoder.encode(str, valueEnc);
				}
				catch (UnsupportedEncodingException e) {
					e.printStackTrace();
				}
				url.append(key).append("=").append(str).append(URL_PARAM_CONNECT_FLAG);
			}
		}
		String strURL = EMPTY;
		strURL = url.toString();
		if (URL_PARAM_CONNECT_FLAG.equals(EMPTY + strURL.charAt(strURL.length() - 1))) {
			strURL = strURL.substring(0, strURL.length() - 1);
		}

		return (strURL);
	}

	/** 
	 * 下载文件保存到本地 
	 *  
	 * @param path 
	 *            文件保存位置 
	 * @param url 
	 *            文件地址 
	 * @throws IOException 
	 */
	public static void downloadFile(String path, String url) throws IOException {
		log.debug("path:" + path);
		log.debug("url:" + url);
		GetMethod getMethod = null;
		InputStream in = null;
		try {

			getMethod = new GetMethod(url);
			// 执行getMethod
			int statusCode = client.executeMethod(getMethod);
			if (statusCode == HttpStatus.SC_OK) {
				in = getMethod.getResponseBodyAsStream();
				byte[] result = new byte[1024];
				BufferedOutputStream bw = null;
				try {
					// 创建文件对象
					File f = new File(path);
					// 创建文件路径
					if (!f.getParentFile().exists()) {
						f.getParentFile().mkdirs();
					}
					// 写入文件
					bw = new BufferedOutputStream(new FileOutputStream(path));
					while ((in.read(result)) != -1) {
						bw.write(result);
					}
				}
				catch (Exception e) {
					log.error("保存文件错误,path=" + path + ",url=" + url, e);
				}
				finally {
					try {
						if (bw != null)
							bw.close();
					}
					catch (Exception e) {
						log.error("finally BufferedOutputStream shutdown close", e);
					}
				}
			}
			else {
				log.debug("响应状态码 = " + getMethod.getStatusCode());
			}
		}
		catch (HttpException e) {
			log.error("发生致命的异常，可能是协议不对或者返回的内容有问题", e);
			e.printStackTrace();
		}
		catch (IOException e) {
			log.error("发生网络异常", e);
			e.printStackTrace();
		}
		catch (Exception e) {
			log.error("其他异常", e);
			e.printStackTrace();
		}
		finally {
			if (getMethod != null) {
				getMethod.releaseConnection();
				getMethod = null;
			}
		}
	}

	public static void main(String[] args) {
		String url = "https://api.weixin.qq.com/cgi-bin/token?grant_type=client_credential&appid=wx1a283aa9aa5048df&secret=d4624c36b6795d1d99dcf0547af5443d";
		String result = URLGet(url, null, "utf-8");
		System.out.println(result);
	}
}
