package com.company;

import java.util.*;
import java.util.function.BinaryOperator;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

//@lombok.Getter
//@Setter
//class C {
//    int val;
//}


public class Main {

    static class Wrap
    //        implements Comparable
    {
        protected String value;

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

//        @Override
//        public int compareTo(Object o) {
////            if (!(o instanceof Wrap)
////                    //||
////                    //o == null
////                    //||
////                    //value == null
////            )
////                return 0;
//
//            int res = Objects.compare(value, ((Wrap) o).value, String::compareTo);
////            String v = null;
////            if (o != null)
////                v = ((Wrap) o).value;
////
////            int res2 = value.compareTo(v);
//            System.out.printf("%s, %s = %d\r\n", value, o, res);
//            return res;
//        }


        public int compareTo(Optional<Wrap> o) {
            System.out.printf("2: %s, %s", value, o);
            if (o == null) {
                System.out.println();
                return 0;
            }
            //int res = Objects.compare(value, o.value, String::compareTo);
            //System.out.printf(" = %d\r\n", res);
            return 0;
        }

    }


    static int i = 0;
    public static void main(String[] args) {

//        List<Integer> intList = Arrays.asList(1, 3, 2, 6, 1, 2, 7, 8);
//
//        Map<Boolean, List<Integer>> groups = intList.stream().collect(Collectors.partitioningBy(s -> s >= 6));
//        List<List<Integer>> subSets = new ArrayList<>(groups.values());
//
//        List<Integer> firstPartition = subSets.get(0);
//        List<Integer> lastPartition = subSets.get(1);



//        for (E e : E.values()){
//            System.out.println(e.name() + " " + e.getVal1());
//        }
//
////        for (E e : E.names()){ //error!
////            System.out.println(e.name() + " " + e.getVal1());
////        }
//
//        for (E e : EnumSet.allOf(E.class)) {
//            System.out.println(e.name() + " " + e.getVal1());
//        }
//
//        EnumSet<E> es = EnumSet.of(E.A, E.B);
//        es.add(E.C);
//        boolean r = es.contains(E.B);
//        boolean r2 = es.contains(E.D);
//
//        es.forEach(a -> System.out.println(a.name() + " " + a.getVal1()));




//        Set<String> set = new HashSet<String>(){{
//            add("a");
//            add("b");
//            add("c");
//        }};

        //Set<String> set1 = new HashSet<>(Arrays.asList("a", "b", "c"));
//        Map<Integer, String> map0 = new HashMap<Integer, String>() {{
//            put(1, "qqq");
//        }};


        int[] arr = {1,2,3};
        int sum = Arrays.stream(arr).sum();

        IntStream.range(0, arr.length)
                .forEach(i -> arr[i]++);

        int sum2 = Arrays.stream(arr).sum();


        List<Wrap> list = //Collections.unmodifiableSet(
                Arrays.asList(
                        new Wrap("aa"),
                        new Wrap() {{ value = "bbb"; }},
                        null,
                        new Wrap("eeee"),
                        new Wrap("f"),
                        new Wrap("ccc")
                );
        //);

//        Set<String> set2 = Stream.of("One", "Two", "Three")
//                .collect(Collectors.toCollection(HashSet::new));
//
////        Set<String> set3 = ImmutableSet.of("a", "b", "c");
////       Set<String> names = Sets.newHashSet("Tom", "Jane", "Karen");

        //String namesJoined =
        //List<String> list2 = new ArrayList<>();

            Optional<Wrap> m = list.stream()
//                    .peek(a -> {
//                        String v = (a != null && a.value != null) ? a.value.toUpperCase() : "";
//                        list.set(i++, new Wrap(v));
//                        list2.add(v);
//                        //return q;
//                    })//.max((a, b) -> a.value.compareTo(b.value));

                .collect(
                        Collectors.maxBy((a, b) -> Objects.compare(a, b, Wrap::compareTo))//.joining(", ")
                );


        //Set<Byte> set = Collections.unmodifiableSet(new HashSet<>(Arrays.asList((byte)1, (byte)2)));
        Set<Integer> set = //Collections.unmodifiableSet(
                new HashSet<>(Arrays.asList(1, 2, 3));
        //);
        int res2 = set.parallelStream()
                //.map(a -> ++a)
                .map(a -> ++a)
                .reduce(0, Integer::max);

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
