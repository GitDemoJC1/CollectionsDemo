package com.jc.collectiopredefindeclassesDemo;

import java.util.Hashtable;

public class HashTableDemo {
	public static void main(String[] args) {
		Hashtable<Object, Object> ht = new Hashtable<>();
		ht.put("chaitu", 25);
		ht.put("jaya", 40);
		ht.put("ashok", 40);
		ht.put("bhanu", 18);
		System.out.println(ht.size());
		System.out.println(ht.toString());
		//93110994 ->ashok
		//93700066 ->bhanu
		//3254911 -> chaitu
		//3254911 -> jaya
		System.out.println();
		ht.put("bhanu", 38);
		System.out.println(ht.toString());
		System.out.println(ht.size());

	}

}
