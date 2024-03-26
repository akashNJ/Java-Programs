package practice;

public class NestedIfElse {
	
	public static void main(String[] args) {
		
		int a=11;
		
		if(a%2==0) {
			if(a>50) {
				System.out.println("Number is largest");
			}
			else {
				System.out.println("Number is smallest");
			}
		}
		else {
			System.out.println("Number is odd");
		}
		
	}

}
