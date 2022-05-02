package BasicPrograms;

public class FirstTwoMinInarray {

	public static void main(String[] args) {

		int a[]= {5,9,8,2,4,3,6,7,1};

		int min1=a[0],min2=a[1];

		for(int i=0;i<=a.length-1;i++) {

			if(min1>a[i]) {

				min2=min1;
				min1=a[i];

			}

			else if(min2>a[i] && min1<a[i]) { //&& min1<a[i]

				min2=a[i];
			}

		}

		System.out.println("The First Minimum number is:"+min1);
		System.out.println("The second Minimum number is:"+min2);

	}

}
