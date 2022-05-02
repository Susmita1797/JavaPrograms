package BasicPrograms;

public class FirstTwoMaxInarray {

	public static void main(String[] args) {

		int a[]= {5,9,8,2,6,7,3};

		int max1=0,max2=0;

		for(int i=0;i<=a.length-1;i++) {

			if(max1<a[i]) {

				max2=max1;
				max1=a[i];

			}

			else if(max2<a[i]) {

				max2=a[i];
			}

		}

		System.out.println("The First Maximun number is:"+max1);
		System.out.println("The second Maximun number is:"+max2);

	}

}
