package BasicPrograms;

public class DuplicateElementsInArray {

	public static void main(String[] args) {

		//int a[] = {5,4,2,8,9,1,3,5,1,4,8,9,3};
		String a[] = {"ss","sv","su","ss","sv"};

		System.out.print("The Duplicate Elements present in the array are: ");

		for(int i=-0;i<=a.length-1;i++) {

			for(int j=i+1;j<=a.length-1;j++) {

				if(a[i]==a[j]) {

					System.out.print(a[i]+",");
				}

			}
		}
	}
}
