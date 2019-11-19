package com.huiselr.test;


import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class TestIterator {
    public static void main(String[] args) {
        List list=new ArrayList();
        list.add("zhangsan");
        list.add("lisi");
        list.add("wangwu");
        list.add("赵六");
        list.add("胜七");
        Iterator iterator = list.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }


}
