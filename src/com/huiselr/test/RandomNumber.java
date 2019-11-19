package com.huiselr.test;

import java.text.DecimalFormat;
import java.util.Random;

public class RandomNumber {
    public static void main(String[] args) {
        Random random = new Random();
            DecimalFormat df=new DecimalFormat("#.00");
            int a=(int)(Math.random()*2+1);
            int aa=(int)(Math.pow(-1, a));
        Double aDouble = Double.valueOf(df.format(random.nextDouble() * 100 * aa));
        System.out.println(aDouble);

        /*for (int a=0;a<10;a++){
            int i = random.nextInt(100);
            System.out.print(i+" ");
        }*/
    }
}
