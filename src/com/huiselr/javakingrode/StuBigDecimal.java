package com.huiselr.javakingrode;

import java.math.BigDecimal;

public class StuBigDecimal {
    public static void main(String[] args){
        double b1=11000;
        double b2=0.35;
        System.out.println(b1*b2);
        BigDecimal d1 = new BigDecimal(b1);
        BigDecimal d2 = BigDecimal.valueOf(b2);
        System.out.println(d1.multiply(d2)+"==="+d1.add(d2));
        double b3=0.89322999;
        double b4=32.43441177;
        System.out.println(b3+b4);
    }
}
