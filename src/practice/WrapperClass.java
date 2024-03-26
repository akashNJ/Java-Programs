package practice;

public class WrapperClass {

	public static void main(String[] args) {

		//Converting primitive into object

		int a=10;
		Integer num=a;

		//*****************************************

		//Converting object into primitive

		Integer value=100;
		int val=value;

		//****************************************

		//Data conversion - int to string

		int b=10;
		int c=20;
		System.out.println(b+c);//30
		
		String str1=String.valueOf(b);
		String str2=String.valueOf(c);
		
		System.out.println(str1+str2);//1020
		
		
		//*************************************
		
		
		//Data conversion - String to int
		
		String s="10";
		String s1="20";
		
		System.out.println(s+s1);//1020
		
		int x=Integer.parseInt(s);
		int y=Integer.parseInt(s1);
	
		
		
		System.out.println(x+y);//30
		
		
		
		










	}

}
