package practice;

import java.util.HashSet;

public class HashSetExample {

	public static void main(String[] args) {
		
		
		HashSet hs=new HashSet();
		
		hs.add(100);
		hs.add("welcome");
		hs.add(true);
		hs.add(20.5);
		
		//insertion order is not maintained
		
		System.out.println(hs);
		
		//size of hashset
		
		System.out.println(hs.size());
		
		//remove method
		
		hs.remove(20.5);
		System.out.println(hs);
		
		//reading all value from hashset
		
		for(Object x:hs) {
			System.out.println(x);
		}

	}

}
