package com.huiselr.test;

import java.text.SimpleDateFormat;
import java.util.*;

public class MapTest {
    public static void main(String[] args) {
        Map<Object, Object> map = new HashMap<>();
        map.put(1,"张三");
        map.put(2,"李四");
        map.put(3,"王五");
        map.put(4,"王五");
        Set<Map.Entry<Object, Object>> entries = map.entrySet();
        Iterator<Map.Entry<Object, Object>> iter = entries.iterator();
        while (iter.hasNext()){
            Map.Entry<Object, Object> next = iter.next();
            System.out.print(next.getValue());
        }
        System.out.println("======"+map.get(1));
        /*System.out.println(map.entrySet());
        Object o = map.get(1);
        System.out.println(o);
        System.out.println(map.keySet());
        Set<Object> set = map.keySet();
        Iterator<Object> iterator = set.iterator();
        while (iterator.hasNext()){
            System.out.println("  "+map.get(iterator.next()));
        }*/

        String format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date());
        System.out.println(format);
        String s="huiselr";

        System.out.println(s.substring(0,2));

        System.out.println(new Date());

        String str="232.5667";
        System.out.println(Double.parseDouble(str));
    }
}
