package com.huiselr.javakingrode;

import java.io.File;
import java.io.IOException;

//��ȡ��Ŀ�ڱ��ص�·��
public class StringToList {
    public static void main(String[] args) throws IOException {
        String canonicalPath = new File("").getCanonicalPath();
        System.out.println(canonicalPath);
    }
}
