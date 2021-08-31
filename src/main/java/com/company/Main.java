package com.company;

import java.util.*;
import java.util.function.BinaryOperator;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Main {

    static class Wrap{
        String value;

        Wrap() {
        }

        Wrap(String s) {
            value = s;
        }

        @Override
        public String toString() {
            return "Wrap{" +
                    "value='" + value + '\'' +
                    '}';
        }
    }


    static int i = 0;
    public static void main(String[] args) {

//        Set<String> set = new HashSet<String>(){{
//            add("a");
//            add("b");
//            add("c");
//        }};

        //Set<String> set1 = new HashSet<>(Arrays.asList("a", "b", "c"));
        Set<String> set1 = new HashSet<String>(new String[] {"a", "b", "c"}));

        set1.add("q");

        int[] arr = {1,2,3};
        int sum = Arrays.stream(arr).sum();

        IntStream.range(0, arr.length).forEach(i -> arr[i]++);

        int sum2 = Arrays.stream(arr).sum();


        List<Wrap> list = //Collections.unmodifiableSet(
                Arrays.asList(new Wrap("qq"), new Wrap() {{ value = "ww"; }} );
        //);

        Set<String> set2 = Stream.of("One", "Two", "Three")
                .collect(Collectors.toCollection(HashSet::new));

//        Set<String> set3 = ImmutableSet.of("a", "b", "c");
//       Set<String> names = Sets.newHashSet("Tom", "Jane", "Karen");

        //String namesJoined =
        List<String> list2 =
            list.stream()
//                .forEach(
//                        a -> a.value = a.value.toUpperCase()
//                );
                .map(a -> {
                        String q = a.value!=null ? a.value.toUpperCase() : "";
                        list.set(i++, new Wrap(q));
                        return q;
                    })
                .peek(System.out::println)
                .collect(Collectors.toList());
                //.collect(Collectors.joining(", "));


        //Set<Byte> set = Collections.unmodifiableSet(new HashSet<>(Arrays.asList((byte)1, (byte)2)));
        Set<Integer> set = //Collections.unmodifiableSet(
                new HashSet<>(Arrays.asList(1, 2, 3));
        //);
         int res = set.stream()
                //.map(a -> ++a)
                 .mapToInt(Integer::intValue).sum();
                //.peek(System.out::println)
                //.reduce(1, (a, b) -> a + b);


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
