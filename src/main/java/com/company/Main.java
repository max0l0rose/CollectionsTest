package com.company;

import lombok.Getter;
import lombok.Setter;

import java.sql.Array;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

//@lombok.Getter
//@Setter
//class C {
//    int val;
//}


public class Main {


    static boolean isSorted(int[] array, int length) {
        if (array == null || length < 2)
            return true;
        if (array[length - 2] > array[length - 1])
            return false;
        return isSorted(array, length - 1);
    }


    static int i = 0;
    public static void main(String[] args) {

        //E e = new E(); // error

//        List<Integer> intList = Arrays.asList(1, 3, 2, 6, 1, 2, 7, 8, 3);
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



//        List<Integer> together = Stream.of(Arrays.asList(1,2,3), Arrays.asList(11,12,13)) // Stream of List<Integer>
//                .flatMap(q -> {
//                    List<Integer> w = new ArrayList<>();
//                    w.addAll(0, Arrays.asList(10,20,30));
//                    w.addAll(0, q);
//                    return w.stream();
//                } ) //List::stream
//                .map(integer -> integer + 1)
//                .collect(Collectors.toList());

        List<String> in = Arrays.asList("Qqq", "Ww", "Q", "W", "W", "Q");

        List out = in.stream().distinct().collect(Collectors.toList());

        Wrap v = new Wrap("Aaaaa1");
        //v.value = "Bbbb";

        Optional<Wrap> op = Optional.ofNullable(v);
        String t = op
                //.map(Wrap::getValue)
                .filter(q -> q.getValue().contains("bb"))
                .map(Wrap::getValue)//.flatMap(Wrap::getValue)
                .orElseGet(() -> "qq");
                //.ifPresent(a -> System.out.println(a));

        int[] arr = {1,2,3};
        int sum = Arrays.stream(arr).sum();

        IntStream.range(0, arr.length)
                .forEach(i -> arr[i]++);

        int sum2 = Arrays.stream(arr).sum();


        List<Wrap> list = //Collections.unmodifiableSet(
                Arrays.asList(
                        new Wrap(),
                        new Wrap("aa"),
                        new Wrap() {{ setValue("bbb"); }},
                        null,
                        //new Wrap() {{ value = "eeee" }},
                        new Wrap("f")
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
//                        String val = (a != null && a.value != null) ? a.value.toUpperCase() : "";
//                        list.set(i++, new Wrap(val));
//                        //list2.add(v);
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
        List<Byte> key2 = Collections.unmodifiableList(Arrays.asList(new Byte[] {1, 2}));
        boolean eq = key1.equals(key2);
        boolean f = key1 == key2;
//        Map<List<Byte>, String> map = new HashMap<>();

        //key1.set(0, (byte) 4);
        Integer key21 = 1;
        Integer key22 = 1;
        boolean eq2 = key21.equals(key22);
        boolean f2 = key21 == key22;
        //Map<Integer, String> map = new HashMap<>();


        Integer key211 = 129;
        Integer key221 = 129;
        boolean eq21 = key211.equals(key221);
        boolean f21 = key211 == key221;
        //Map<Integer, String> map = new HashMap<>();


        String key31 = new String("qqq1");
        String key32 = new String("qqq1");
        boolean eq3 = key31.equals(key32);
        boolean f3 = key31 == key32;
        Map<String, String> map = new HashMap<>();



        byte[] key41 = {1, 2, 3};
        byte[] key42 = {1, 2, 3};
        boolean eq4 = key41.equals(key42);
        boolean f4 = key41 == key42;
//        //key2[0] = 4;
////        paramsPassingTest(key1, key2);
//
//        Map<byte[], String> map = new HashMap<>();
        map.put(key31, "value1");
        map.put(key32, "value2");

        String retrievedValue1 = map.get(key31);
        String retrievedValue2 = map.get(key32);
//        String retrievedValue3 = map.get(new byte[]{1, 2, 3});

        //vavr();

//        HashMap;
//        HashSet;
//        BlockingQueue;

        List<Byte> list2 = Arrays.asList(new Byte[] {1, 2, null, 3});
        list2.set(0, (byte)2);
        list2.add((byte)3);

        List list3 = Arrays.asList(1, (byte)2, 3.);
        //l2.add(4); // unsupported ERROR!
        java.util.List<Object> list4 = Collections.unmodifiableList(
                List source =
                Arrays.asList(1, "qqq", null)
        );

        List<Integer> list5 = new ArrayList<>();// {{ add(1); }};
        list5.add(1);

        boolean sorted = isSorted(
                list2.stream().mapToInt(i->i).toArray(),
                list2.toArray().length
        );



        //        HashMap<Integer, String> map = new HashMap<>();
//        map.put(1, "qqq");
//        map.put(4, null); // ok
//        map.put(null, "rrrr"); // ok

//        HashSet<Integer> set = new HashSet<>();
//        set.add(1);
//        set.add(4);
//        set.add(null); // ok

    }



    static class  Wrap implements Comparable<Wrap>//, Comparator
    {
        @Getter
        @Setter
        private String value;

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


    //        public int compareTo(Optional<Wrap> o) {
    //            System.out.printf("2: %s, %s", value, o);
    //            if (o == null) {
    //                System.out.println();
    //                return 0;
    //            }
    //            //int res = Objects.compare(value, o.value, String::compareTo);
    //            //System.out.printf(" = %d\r\n", res);
    //            return 0;
    //        }


        @Override
        public int compareTo(Wrap o) {
            String valIn = Optional.ofNullable(o)
                    .map(Wrap::getValue)
                    .orElse("");

            String val = Optional.ofNullable(value)
                    .orElse("");

//            if (o == null) {
//                System.out.println();
//                return 0;
//            }
            int res = Objects.compare(val, valIn, String::compareTo);
            System.out.printf("2: %s, %s = %d\n", value, o, res);
            return res;
        }

    }
}
