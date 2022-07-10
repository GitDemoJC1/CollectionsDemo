package com.jc.collectiopredefindeclassesDemo;

import java.util.Stack;

public class StackDemo {
	public static void main(String[] args) {
		Stack<String> names = new Stack<>();
		for (int i = 0; i <10; i++) {
			names.push("Virat"+i);
		}
		/*
		 * names.push("Virat"); names.push("Sandi"); names.push("Dhoni");
		 */

		System.out.println("Stack values::"+names);
		System.out.println(names.peek());
		System.out.println();
		
		
		names.insertElementAt("chaitu", 2);
		System.out.println("Stack values::"+names);
		names.pop();
		System.out.println("Stack values::"+names);
		System.out.println(names.peek());
		System.out.println("First Element:"+names.firstElement());
		//System.out.println("last Element::"+names.get(names.size()));
		
		System.out.println("DefaultCapacity::"+names.capacity());
		
	}

}
