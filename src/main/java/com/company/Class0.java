package com.company;

import java.util.*;

public class Class0 extends ArrayList {
	public <T> T work(T t) {
		return t;
	}

	public <T, R> R work2(T t) {
		return null;
	}

}



class Class1<T extends Collection> extends Class0 {

	public T work1_Class1(T t) {
		Collection<Integer> list = new ArrayList<Integer>(t);
		list.add(3);
		return (T) list; // new ArrayList<Integer>() {{ add(1); }};
	}

}


class Class2<E, R> extends Class1 {
	public R work22(E p) {
		return null;
	}
}


class Class3 extends Class2 {
//	public R work22(E p) { // ERROR!
//		return null;
//	}
}
