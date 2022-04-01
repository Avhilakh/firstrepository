package com.CollectionFramework;

import java.util.Arrays;
import java.util.*;

public class CollectionsClass {
 private CollectionsClass() {}
	public static void main(String[] args) {
		CollectionsClass obj = new CollectionsClass();
		List<Integer> list = Arrays.asList(1,2,3,4);//returns fixed size array, you can not change size of this list.
		System.out.println(list.size());
		System.out.println("===========================================");
		list.add(5);// Exception
		System.out.println(list.size());
	}

}
//class CheckPrivateConstructorInstantiate{
//	CollectionsClass obj1 = new CollectionsClass();//Any other class can not make object of class having 
//												   //private constructor. 
//}