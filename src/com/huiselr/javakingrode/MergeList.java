package com.huiselr.javakingrode;

import java.util.ArrayList;
import java.util.List;

public class MergeList {

    public static void main(String[] args) {
        ArrayList list1 = new ArrayList();
        list1.add(1);
        list1.add(2);
        ArrayList list2 = new ArrayList();
        list2.add(3);
        list2.add(4);
        ArrayList<List> list3 = new ArrayList<List>();
        list3.add(list1);
        list3.add(list2);



        for (Object o:list1){
            System.err.println(o);
        }
    }
}
