package comparator;

import java.util.Comparator;
import java.util.Scanner;
import java.util.TreeSet;

import comparator.Employee;

public class Mainclass {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		class NameComparator implements Comparator<Object>{
			public int compare(Object o1,Object o2) {
				String name1=null;
				String name2=null;
				if(o1 instanceof Student)
					name1=((Student)o1).getStudentName();
				if(o1 instanceof Employee)
					name1=((Employee)o1).getEmployeeName();
				if(o2 instanceof Student)
					name2=((Student)o2).getStudentName();
				if(o2 instanceof Employee)
					name2=((Employee)o2).getEmployeeName();
				
				return name1.compareTo(name2);
			}
		}
	
		Comparator com=new  NameComparator();
		TreeSet<Object> al=new TreeSet<Object>(com);
		
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
