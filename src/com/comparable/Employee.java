package com.comparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

//1. Suppose I have Employee class that containing I'd, name and city now I want to sort the data based on comparable interface by using name.

public class Employee implements Comparable<Employee>{
	
	int id;
	String name;
	String city;
	
	
	public Employee(int id, String name, String city) {
		super();
		this.id = id;
		this.name = name;
		this.city = city;
	}
	
	
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", city=" + city + "]";
	}


	public static void main(String[] args) {
		
		List<Employee> list = new ArrayList<>();
		list.add(new Employee(101, "John", "Winterfell"));
		list.add(new Employee(102, "Tyrion", "Kings Landing"));
		list.add(new Employee(103, "Margery", "High Garden"));
		list.add(new Employee(104, "Daenerys", "Meeran"));
		list.add(new Employee(105, "Bran", "Sky"));
		
		Collections.sort(list);
		
		Iterator<Employee> itr = list.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
		
	}
	@Override
	public int compareTo(Employee e) {
		return this.name.compareTo(e.name);
		
	}
}
