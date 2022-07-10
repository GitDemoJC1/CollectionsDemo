package com.jc.collectiopredefindeclassesDemo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class CompartorDemo {
	@SuppressWarnings("unchecked")
	public static void main(String args[]) {

		List<Student> al = new ArrayList<Student>();
		al.add(new Student(101, "Vijay", 23));
		al.add(new Student(106, "Ajay", 27));
		al.add(new Student(105, "Jai", 21));
		System.out.println("Before Sorting ");
		for (Student student : al) {
			System.out.println(student);
		}
		System.out.println("Sorting by Age");

		Collections.sort(al, new Comparator<Student>() {
			@Override
			public int compare(Student o1, Student o2) {
				return o1.name.compareTo(o2.name);
			};
		});
		System.out.println();
		System.out.println("After Name Sorting ");
		for (Student student : al) {
			System.out.println(student);
		}
		/*
		 * System.out.println(); Collections.sort(al, new RollNameComparator());
		 * System.out.println("After RollNO Sorting "); for (Student student : al) {
		 * System.out.println(student); }
		 * 
		 * for (Student st : al) { System.out.println(st.rollno + " " + st.name + " " +
		 * st.age); }
		 * 
		 * System.out.println("Sorting by age");
		 * 
		 * Collections.sort(al, new AgeComparator()); for (Student st : al) {
		 * System.out.println(st.rollno + " " + st.name + " " + st.age); }
		 */
	}
}