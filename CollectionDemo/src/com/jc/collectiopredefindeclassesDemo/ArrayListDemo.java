package com.jc.collectiopredefindeclassesDemo;

import java.util.ArrayList;
import java.util.Vector;

public class ArrayListDemo {
	public static void main(String[] args) {
		Vector<String> v=new Vector<>();
		for (int i = 0; i <=9; i++) {
			v.add("elemenr-"+i);
		}
		ArrayList<String> a=new ArrayList<>();
		a.add("Chandu");
		a.addAll(v);
		a.remove("Chandu");
		//a.clear();
		System.out.println(a);
		
		
		
		

	}

}
