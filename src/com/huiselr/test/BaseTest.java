package com.huiselr.test;

import java.text.ParseException;
import java.text.SimpleDateFormat;

public class BaseTest {
    public static void main(String[] args) throws ParseException {
        System.out.println((int)Math.ceil((20*0.01)));
        System.out.println(Math.round(23.8));
        double v = Double.parseDouble("3232");
        System.out.println(v);
        System.out.println(new SimpleDateFormat("yyyy-MM").parse("1993-11"));
        String state="1";
        if (!state.equals("1")&&!state.equals("2")&&!state.equals("3")&&!state.equals("4")){
            System.out.println("3432432");
        }
    }
}
