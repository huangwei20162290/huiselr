package com.huiselr.javakingrode;

public class ManyThread2 {
    public static void main(String[] args) {
        final Thread12 f2 = new Thread12();
        new Thread(new Runnable(){
            public void run(){
                for(int i=0;i<3;i++){
                    f2.subThread();
                }
            }
        }).start();

        // 主线程循环3次
        for(int i=0;i<3;i++){
            f2.mainThread();
        }
    }
}

class Thread12 extends Thread{
    private boolean flag=false;
    public synchronized void subThread(){
        while(!flag){
            try {
                this.wait();
            }catch (Exception e){
                e.printStackTrace();
            }
        }
        for (int i=0;i<5;i++){
            System.out.println("subThread===>>"+i);
        }
        this.notifyAll();
        flag=false;
    }
    public synchronized void mainThread(){
        while (flag){
            try {
                this.wait();
            }catch (Exception e){
                e.printStackTrace();
            }
        }
        for (int i=0;i<3;i++){
            System.out.println("mainThread===>>"+i);
        }
        this.notifyAll();
        flag=true;
    }
}
