package BasicPrograms;

public class RemoveIntFromString {

	public static void main(String[] args) {

		String str = "s1u2s3m4i5t6a7";
		String result="";
		
		RemoveIntFromString rs = new RemoveIntFromString();
		//rs.withoutUsingreplaceAll(str, result);
		rs.usingReplaceAll(str, result);


	}


	public void withoutUsingreplaceAll(String str,String result) {

		for(int i=0;i<=str.length()-1;i++) {

			if(!Character.isDigit(str.charAt(i))) {

				result+=str.charAt(i);
			}
		}

		System.out.println(result);
	}
	
	public void usingReplaceAll(String str,String result) {
		
		result = str.replaceAll("[^a-zA-Z]", "");
		
		System.out.println(result);
	}
}
