package com.company;

import java.util.*;


public class Class0<T> {

	int val;

	public Class0(int val) {
		this.val = val;
	}

	public <T> T work() {
		return null;
	}

	public <T, R> R work2(T t) {
		return null;
	}

}



class Class1<T extends I0> extends Class0 {

	//Field.getGenericType() // Reflection

	private Class<T> typeParameterClass;

	private int a;

	public Class1(int val)
	{
		super(val);
		a = val;
	}

	Class1(Class<T> typeParameterClass) {
		this.typeParameterClass = typeParameterClass;
	}

	public T produce() throws InstantiationException, IllegalAccessException
	{
		T t = typeParameterClass.newInstance();
		return t;
	}

	public T work1_Class1(T t) {
		C1 c1 = new C1();
		c1.add(1);
		return (T)c1;
	}

}


class Class2<E, R> extends Class1 {

	public Class2()
	{
	}

	public Class2(Class typeParameterClass) {
		super(typeParameterClass);
	}

	public R work22(E p) {
		return null;
	}
}


class Class3 extends Class2 {

	public Class3() {
	}

	public Class3(Class typeParameterClass) {
		super(typeParameterClass);
	}
	//	public R work22(E p) { // ERROR!
//		return null;
//	}
}
