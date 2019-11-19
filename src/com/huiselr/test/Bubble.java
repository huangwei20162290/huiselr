package com.huiselr.test;


import java.util.Random;

public class Bubble {

    public static void main(String[] args) {
        Random random = new Random();
        Integer[] ins=new Integer[50000];
        for (int a=0;a<50000;a++){
            ins[a]=random.nextInt(100);
        }
/*
        Integer[] integer={3,1,4,5,6,7,8,9,11,12,13,14,15,16,17,22,23,25,26,27,28,29,31,33};
*/

        final long start = System.nanoTime(); //纳秒
        Bubble.bubbleSort(ins,ins.length);
        final long end = System.nanoTime();
        System.out.println(end-start);

       /* for (int inte: ins) {
            System.out.print(inte);
            System.out.print(" ");
        }*/
    }
    public static void bubbleSort(Integer[] arr,int n){
        if (n<=1){
            return;
        }
        boolean flag=true;
        for (int i=0;i<n;i++){
            for (int j=0;j<n-i-1;j++){
                if (arr[j] > arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                    flag=false;
                }
            }
            if (flag){
                break;
            }
        }
    }


}
