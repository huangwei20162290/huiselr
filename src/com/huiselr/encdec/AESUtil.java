package com.huiselr.encdec;

import javax.crypto.*;
import javax.crypto.spec.SecretKeySpec;
import java.io.UnsupportedEncodingException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.util.Base64;

/**
 * AES 加密方法，是对称的密码算法(加密与解密的密钥一致)，这里使用最大的 256 位的密钥
 */
public class AESUtil {

    public static void main(String[] args) throws UnsupportedEncodingException, NoSuchAlgorithmException, IllegalBlockSizeException, InvalidKeyException, BadPaddingException, NoSuchPaddingException {
        String strKeyAES = getStrKeyAES();
        System.out.println(strKeyAES);
        SecretKey secretKey = strKey2SecretKey(strKeyAES);
        String string="张志勋";
        byte[] encBytes = encryptAES(string, secretKey);
        String s = Base64.getEncoder().encodeToString(encBytes);
        byte[] decode = Base64.getDecoder().decode(s);
        System.err.println("密文为:"+s);
        byte[] decBytes = decryptAES(decode, secretKey);
        System.err.println("明文为:"+new String(decBytes));
    }

    /**
     * 获得一个 密钥长度为 256 位的 AES 密钥，
     * @return 返回经 BASE64 处理之后的密钥字符串
     */
    public static String getStrKeyAES() throws NoSuchAlgorithmException, UnsupportedEncodingException {
        KeyGenerator keyGen = KeyGenerator.getInstance("AES");
        SecureRandom secureRandom = new SecureRandom(String.valueOf(System.currentTimeMillis()).getBytes("utf-8"));
        keyGen.init(256, secureRandom);   // 这里可以是 128、192、256、越大越安全
        SecretKey secretKey = keyGen.generateKey();
        return Base64.getEncoder().encodeToString(secretKey.getEncoded());
    }

    /**
     *  将使用 Base64 加密后的字符串类型的 secretKey 转为 SecretKey
     * @param strKey
     * @return SecretKey
     */
    public static SecretKey strKey2SecretKey(String strKey){
        byte[] bytes = Base64.getDecoder().decode(strKey);
        SecretKeySpec secretKey = new SecretKeySpec(bytes, "AES");
        return secretKey;
    }

    /**
     * 将String转化为byte[]
     * @param s
     * @return
     */
    public static byte[] stringToByte(String s){
        return Base64.getDecoder().decode(s);
    }

    /**
     * 将byte[]转换为String
     * @param bytes
     * @return
     */
    public static String byteToString(byte[] bytes){
        return Base64.getEncoder().encodeToString(bytes);
    }

    /**
     * 加密
     * @param string 待加密内容
     * @param secretKey 加密使用的 AES 密钥
     * @return 加密后的密文 byte[]
     */
    public static byte[] encryptAES(String string, SecretKey secretKey) throws NoSuchPaddingException, NoSuchAlgorithmException, InvalidKeyException, BadPaddingException, IllegalBlockSizeException {
        Cipher cipher = Cipher.getInstance("AES");
        cipher.init(Cipher.ENCRYPT_MODE, secretKey);
        byte[] content = string.getBytes();
        return cipher.doFinal(content);
    }

    /**
     * 解密
     * @param content 待解密内容
     * @param secretKey 解密使用的 AES 密钥
     * @return 解密后的明文 byte[]
     */
    public static byte[] decryptAES(byte[] content, SecretKey secretKey) throws NoSuchPaddingException, NoSuchAlgorithmException, InvalidKeyException, BadPaddingException, IllegalBlockSizeException {
        Cipher cipher = Cipher.getInstance("AES");
        cipher.init(Cipher.DECRYPT_MODE, secretKey);
        return cipher.doFinal(content);
    }
}
