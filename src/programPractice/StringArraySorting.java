package programPractice;

import java.util.Arrays;

public class StringArraySorting {

	public static void main(String[] args) {
	
		String [] str= {"$100.30","$100.20","$100.10"};
		System.out.println(Arrays.toString(str));
		Arrays.sort(str);
		System.out.println(Arrays.toString(str));

	}

}
