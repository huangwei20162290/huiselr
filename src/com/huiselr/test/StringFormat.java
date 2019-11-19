package com.huiselr.test;

import java.util.Date;

public class StringFormat {
    public static void main(String[] args) {
        Date date = new Date();
        String format = String.format("我的生日是:%s-%s-%s","2019","9","21");
        String format1 = String.format("%tF", date);
        System.out.println(format);
        System.out.println(format1);
    }
}
