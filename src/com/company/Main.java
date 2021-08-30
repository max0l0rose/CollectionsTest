package com.company;

import java.util.*;

public class Main {

    public static void main(String[] args) {

        List<Byte> key1 = Collections.unmodifiableList(Arrays.asList(new Byte[] {1, 2}));
        List<Byte> key2 = Collections.unmodifiableList(Arrays.asList(new Byte[] {1, 3}));
        boolean eq = key1.equals(key2);
        boolean f = key1 == key2;
        Map<List<Byte>, String> map = new HashMap<>();

        //key1.set(0, (byte) 4);
//        Integer key1 = 1;
//        Integer key2 = 1;
//        boolean f = key1.equals(key2);
//        Map<Integer, String> map = new HashMap<>();



//        String key1 = "qqq1";
//        String key2 = "qqq2";
//        boolean f = key1.equals(key2);
//        Map<String, String> map = new HashMap<>();



//        byte[] key1 = {1, 2, 3};
//        byte[] key2 = {1, 2, 3};
//        boolean f2 = key1.equals(key2);
//        //key2[0] = 4;
////        paramsPassingTest(key1, key2);
//
//        Map<byte[], String> map = new HashMap<>();
        map.put(key1, "value1");
        map.put(key2, "value2");

        String retrievedValue1 = map.get(key1);
        String retrievedValue2 = map.get(key2);
        String retrievedValue3 = map.get(new byte[]{1, 2, 3});

        //vavr();

//        HashMap;
//        HashSet;
//        BlockingQueue;

        //List<Byte> l = Arrays.asList(new Byte[] {1, 2});
        //java.util.List<Object> list = Collections.unmodifiableList(Arrays.asList(1, "qqq"));




        //        HashMap<Integer, String> map = new HashMap<>();
//        map.put(1, "qqq");
//        map.put(4, null); // ok
//        map.put(null, "rrrr"); // ok

//        HashSet<Integer> set = new HashSet<>();
//        set.add(1);
//        set.add(4);
//        set.add(null); // ok

    }
}
