import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListConcept {

	private static final String String = null;

	public static void main(String[] args) {
		
		int a[] = new int[3]; //static -size is fixed
         
		a[0] = 20;
		a[1] = 10;
		a[2] = 30;
		
		System.out.println(a.length);
		
		ArrayList<String> s = new ArrayList<String>();
		s.add("Gauri");
		s.add("abcd");
		
		for(int i = 0; i<s.size(); i++) {
			System.out.println(s.get(i));
		}
				
		ArrayList <Integer>ar = new ArrayList<Integer>();
		ar.add(10);
		ar.add(30);
		ar.add(20);
		ar.add(20);
				
		System.out.println(ar.size());// size arrayList
		
		System.out.println(ar.get(2));// to get the value of index
		
		//to print all the values of arrayList
		//For loop
		//using iterator
		for(int i = 0; i<ar.size(); i++) {
			System.out.println(ar.get(i));
		}
		
		//ArrayList <E> ar3 = new ArrayList<E>(); for unknown data type
		Employee e1 = new Employee("Tom", 22, "automation");
		Employee e2 = new Employee("cat", 26, "auto");	
		Employee e3 = new Employee("lucky", 21, "dev");
		
		ArrayList<Employee> emp = new ArrayList<Employee>();
		//store the value in array
		emp.add(e1);
		emp.add(e2);
		emp.add(e3);
		
		//iterator to traverse the values:
		Iterator<Employee> it = emp.iterator();
		while(it.hasNext()) {
			Employee emp1 = it.next();
			System.out.println(emp1.name);
			System.out.println(emp1.age);
			System.out.println(emp1.dept);
		}
		System.out.println("=====");
		//addAll method
		ArrayList<String> s1 = new ArrayList<String>();
		s1.add("java");
		s1.add("selenium");	

		ArrayList<String> s2 = new ArrayList<String>();
		s2.add("java123");
		s2.add("selenium123");	
		
		s1.addAll(s2);
		//s2 will merge with s1
		for(int i=0; i<s1.size(); i++) {
			
			System.out.println(s1.get(i));
		}

		//removeall
		
		s1.removeAll(s2);
		// s2 will detah itself from s1
		for(int i=0; i<s1.size(); i++) {
			System.out.println(s1.get(i));
		}
		
		System.out.println("=================");

		//retainAll: only the common is printed
		ArrayList<String> s3 = new ArrayList<String>();
		s3.add("java");
		s3.add("selenium");	

		ArrayList<String> s4 = new ArrayList<String>();
		s4.add("java");
		s4.add("java123");
		s4.add("selenium123");
		
		s3.retainAll(s4);
		for(int i=0; i<s3.size(); i++) {
			System.out.println(s3.get(i));
		}
		
		
		
		
		
		
		
		
		
		
		
	}

}
