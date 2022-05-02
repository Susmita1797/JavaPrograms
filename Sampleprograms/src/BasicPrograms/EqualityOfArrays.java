package BasicPrograms;

import java.util.Arrays;

public class EqualityOfArrays {

	public static void main(String[] args) {

 		int a[]= {1,2,3,4,5};
    	int b[]= {1,2,3,4};
		

		boolean flag = true;

		while(a.length==b.length) {

			for(int i=0;i<=a.length-1;i++) {

				for(int j=0;j<=a.length-1;j++) {

					if(a[i]==b[i]) {

						flag = true;

					}

					else {

						flag = false;
					}
				}

			}



			if(flag==true) {

				System.out.println("Arrays are Equal");
			}

			else {

				System.out.println("Arrays are not Equal");
			}
		}

		System.out.println("Arrays are not equal");}

}


//if(Arrays.equals(a, b)==true) {
//
//	System.out.println("Arrays are Equal");
//}
//
//else {
//
//	System.out.println("Arrays are not Equal");
//}