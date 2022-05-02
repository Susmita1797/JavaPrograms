package BasicPrograms;

public class TriangleStarPrograms {

	public static void main(String[] args) {

		TriangleStarPrograms ts = new TriangleStarPrograms();

		//		ts.rightAngleTriangle();
		//		ts.leftAngleTriangle();
		//		ts.triangle();
		//		ts.reverseTriangle();
		//		ts.reverseRightAngleTriangle();
		//		ts.reverseLeftAngleTriangle();
		//		ts.rectangle();
		//		ts.rightTrianglewithPlus2();
		ts.reverseTrianglewithPlus2();

	}

	//	*
	//	**
	//	***
	//	****
	//	*****

	public void rightAngleTriangle() {

		for(int i=1;i<=5;i++) {

			for(int j=1;j<=i;j++) {

				System.out.print("*");
			}

			System.out.println();
		}

	}

	//	      *
	//	    * *
	//	  * * *
	//  * * * *
	//* * * * *

	public void leftAngleTriangle() {

		for(int i=1;i<=5;i++) {

			for(int j=5;j>=i;j--) {

				System.out.print(" ");
			}

			for(int k=1;k<=i;k++) {

				System.out.print("*");
			}

			System.out.println();
		}

	}

	//    *
	//   * *
	//  * * *
	// * * * *
	//* * * * *
	public void triangle() {

		for(int i=1;i<=5;i++) {

			for(int j=5;j>=i;j--) {

				System.out.print(" ");
			}

			for(int k=1;k<=i;k++) {

				System.out.print("*"+" ");
			}

			System.out.println();
		}

	}

	//* * * * * 
	//* * * * 
	// * * * 
	//  * * 
	//   * 

	public void reverseTriangle() {

		for(int i=1;i<=5;i++) {

			for(int j=1;j<=i;j++) {

				System.out.print(" ");
			}

			for(int k=5;k>=i;k--) {

				System.out.print("*"+" ");
			}	

			System.out.println();
		}
	}

	//* * * * * 
	//* * * * 
	//* * * 
	//* * 
	//* 

	public void reverseRightAngleTriangle() {

		for(int i=1;i<=5;i++) {

			for(int j=5;j>=i;j--) {

				System.out.print("*"+" ");
			}

			System.out.println();
		}
	}

	//*
	//**
	//***
	//****
	//*****
	public void reverseLeftAngleTriangle() {

		for(int i=1;i<=5;i++) {

			for(int j=5;j>=i;j--) {

				System.out.print(" ");
			}

			for(int k=1;k<=i;k++) {

				System.out.print("*");
			}	

			System.out.println();
		}
	}

	//* * * * *
	//* * * * *
	//* * * * *
	//* * * * *
	//* * * * *

	public void rectangle() {

		for(int i=1;i<=5;i++) {

			for(int j=1;j<=5;j++) {

				System.out.print("*");
			}
			System.out.println();
		}
	}


	//*
	//***
	//*****
	//*******
	//*********

	public void rightTrianglewithPlus2() {

		int k=1;
		for(int i=1;i<=5;i++) {

			for(int j=1;j<=k;j++) {

				System.out.print("*");

			}

			System.out.println();
			k=k+2;
		}
	}

	//	*******
	//	*****
	//	***
	//	*

	public void reverseTrianglewithPlus2() {

		int k=7;
		for(int i=0;i<=5;i++) {

			for(int j=1;j<=k;j++) {

				System.out.print("*");
			}

			System.out.println();
			k=k-2;
		}
	}
}




