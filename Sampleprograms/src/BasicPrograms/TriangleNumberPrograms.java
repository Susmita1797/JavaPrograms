package BasicPrograms;

public class TriangleNumberPrograms {

	public static void main(String[] args) {
		
		TriangleNumberPrograms tp = new TriangleNumberPrograms();
		
//		tp.firstProgram();
//		tp.secondProgram();
//		tp.thirdProgram();
//		tp.fourthProgram();
//		tp.fifthProgram();
//		tp.sixthProgram();
//		tp.seventhProgram();
		tp.eigthProgram();
		

	}
	
//	1 2 3 4 
//	5 6 7 
//	8 9 
//	10 
	public void firstProgram() {
		
		int k=1;
		
		for(int i=1;i<=5;i++) {
			
			for(int j=1;j<=5-i;j++) {
				
				System.out.print(k+" ");
				k++;
				
			}
			
			System.out.println();
		}
		
	}
	
//	1 
//	2 3 
//	4 5 6 
//	7 8 9 10 

public void secondProgram() {
		
		int k=1;
		
		for(int i=1;i<=4;i++) {
			
			for(int j=1;j<=i;j++) {
				
				System.out.print(k+" ");
				k++;
				
			}
			
			System.out.println();
		}
		
	}

//1 
//2 2 
//3 3 3 
//4 4 4 4 
//5 5 5 5 5 

public void thirdProgram() {
	
	for(int i=1;i<=5;i++) {
		
		for(int j=1;j<=i;j++) {
			
			System.out.print(i+" ");
			
		}
		
		System.out.println();
	}
	
}

//1 
//1 2 
//1 2 3 
//1 2 3 4 
//1 2 3 4 5 

public void fourthProgram() {
	
	for(int i=1;i<=5;i++) {
		
		for(int j=1;j<=i;j++) {
			
			System.out.print(j+" ");
			
		}
		
		System.out.println();
	}
	
}

//    1 
//   2 2 
//  3 3 3 
// 4 4 4 4 
public void fifthProgram() {
	
	for(int i=1;i<=4;i++) {
		 	
		for(int j=5;j>=i;j--) {
			
			System.out.print(" ");
			
		}
		
		for(int k=1;k<=i;k++) {
			
			System.out.print(i+" ");
		}
		
		System.out.println();
	}
	
}

//   1 
//  1 2 
// 1 2 3 
//1 2 3 4 

public void sixthProgram() {
	
	for(int i=1;i<=4;i++) {
		 	
		for(int j=5;j>=i;j--) {
			
			System.out.print(" ");
			
		}
		
		for(int k=1;k<=i;k++) {
			
			System.out.print(k+" ");
		}
		
		System.out.println();
	}
	
}

//   1 
//  2 3 
// 4 5 6 
//7 8 9 10 
public void seventhProgram() {
	
	int count=1;
	for(int i=1;i<=4;i++) {
		 	
		for(int j=5;j>=i;j--) {
			
			System.out.print(" ");
			
		}
		
		for(int k=1;k<=i;k++) {
			
			System.out.print(count+" ");
			count++;
		}
		
		System.out.println();
	}
	
}

//3 
//6 9 
//12 15 18 
//21 24 27 30 

public void eigthProgram() {
	
	int k=1;
	for(int i=1;i<=4;i++) {
		 	
		for(int j=1;j<=i;j++) {
			
			System.out.print((3*k)+" ");
			k++;
			
		}
		
		System.out.println();
	}
	
}
}
