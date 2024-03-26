package practice;

interface XYZ{
	
	int a=10;
	
}


public class InterfaceExample implements XYZ{
	
	public static void main(String[] args) {
		
		InterfaceExample ie=new InterfaceExample();
		int num = ie.a;
		 System.out.println(num);
		
		 
	}

	

}
