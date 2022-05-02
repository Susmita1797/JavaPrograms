package BasicPrograms;

public class CommonElementsFromAnArray {

	public static void main(String[] args) {
		
//		String a[] = {"ss","sv","su","ss","sv"};
//		String b[] = {"ss","sus","siri","sv","asd"};
		
		int a[]= {1,2,3,4,5};
    	int b[]= {1,2,3,4,9};
		
		System.out.println("The common elemnts in the two Arrays are:");
		
		for(int i=0;i<=a.length-1;i++) {
			
			for(int j=0;j<=a.length-1;j++) {
				
				if(a[i]==b[j]) {
					
					System.out.print(a[i]+" ");
				}
			}
		}

	}

}
