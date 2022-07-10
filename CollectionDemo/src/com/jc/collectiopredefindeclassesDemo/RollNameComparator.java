package com.jc.collectiopredefindeclassesDemo;

import java.util.Comparator;

public class RollNameComparator implements Comparator<Student> {

	@Override
	public int compare(Student s1, Student s2) {
		if ((s1.rollno == s2.rollno)) {
			return 0;
		} else if (s1.rollno > s2.rollno) { // 1 > 2
			return 1;
		} else {
			return -1;
		}
	}

}
