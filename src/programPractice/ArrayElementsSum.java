package programPractice;

public class ArrayElementsSum {

	public static void main(String[] args) {
		
		int[] a= {1,2,3,4,5,6,7};
		
		for(int i=0;i<a.length;i++) {
			for(int j=1;j<a.length;j++) {
				for(int k=2;k<a.length;k++) {
					if(a[i]+a[j]+a[k]==10) {
						System.out.println("Expected pair is:"+a[i]+" & "+a[j]+" & "+a[k]);
					}
				}
			}
		}
		

	}

}
