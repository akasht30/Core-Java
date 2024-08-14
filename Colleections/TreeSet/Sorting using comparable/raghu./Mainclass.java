package org;

import java.util.Scanner;
import java.util.TreeSet;

import comparator.Employee;

public class Mainclass {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
	
		
		TreeSet<Object> al=new TreeSet<Object>();
		
		al.add(new Student(109,"Ganesh",80.0));
		al.add(new Student(108,"Jay",70.0));
		al.add(new Student(107,"Rakshith",90.0));
		
		al.add(new Employee(102,"Akash",8000));
		al.add(new Employee(420,"Gane",10000));
		al.add(new Employee(340,"Jagadish",90000));
		
		for(Object obj:al) {
			System.out.println(obj);
		}
		
	}
}
