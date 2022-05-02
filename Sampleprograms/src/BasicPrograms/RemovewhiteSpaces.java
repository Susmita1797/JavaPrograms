package BasicPrograms;

public class RemovewhiteSpaces {

	public static void main(String[] args) {

		String str = "Saket Saurav        is an Autom ation Engi ne      er";

		//without using replaceall Method
		char[] ch = str.toCharArray();

		StringBuffer sb = new StringBuffer();

		for(int i=0;i<ch.length;i++) {

			if(ch[i]!=' ') {

				sb.append(ch[i]);
			}
		}

		System.out.println(sb);

		//Using replaceall Method

		String str1 = str.replaceAll(" ", "");

		System.out.println(str1);
	}

}
