package BasicPrograms;

public class AscAndDesc {

	public static void main(String[] args) {

		int a[] = {9751,4291,9643};
		int n1,n2,n3;
		boolean flag=true;

		for(int num: a) {

			n1=num; //3692

			while(n1>9) {

				n2=n1%10; //2
				n1=n1/10; //369
				n3=n1%10; //9

				if(n2>n3) {

					//flag=false;
					System.out.println(num);
					break;
				}

			}

		}

	}

}
