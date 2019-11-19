package com.huiselr.javakingrode;

public class ManyThead1 {
    public int i=12;
    public static void main(String[] args) {
        Thread1 thread1 = new Thread1();
        thread1.start();
        Thread2 thread2 = new Thread2();
        thread2.start();
    }
}
class Thread1 extends Thread{
    @Override
    public void run() {
        ManyThead1 manyThead = new ManyThead1();
        int i1 = manyThead.i;
        System.err.println("=======>>>线程1开始执行");
        int i = i1 * i1;
        System.err.println("=====>>"+i);
        System.err.println("=======>>>线程1执行结束");
    }
}

class Thread2 extends Thread{
    @Override
    public void run() {
        System.err.println("=======>>>线程2开始执行");
        ManyThead1 manyThead = new ManyThead1();
        int i = manyThead.i/2;
        System.err.println("=====>>"+i);
        System.err.println("=======>>>线程2执行结束");
    }
}