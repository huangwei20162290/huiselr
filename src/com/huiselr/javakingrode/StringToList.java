package com.huiselr.javakingrode;

import java.io.File;
import java.io.IOException;

//获取项目在本地的路径
public class StringToList {
    public static void main(String[] args) throws IOException {
        String canonicalPath = new File("").getCanonicalPath();
        System.out.println(canonicalPath);
    }
}
