package BasicPrograms;

import java.util.Arrays;

public class InsertionSort {

	public static void main(String[] args) {

		int a[] = {7,8,1,3,2};

		for(int i=1;i<a.length;i++) {

			int current =a[i];
			int j=i-1;

			while(j>=0 && current<a[j]) {

				a[j+1] =a[j];

				j--;

			}

			a[j+1]=current;

		}
		System.out.println(Arrays.toString(a));
	}

}
