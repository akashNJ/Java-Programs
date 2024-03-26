package practice;

import java.util.HashMap;

public class HashMapExample {

	public static void main(String[] args) {
		
		HashMap<Integer,String> hm=new HashMap<Integer,String>();
		
		hm.put(101, "john");
		hm.put(102, "scot");
		hm.put(103, "tim");
		hm.put(104, "mick");
		
		//print all elements
		System.out.println(hm);
		
		//size of hashmap
		System.out.println(hm.size());
		
		//remove method
		hm.remove(101);
		System.out.println(hm);
		
		//get method
		System.out.println(hm.get(102));
		
		//keyset method
		System.out.println(hm.keySet());
		
		//print all values from hashmap
		
		
		for(Integer x:hm.keySet()) {
			System.out.println(x+"  "+hm.get(x));
		}
		
		hm.clear();
		System.out.println(hm);

	}

}
