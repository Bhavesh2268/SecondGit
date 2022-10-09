package com.comparator;

import java.util.Comparator;

public class MyComparator implements Comparator<Student>{

	@Override
	public int compare(Student s1, Student s2) {
		 return -s1.salary.compareTo(s2.salary);
	}

}
