package com.huiselr.encdec;


public class ByteToString {


    public static void main(String[] args) {
        String s="ZZ/09ngWsEiP9g/poU5LGQ==";
        byte[] bytes = s.getBytes();
        String s1 = new String(bytes);
        byte[] bytes1 = s1.getBytes();
        String s2 = new String(bytes1);
        System.out.println(s1);
        System.out.println(s2);
    }
}
