package com.huiselr.test;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class GetDate {
    public static void main(String[] args) {
        //获取当前本机时间
        Date time = Calendar.getInstance().getTime();
        SimpleDateFormat sim = new SimpleDateFormat("YYYY年MM月dd日  HH:mm:ss a E");
        String date = sim.format(time);
        System.out.println(date);
        Date date1 = new Date();
        String format = sim.format(date1);
        System.out.println(format);
    }
}
