package com.huiselr.test;

import java.util.ArrayList;
import java.util.List;

public class ListGet {
    public static void main(String[] args) {
        List<Student> list=new ArrayList<Student>();
        for (int i=0;i<5;i++){
            Student stu = new Student();
            list.add(stu);
        }
        list.get(0).setName("张三");
        list.get(0).setAge(18);
        list.get(0).setStuNumber(20162209);
        list.get(1).setName("李四");
        list.get(1).setAge(20);
        list.get(1).setStuNumber(20172300);

        System.out.println(list);
    }
}
