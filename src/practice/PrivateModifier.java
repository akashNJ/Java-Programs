package practice;


class Test{
	
	
	private int a=10;

	public int getA() {
		return a;
	}

	public void setA(int a) {
		this.a = a;
	}
}

public class PrivateModifier {

	public static void main(String[] args) {
		

		Test t=new Test();
		System.out.println(t.getA());
		t.setA(100);
		System.out.println(t.getA());
	}

}
