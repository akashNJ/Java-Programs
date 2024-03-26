package programPractice;

public class SingleDigitSum {

	public static void main(String[] args) {

		int num=444;
		while(num>9) {
			int sum=0;
			while(num!=0) {
				sum=sum+num%10; //1
				num=num/10; //0
			}
			num=sum;
		}
		System.out.println(num);



	}
}
