package com.company;

import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

class C1<T extends Collection>
{
	public void func(Class1<?> p) {
	}

	public void func1(Class1<? extends Set> p) {
	}

	public void func11(Class1<? super Set> p) {
	}

     void func2(T t) {
         //return t; // new Class3();
	     t.add("qq");
     }


	public Class1<? super Set<Integer>> funcC1_2(T p) { // Class1
//		 Class1 a = new Class1();
//		 Class0 b = a; // OK
//		 a = (Class1) b; //OK!

		Class1<HashSet<Integer>> c1 = p;
		Collection<Integer> col = c1.work1_Class1(new HashSet<>(Arrays.asList(1, 2)));
		Class1<Collection<Integer>> c11 = c1; // ERROR
		return c11;
	}

}

