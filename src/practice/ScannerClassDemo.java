package practice;

import java.util.Scanner;

public class ScannerClassDemo {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number:");
		int a=sc.nextInt();
		System.out.println("enter the string:");
		String str=sc.next();
		System.out.println(a);
		System.out.println(str);


	}

}
