package practice;

public class TwoDimArray {

	public static void main(String[] args) {


		//Approach 1

		/* int [][] a=new int[3][2];

		a[0][0]=100;
		a[0][1]=200;
		a[1][0]=300;
		a[1][1]=400;
		a[2][0]=500;
		a[2][1]=600;

		//Print length of rows and column
		 
		System.out.println(a.length);
		System.out.println(a[0].length);*/ 


		int[][] a= {{100,200},{300,400},{500,600}};
		
		//Print single digit from array
		
		//System.out.println(a[2][1]);

		//Reading data from array with simple for loop

		/*for(int r=0;r<a.length;r++) {
			for(int c=0;c<a[r].length;c++) {
				System.out.print(a[r][c]+" ");
			}
			System.out.println();
		}*/
		
		//Reading data from array with enhanced for loop
		
		for(int[] x:a) {
			for(int y:x) {
				System.out.print(y+" ");
			}
			System.out.println();
		}
		
		

	}

}
