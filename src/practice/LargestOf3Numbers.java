package practice;

public class LargestOf3Numbers {

	public static void main(String[] args) {

		int a=100;
		int b=200;
		int c =300;
		
		//Method 1
		
		/*if(a>b && a>c) {
			System.out.println("Largest number is:"+a);
		}
		else if(b>a && b>c) {
			System.out.println("Largest number is:"+b);
		}
		else {
			System.out.println("Largest number is:"+c);
		}*/
		
		//Method 2
		
		int largest1=a>b?a:b;
		int largest2=largest1>c?largest1:c;
		System.out.println("Largest number is:"+largest2);
		
		
		

	}

}
