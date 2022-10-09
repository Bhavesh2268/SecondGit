package com.comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class Test {

	public static void main(String[] args) {
		
		List<Student> list = new ArrayList<>();
		list.add(new Student(101, "Rachel", "55000"));
		list.add(new Student(102, "Ross", "85000"));
		list.add(new Student(103, "Chandler", "75000"));
		list.add(new Student(104, "Joey", "65000"));
		list.add(new Student(105, "Monica", "45000"));
		list.add(new Student(106, "Phoebe", "35000"));
		
		Collections.sort(list, new MyComparator());
		
		Iterator itr = list.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}

	}
	
}
