package practice;

import java.util.Scanner;

public class ExceptionHandling {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);

		System.out.println("program is started");

		//ArithmeticException

		/*System.out.println("enter a number:");
		int num=sc.nextInt();
		try {
			System.out.println(100/num);
		}
		catch(Exception e){
			e.printStackTrace();
			System.out.println("entered into catch block");
		}
		finally{
			System.out.println("entered into finally block");
		}
		*/
		



		//ArrayIndexOutOfBoundsException

		/*int [] a= new int[3];
		System.out.println("enter number:");
		int num=sc.nextInt();
		System.out.println("enter position:");
		int position=sc.nextInt();
		a[position]=num;
		 */

		//NumberFormatException

		/*System.out.println("enter string:");
		String str=sc.next();
		int num = Integer.parseInt(str);
		System.out.println(num);
		 */


		System.out.println("program is finished");




	}

}
