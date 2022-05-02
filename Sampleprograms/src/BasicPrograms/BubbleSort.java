package BasicPrograms;

import java.util.Arrays;

public class BubbleSort {

	public static void main(String[] args) {

		int[] a = {0,1,1,0,1,0};
		//int n=a.length-1;
        //time complexity = 0(n^2)
		
		for(int i=0;i<a.length-1;i++) {

			for(int j=0;j<a.length-i-1;j++) {

				if(a[j]>a[j+1]) {

					int temp=a[j];
					a[j]=a[j+1];
					a[j+1]=temp;

				}
			}

		}

		//Arrays.sort(a); //using inbuilt method
		//Arrays.parallelSort(a);
		//Arrays.sort(a.Collections.reverseOrder());  //reverse order method doesn't allow primitive data types
		System.out.println(Arrays.toString(a));
	}

}
