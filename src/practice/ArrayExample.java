package practice;

import java.util.Arrays;

public class ArrayExample {

	public static void main(String[] args) {
		
		//Approach 1
		/*
		int [] a=new int[5];
		
		a[0]=100;
		a[1]=200;
		a[2]=300;
		a[3]=400;
		a[4]=500; */
		
		//Approach 2
		
		int[] a= {100,200,300,400,500,600};
		
		//Size of the length
		//System.out.println(a.length);
		
		//Get single value
		
		//System.out.println(a[2]);
		
		//Print all elements
		//Approach 1
		
		//System.out.println(Arrays.toString(a));
		
		//Approach 2
		
//		for(int i=0;i<a.length;i++) {
//			System.out.println(a[i]);
//		}
		
		//Enhanced for loop
		
		for(int x:a) {
			System.out.println(x);
		}
		
		
		
		

	}

}
