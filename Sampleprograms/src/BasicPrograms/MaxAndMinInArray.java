package BasicPrograms;

public class MaxAndMinInArray {

	public static void main(String[] args) {

		int[] a= {5,9,7,1,3};

		int max=0,min=0;

		for(int i=0;i<=a.length-1;i++) {

			if(a[i]>max) {

				max=a[i];
			}

			else  {

				min=a[i];
			}
			
		}
		
		System.out.println("The Maximum number in the Array is:"+max);
		System.out.println("The Manimum number in the Array is:"+min);

	}
}
