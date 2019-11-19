package com.huiselr.test;

import java.util.Random;

public class InsertSort {
    public static void main(String[] args) {
        Integer[] ins=new Integer[100000];
        Random random = new Random();

        for (int a=0;a<100000;a++){
            int i = random.nextInt(50);
            ins[a]=i;
        }
        long start = System.nanoTime();
        InsertSort.sort(ins);
        long end = System.nanoTime();
        System.out.println(end-start);
        /*for (int a:ins){
            System.out.print(a);
            System.out.print(" ");
        }*/
    }

    public static void sort(Integer[] ins){

        for(int i=1; i<ins.length; i++){
            for(int j=i; j>0; j--){
                if(ins[j]<ins[j-1]){
                    int temp = ins[j-1];
                    ins[j-1] = ins[j];
                    ins[j] = temp;
                }
            }
        }

    }
}