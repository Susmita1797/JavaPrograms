package BasicPrograms;
import java.util.Arrays;

public class CheckEqualityOfTwoDimenisonalArray {

	public static void main(String args[]) {

		/*
		 *  Please note that the same API applies to any type of arrays e.g.
		 *  boolean[][], byte[][], char[][], double[][], float[][], long[][], short[][], String[][] etc
		 */

		int[][] a1 = {{1, 2, 3}, {5, 19, 56}, {289, 100, 30}};
		int[][] a2 = {{1, 2, 3}, {5, 19, 56}, {289, 100, 30}};
		boolean flag = true;

		while(a1!= null && a2!=null) {

			if (a1.length != a2.length) {

				flag = false;

			}

			for (int i = 0; i < a1.length; i++) {

				if (Arrays.equals(a1[i], a2[i])) {

					flag = true;

				}

				else {

					flag=false;
				}

			}

			if(flag==true) {

				System.out.println("Arrays are equal");
			}

			else {

				System.out.println("Arrays are not equal");

			}
		}

		System.out.println("Arrays are not equal");
	}

}


