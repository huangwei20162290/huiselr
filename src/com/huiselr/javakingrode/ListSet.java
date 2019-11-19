package com.huiselr.javakingrode;

import java.util.ArrayList;

public class ListSet {
    public static void main(String[] args) {
        ArrayList list = new ArrayList();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.set(0,100);
        for (Object i:list){
            System.out.println(i);
        }
    }

}
