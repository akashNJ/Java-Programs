package practice;

import java.util.ArrayList;

public class ArraylistExample {

	public static void main(String[] args) {
		
		ArrayList al=new ArrayList();
		
		//adding elements in arraylist
		al.add(100);
		al.add(10.5);
		al.add("welcome");
		al.add(true);
		
		//size of arraylist
		
		System.out.println(al.size());
		
		//remove element from arraylist
		
		al.remove(0);
		
		//print all element from arraylist
		
		System.out.println(al);
		
		//insert element in arraylist at particular index
		
		al.add(2, "java");
		System.out.println(al);
		
		//get method
		
		System.out.println(al.get(1));
		
		//print all elements from arraylist
		
		for(Object x:al) {
			System.out.println(x);
		}
		
		//clear method
		
		al.clear();
		System.out.println(al);
		
		
		
		
		

	}

}
