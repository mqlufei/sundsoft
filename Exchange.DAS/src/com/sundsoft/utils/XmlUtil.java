package com.sundsoft.utils;

import java.io.*;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.transform.Result;

import org.apache.commons.lang3.StringUtils;
import org.dom4j.Document;
import org.dom4j.DocumentHelper;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;

import com.sun.xml.bind.marshaller.DataWriter;

public class XmlUtil {
	
	
	public static Map<String, String> parseXml2Map(String xmlString) throws Exception{
        Map<String, String> map = new HashMap<String, String>();  
        if(StringUtils.isBlank(xmlString)){
        	return map;
        }
        Document document=DocumentHelper.parseText(xmlString);
        map=parseXml2Map(document);
        return map;
	}
	public static Map<String, String> parseXml2Map(Document document) throws Exception{
        Map<String, String> map = new HashMap<String, String>();  

		String requestXml=document.asXML();
        // 得到xml根元素  

        Element root = document.getRootElement();  

        // 得到根元素的全部子节点  

        List<Element> elementList = root.elements();  

        // 遍历全部子节点  

        for (Element e : elementList)  {

            map.put(e.getName(), e.getText()); 

           }

        map.put("requestXml", requestXml);
        return map;
	}

    public static  Map<String, String> parseXml2Map(HttpServletRequest request) throws Exception {  

        // 将解析结果存储在HashMap中  

        Map<String, String> map = new HashMap<String, String>();  

        // 从request中取得输入流  

        InputStream inputStream = request.getInputStream();  

       // 读取输入流  

        SAXReader reader = new SAXReader();

        Document document = reader.read(inputStream); 
        
        map=parseXml2Map(document);
        // 释放资源  

        inputStream.close();  

        inputStream = null;  
        
        return map;

    }  
    /**

     * 将请求的数据转化xml

     * @param request

     * @return

     */

    public static  String parseMsgXml(HttpServletRequest request){

        String responseMsg = null;

        try {

        InputStream is = request.getInputStream();

        int size = is.available();

        byte[] jsonBytes = new byte[size];

        is.read(jsonBytes);

            responseMsg = new String(jsonBytes, "UTF-8");

            is.close();

       } catch (Exception e) {

           // TODO Auto-generated catch block

           e.printStackTrace();

       }

       return responseMsg ;

    }
    
    
}
