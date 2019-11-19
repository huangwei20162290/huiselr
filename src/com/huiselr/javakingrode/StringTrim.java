package com.huiselr.javakingrode;

import java.lang.reflect.Field;
import java.util.Arrays;

/**
 * 字符串去掉空格
 */
public class StringTrim {
    public static void main(String[] args) {
        String str1=" 2.3 4==3  2-3   3   ";
        String[] s = str1.split(" ");
        String str2="";
        for (String cell:s){
            str2+=cell;
        }
        System.err.println(str2.trim());
        fun();
    }

        public static void fun() {
            try {
                String aaaa = "aaaa";
                Field field = String.class.getDeclaredField("value");
                field.setAccessible(true);
                char[] value = (char[]) field.get(aaaa);
                Arrays.fill(value, 'b');
            } catch (Exception e) {

            }
            System.out.println("aaaa");
        }
    }


