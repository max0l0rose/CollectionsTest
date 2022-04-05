package com.company;

import com.google.common.collect.Sets;
import lombok.Getter;
import lombok.Setter;
import org.checkerframework.checker.nullness.Opt;

import java.util.*;
import java.util.concurrent.ConcurrentHashMap;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

//@lombok.Getter
//@Setter
//class C {
//    int val;
//}


public class Main {

//    static public interface Funcable<? extends T> {
//        T func();
//        //<E> E func2(T t, E e); // OK
//    }


//    public static Optional func_getOpt() {
//        //Class2 c = t;
//        Optional op = Optional.of(new ArrayList<>());
//        return op;
//    }


    static boolean isSorted(int[] array, int length) {
        if (array == null || length < 2)
            return true;
        if (array[length - 2] > array[length - 1])
            return false;
        return isSorted(array, length - 1);
    }


    int producer(List<? extends Class1> list) {
        Class1 c = list.get(0);
        list.add(null);
        //list.add(new Object()); // ERROR
//        list.add(new Class0()); // ERROR
//        list.add(new Class1()); // ERROR
//        list.add(new Class2()); // ERROR
        return c.hashCode();
    }

    void consumer(List<? super Class1> list) {
        list.add(null);
        //list.add(new Object()); // ERROR
        //list.add(new Class0()); // ERROR
        list.add(new Class1());
        list.add(new Class2());
    }




