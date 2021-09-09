package com.company;

import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

class GreenCollection<T extends Collection>
{
	public void func(Class1<?> p) {
	}

	public void func1(Class1<? extends Set> p) {
	}

//	public void func11(Class1<? super Set> p) { // ERROR
//	}

     void func12(T t) {
         //return t; // new Class3();
	     t.add("qq");
     }



	public Class1<? extends Set> func2(T t) { // Class1
//		 Class1 b = new Class1();
//		 Class0 a = b; // OK
//		 b = (Class1)a; //OK!

//		if (t instanceof HashSet) {
//			int a = 1;
//		}

		HSI hsi = (HSI)t;
		Class1<? extends Set> c1 = new Class1<HSI>(HSI.class);
		Collection col = c1.work1_Class1(null); //new HashSet<>(Arrays.asList(1, 2)
		col.add("qq");
		//Class1<? extends Collection> c11 = c1; // ERROR
		return c1;
	}

}

