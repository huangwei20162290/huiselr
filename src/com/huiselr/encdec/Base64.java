package com.huiselr.encdec;


/**
 * base64加解密
 */
public class Base64 {
    //加密
    public static byte[] baseEncrypt(String data){
        byte[] encode = java.util.Base64.getEncoder().encode(data.getBytes());
        return encode;
    }
    //解密
    public static byte[] baseDecrypt(byte[] data){
        byte[] decode = java.util.Base64.getDecoder().decode(data);
        return decode;
    }

//    public static void main(String[] args) {
//        //被加密数据
//        String data="huiselr";
//        System.out.println("明文:"+data);
//        System.out.println("进行加密......");
//        byte[] base64Encrypt = baseEncrypt(data);
//        String s = new String(base64Encrypt);
//        System.out.println("密文为:"+s);
//        System.out.println("进行解密......");
//        byte[] bytes = baseDecrypt(base64Encrypt);
//        String s1 = new String(bytes);
//        System.out.println("解密后:"+s1);
//
//
//    }
}
