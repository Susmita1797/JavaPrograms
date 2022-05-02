package BasicPrograms;

public class CheckSubtstringInString {

	public static void main(String[] args) {

		String str ="This is Susmita";

		String s="Susmita";
		//
		//		if(str.contains(s)) {
		//
		//			System.out.println(s+"is present in"+str);
		//
		//		}
		//		else {
		//
		//			System.out.println(s+" is not present in "+str);
		//
		//		}

		if(str.lastIndexOf(s)!=-1) {

			System.out.println(s+"is present in"+str);
		}

		else {

			System.out.println(s+" is not present in "+str);
		}
	}

}
