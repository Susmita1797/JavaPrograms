package BasicPrograms;

public class SearchElementInArray {

	public static void main(String[] args) {
//		
//		int a[] = {1,2,3,4,5};
//		
//		for(int i=0;i<=a.length-1;i++) {
//			
//			if(a[i]==3) {
		
		String a[] = {"ss","su","sv"};
		
		for(int i=0;i<=a.length-1;i++) {
			
			if(a[i]=="sv") {
				
				System.out.println("Element found at index: "+i);
				
			}
		}

	}

}
