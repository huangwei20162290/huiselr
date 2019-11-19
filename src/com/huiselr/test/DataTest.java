package com.huiselr.test;

import sun.applet.Main;

import java.io.FileOutputStream;
import java.sql.SQLOutput;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;
import java.util.regex.Pattern;

public class DataTest {
    public static void main(String[] args) throws ParseException {
       /* String s="201091023";
        String[] split = s.split("-");
        System.out.println(split[0]);
        System.out.println(s.length());
        SimpleDateFormat format = new SimpleDateFormat("yyyy");
        format.setLenient(false);
        Date parse = format.parse(s);
        System.out.println(parse);*/
/*
        Pattern pattern = Pattern.compile("^[-\\+]?[\\d]*$");
        System.out.println(pattern.matcher("").matches());
        String str="";
        String reg = "^[0-9]+(.[0-9]+)?$";
        System.out.println(str.matches(reg));

        String ss="3232.0";
        if (ss.endsWith(".0")){
            System.out.println(ss.substring(ss.lastIndexOf(".")));

            HashMap<String,Object> map = new HashMap();
            ArrayList list = new ArrayList();
            list.add("232");
            list.add("2343");
            list.add("94");
            ArrayList list2 = new ArrayList();
            list2.add("232");
            list2.add("2343");
            list2.add("78");
            map.put("list",list);
            map.put("list2",list2);
            Set set = map.entrySet();
            Iterator iterator = set.iterator();
            while (iterator.hasNext()){
                Map.Entry entry = (Map.Entry)iterator.next();
                List content = (List) entry.getValue();
                for (Object str1 : content) {
                    System.out.print(" "+content);
                }

        }
*/
        /*String string1="3241,432";
        String string2="zoo";
        String reg1 = "^[0-9]+(\\.[0-9]+)?$";
        String reg2="^zo{2}";
        boolean matches = string1.matches(reg1);
        boolean matches1 = string2.matches(reg2);
        System.out.println(matches);
        System.out.println(matches1);*/

        String date="2018-4";
        Date parse = new SimpleDateFormat("yyyy-MM").parse(date);
        System.out.println(parse);
        String format = new SimpleDateFormat("yyyy-MM").format(parse);
        System.err.println(format);
    }

    }

