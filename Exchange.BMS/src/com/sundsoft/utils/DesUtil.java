/**
 * @author dyc
 * dyc.algorithm
 * ThreeDes.java
 * 
 * 2016年7月27日-下午5:25:47
 *  2016XX公司-版权所有
 * 
 */
package com.sundsoft.utils;

/**
 * @author dyc
 * @ClassName ThreeDes
 * @Description
 * @date 2016年7月27日
 * 
 * @version 1.0.0
 * 
 */
import java.security.Key;
import java.security.Security;
import java.security.spec.AlgorithmParameterSpec;

import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

import org.apache.log4j.Logger;
public class DesUtil {
	private static Logger logger = Logger.getLogger(DesUtil.class);

	private static final byte[] keyBytes = { 0x11, 0x22, 0x4F, 0x58, (byte) 0x88, 0x10, 0x40, 0x38, 0x28, 0x25, 0x79, 0x51, (byte) 0xCB,
			(byte) 0xDD,
			0x55, 0x66, 0x77, 0x29, 0x74, (byte) 0x98, 0x30, 0x40, 0x36, (byte) 0xE2 }; // 24字节的密钥
	private static final String Algorithm = "DESede"; // 定义 加密算法,可用 DES,DESede,Blowfish

	// 3des加密。keybyte为加密密钥，长度为24字节
	// src为被加密的数据缓冲区（源）
	public static byte[] encryptData(byte[] keybyte, byte[] src) {
		try {
			// 生成密钥
			SecretKey deskey = new SecretKeySpec(keybyte, Algorithm);

			// 加密
			Cipher c1 = Cipher.getInstance(Algorithm);
			c1.init(Cipher.ENCRYPT_MODE, deskey);
			return c1.doFinal(src);
		} catch (java.security.NoSuchAlgorithmException e1) {
			e1.printStackTrace();
		} catch (javax.crypto.NoSuchPaddingException e2) {
			e2.printStackTrace();
		} catch (java.lang.Exception e3) {
			e3.printStackTrace();
		}
		return null;
	}

	/**
	 * DES算法，加密
	 * 
	 * @param data
	 *            待加密字符串
	 * @param key
	 *            加密私钥，长度不能够小于8位
	 * @return 加密后的字节数组，一般结合Base64编码使用
	 * @throws CryptException
	 *             异常
	 */
	public static String desEncode(String key, byte[] data) throws Exception {
		try {
			DESKeySpec dks = new DESKeySpec(key.getBytes());

			SecretKeyFactory keyFactory = SecretKeyFactory.getInstance("DES");
			// key的长度不能够小于8位字节
			Key secretKey = keyFactory.generateSecret(dks);
			Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
			IvParameterSpec iv = new IvParameterSpec("12345678".getBytes());
			AlgorithmParameterSpec paramSpec = iv;
			cipher.init(Cipher.ENCRYPT_MODE, secretKey, paramSpec);

			byte[] bytes = cipher.doFinal(data);
			return new String(Encodes.encodeBase64(bytes));
		} catch (Exception e) {
			logger.error("des加密方法异常，异常原因：", e);
			throw new Exception(e);
		}
	}

	public static String desDecode(String key, byte[] data) throws Exception {
		try {
			byte[] decode = Encodes.decodeBase64(data);
			DESKeySpec dks = new DESKeySpec(key.getBytes());
			SecretKeyFactory keyFactory = SecretKeyFactory.getInstance("DES");
			// key的长度不能够小于8位字节
			Key secretKey = keyFactory.generateSecret(dks);
			Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
			IvParameterSpec iv = new IvParameterSpec("12345678".getBytes());
			AlgorithmParameterSpec paramSpec = iv;
			cipher.init(Cipher.DECRYPT_MODE, secretKey, paramSpec);
			byte[] decodeByte = cipher.doFinal(decode);
			return new String(decodeByte);
		} catch (Exception e) {
			logger.error("[pcl_java模块]方法异常，异常原因：", e);
			throw new Exception(e);
		}
	}

	public static String encryptData(byte[] encryptData) {
		return Encodes.encodeHex(encryptData(keyBytes, encryptData));
	}
	// keybyte为加密密钥，长度为24字节
	// src为加密后的缓冲区
	public static byte[] decryptData(byte[] keybyte, byte[] src) {
		try {
			// 生成密钥
			SecretKey deskey = new SecretKeySpec(keybyte, Algorithm);

			// 解密
			Cipher c1 = Cipher.getInstance(Algorithm);
			c1.init(Cipher.DECRYPT_MODE, deskey);
			return c1.doFinal(src);
		} catch (java.security.NoSuchAlgorithmException e1) {
			e1.printStackTrace();
		} catch (javax.crypto.NoSuchPaddingException e2) {
			e2.printStackTrace();
		} catch (java.lang.Exception e3) {
			e3.printStackTrace();
		}
		return null;
	}

	public static String decryptData(String hexString) {
		return new String(decryptData(keyBytes, Encodes.decodeHex(hexString)));
	}


	public static void main(String[] args) {
		// 添加新安全算法,如果用JCE就要把它添加进去
		Security.addProvider(new com.sun.crypto.provider.SunJCE());

	
		String szSrc = "This is a 3DES test. 测试";

		System.out.println("加密前的字符串:" + szSrc);
		
		byte[] encoded = encryptData(keyBytes, szSrc.getBytes());
		// System.out.println("加密后的字符串:" + org.apache.commons.codec.binary.Hex.encodeHexString(encoded).toUpperCase());

		byte[] srcBytes = decryptData(keyBytes, encoded);
		System.out.println("解密后的字符串:" + (new String(srcBytes)));

		try {
			String desEncode = desEncode("hansy123", "test123".getBytes());
			System.out.println(desEncode);
			String desDecode = desDecode("hansy123", desEncode.getBytes());
			System.out.println(desDecode);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}