    static int i = 0;
    public static void main(String[] args) throws InstantiationException, IllegalAccessException {

        TreeSet treeSet = new TreeSet<>(); // Objects must be comparable!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
        treeSet.add(new Simply());
        treeSet.add(new Simply());
        treeSet.add(1);
        treeSet.add(new Object());


        LinkedHashMap<Integer, String[]> linkedHashMap = new LinkedHashMap<>();
        linkedHashMap.put(1, new String[]{"aaa"});
        //String sss = linkedHashMap.toString();
        linkedHashMap.put(2, new String[]{"bbbbb"});
        linkedHashMap.put(2, new String[]{"ccccccc"});

        String[] qqq = linkedHashMap.get(2);

        linkedHashMap.merge(2, new String[]{"cccccc"},
                (a, b) -> Stream.concat(Arrays.stream(a), Arrays.stream(b)).toArray(size -> new String[size])
        );

//        TreeMap; // NOT HASH
////        IdentityHashMap;
////        EnumMap;
//        ConcurrentHashMap;
//        ConcurrentLinkedHashMap;

        HashMap<Simply, String> map001 = new HashMap<>(); // Object is not required to implement smth!
        map001.put(new Simply(), null);
        map001.put(new Simply(), null);
        map001.put(new Simply(), null); // ok
        map001.put(null, "r"); // ok
        map001.put(null, "r2"); // ok
        //map0.put(1, "q");



        HashMap<Integer, String> map0 = new HashMap<>();
        map0.put(4, null);
        map0.put(5, null); // ok
        map0.put(null, "r"); // ok
        map0.put(null, "r2"); // ok
        map0.put(1, "q");

        HashSet<Integer> set0 = new HashSet<>();
        set0.add(1);
        set0.add(1); //OK
        set0.add(null); // ok
        set0.add(null); // ok
        set0.add(4);



        //E e = new E(); // error

        // LOOL!!! TYPE ERASURE
        ArrayList<String> strings = new ArrayList<>();
        strings.add("qqq");
        ArrayList arrayList = new ArrayList();
        arrayList.add(1);
        //arrayList = strings; // Ok
        strings = arrayList; // Unchecked assignment
        strings.add("www");
        arrayList.add(2);


        Class1<C0> cla1 = new Class1(C0.class);
        C0 c0 = cla1.produce();


        //List<String>[] stringLists0 = new List<String>[1]; // comp ERROR!!!!
        List<String>[] stringLists0 = new List[1]; // OK !!!!!!!!!!!
        String[] stringLists = new String[1]; // OK
        String[] stringLists2 = {"q"}; // OK
        int[] ints = {1, 2}; // OK
        //Object[] oarr = (Object[])ints; // ERROR
            Integer[] integers = {1, 2}; // OK
            Object[] oarr = integers;
        Class0[] carr = new Class0[2]; // OK
        //Class1<I0>[] carr2 = new Class1<I0>[2]; // ERROR!!!
        Class1<I0>[] carr21 = new Class1[2]; // ERROR
        Class1[] carr22 = { new Class1() }; // OK

        oarr = carr22; // OK

        //Optional op = func_getOpt(new HashSet<>());


//        //List<Class0> lll = new ArrayList<Class0>();
        List<? super Class1> lll3 = new ArrayList<Class1>() {{
            //add(new Class0()); // ERROR
            add(new Class1()); // OK
            add(new Class2()); // OK
            //add(new Class3()); // OK
        }};
        lll3.add(new Class1()); // OK
        lll3.add(new Class2()); // OK
        //lll3.add(new Class0()); // ERROR
        lll3.add(null); // OK
        Class1 ccc1 = (Class1)lll3.get(0);

        //lll.add(new Class0());
        //lll.add(new Class1<>());
        List<? extends Class1> lll2 = new ArrayList<Class2>() {{
            //add(new Class1()); // ERROR
            add(new Class2()); // OK
            add(new Class3()); // OK
        }};
        //lll2.add(new Class0()); // ERROR
        //lll2.add(new Class1()); // ERROR
        //lll2.add(new Class2()); // ERROR
        lll2.add(null); // OK
        Class1 ddd = lll2.get(0);
//        //lll2 = lll;
//        lll3 = (List<? super Class1>)lll2;
//        //lll = lll3;
//
//        List<? extends Class1> circles2 = new ArrayList<>();
//        List<? extends Class0> shapes2 = circles2; // OK
//        circles2 = (List<? extends Class1>)shapes2; // OK



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




        Set<String> setA = new HashSet<String>(){{
            add("a");
            add("b");
            add("c");
        }};

        Set<String> setB = new HashSet<>(Arrays.asList("b", "c", "d"));

        Map<Integer, String> map2 = new HashMap<Integer, String>() {{
            put(1, "qqq");
        }};

        map0.merge(9, "val9", (value, newValue) -> value.concat(newValue));
        map0.get(9);             // val9


        // GUAVA

        Set<String> intersectSet = Sets.intersection(setA, setB);
        //assertEquals(setOf(2,4), intersectSet);

        Set<String> unionSet = Sets.union(setA, setB);
        //assertEquals(setOf(1,2,3,4,6,8), unionSet);


        // ---PECS---

//        List<? extends Set> listSet = new ArrayList<>();
//        listSet.add(new HashSet());
//        //HashSet s = listSet.get(0);


//        Funcable<Class1> r = c -> {
//            return new Class2();
//        };

//        ArrayList<? extends Class0> arrl = new ArrayList() {{
//            add(new Class1()); add(new Class2()); // WORKS here!!!!!!
//        }};
        //arrl.add(new Class3());

//        List<? extends Class1> list0 = arrl;
        //Class0 ell = arrl.get(0);
//        //list0.add(new Class1()); // CONSUMER // ERROR
////        Class1 q = list0.get(0); // PRODUCER



        GreenCollection greenCollection = new GreenCollection<>();
        Class1<? extends Set> class1 = greenCollection.func2(new HSI() {{ add(1); add(2); }});
//        //C1<Class2> c12 = new C1<>();
//        //c1 = c12; // ERROR!
//        List ss = (List)class1.work1_Class1(
//                Arrays.asList(2, 3).stream().collect(Collectors.toCollection(ArrayList::new))
//        );
//        ss.add("qq");



        List<Integer> together = Stream.of(Arrays.asList(1,2,3), Arrays.asList(11,12,13)) // Stream of List<Integer>
                .flatMap(q -> {
                    List<Integer> w = new ArrayList<>();
                    w.addAll(0, Arrays.asList(10,20,30));
                    w.addAll(0, q);
                    return w.stream();
                } ) //List::stream
                .map(integer -> integer + 1)
                .collect(Collectors.toList());

        boolean allStartsWithA = together.stream()
                //.anyMatch((s) -> s > 10);
                .noneMatch((s) -> s > 20);
                //.allMatch((s) -> s > 10);


        List<String> in = Arrays.asList("Qqq", "Ww", "Q", "W", "W", "Q");

        List out = in.stream().distinct().collect(Collectors.toList());

        Wrap v = new Wrap("Aabba1");
        //v.value = "Bbbb";

        Optional<Wrap> op = Optional.ofNullable(v);
        String t = op
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
        List<Byte> key2 = Collections.unmodifiableList(Arrays.asList(new Byte[] {1, 22}));
        boolean eq = key1.equals(key2);
        boolean f = key1 == key2;
        Map<List<Byte>, String> map = new HashMap<>();

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
//        Map<String, String> map = new HashMap<>();



        byte[] key41 = {1, 2, 3};
        byte[] key42 = {1, 2, 3};
        boolean eq4 = key41.equals(key42);
        boolean f4 = key41 == key42;
//        //key2[0] = 4;
////        paramsPassingTest(key1, key2);
//
        //Map<byte[], String> map = new HashMap<>();
        map.put(key1, "value1");
        map.put(key2, "value2");

        String retrievedValue1 = map.get(key1);
        String retrievedValue2 = map.get(key2);
        String retrievedValue22 = map.get(Collections.unmodifiableList(Arrays.asList(new Byte[] {1, 2})));
//        String retrievedValue3 = map.get(new byte[]{1, 2, 3});

        //vavr();

//        HashMap;
//        HashSet;
//        BlockingQueue;

//        byte[] barr = {1, 3, 5};
//        List list3 = Arrays.asList(barr); //1, (byte)2, 3. // OK
//        barr[0] = 20; // OK! list3 = view!
//        list3.set(0, (byte)30);


        Byte[] barr2 = {1, 3, 5};
        List<Byte> list32 = Arrays.asList(barr2); //1, (byte)2, 3. // OK
        barr2[0] = 20; // OK! list3 = view!
        list32.set(0, (byte)30); // OK
        //list32.add(0, (byte)31); // ERROR


        List listSrc = Arrays.asList(1, "qqq", null);
        java.util.List<Object> list4 = Collections.unmodifiableList(listSrc); //VIEW!!!!
        listSrc.set(0, 10); // OK
        //list4.set(0, 11); // UnsupportedOperationException
        //listSrc.add(21); // ERROR

        List<Integer> list5 = new ArrayList<>();// {{ add(1); }};
        list5.add(1);

        List<Byte> list2 = Arrays.asList(new Byte[] {1, 2, null, 3});
        list2.set(0, (byte)2);
        //list2.add((byte)3); // ERROR

        boolean sorted = isSorted(
                list2.stream().mapToInt(i->i).toArray(),
                list2.toArray().length
        );


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
