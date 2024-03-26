package practice;

class A{

	void m1() {
		System.out.println("this is m1 method from class A");
	}




}


class B extends A{

	void m1() {
		System.out.println("this is m1 method from class B");
	}

}


public class Main extends B{

	public static void main(String[] args) {





		//Non static method
		A a=new A();
		a.m1();  //classs A

		B b=new B();
		b.m1();



		//class B

		A a1=new B();
		a1.m1(); // class B




		//static method

		/*A a=new A();
		a.m1();  // class A

		B b=new B();
		b.m1(); //class B

		A a1=new B();
		a1.m1(); // class A*/

		//		A a=new A();
		//		a.m1(); //class A
		// 
		//		B b=new B();
		//		b.m1(); // class A
		//		
		//		A a1=new A();
		//			a1.m1();//class A









	}

}


