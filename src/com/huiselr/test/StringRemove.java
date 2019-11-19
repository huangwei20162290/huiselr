package com.huiselr.test;

public class StringRemove {
    public static void main(String[] args) {
       /* String s="32dsafadafegf32";
        StringBuilder stringBuilder = new StringBuilder(s);
        String substring = stringBuilder.substring(1, 4);
        System.err.println(substring);
        System.err.println(s);*/

        /*String data="3130100458";
        boolean equals = !"".equals(data);
        if (!"".equals(data) && data != null){
            System.err.println(equals);
        }*/
        String s="3130100614,3130100615,3130100616,3130100617,3130100687,3130100619,3130100618,3130100620,3130100737,3130100763,3130100227,3130100458,3130100459,3130100462,3130100463,3130100461,3130100464,3130100229,3130100698,3130100684,3130201011";
        String[] split = s.split(",");
        String s1="";
        for (String code:split){
            s1+="'"+code+"',";
        }
        int indexOf = s1.lastIndexOf(",");
        String substring = s1.substring(0, indexOf);
        System.err.println(indexOf);
        System.err.println(substring);
        //System.err.println(s1);
    }
}
