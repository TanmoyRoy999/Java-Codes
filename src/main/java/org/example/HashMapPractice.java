package org.example;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class HashMapPractice {

    public static void hashMapPractice() {

        Scanner sc = new Scanner(System.in);

        Map<String, Integer> map=new HashMap<>();

        map.put("key1",1);
        map.put("key2",2);
        map.put("key2",3);
        map.put(null,4);
        map.put(null,6);

        System.out.println(map);
        System.out.println(map.get(null));
        System.out.println(map.get("key2"));

//        System.out.println(map.containsKey("key2"));
//        System.out.println(map.containsValue(8));

    }

}
