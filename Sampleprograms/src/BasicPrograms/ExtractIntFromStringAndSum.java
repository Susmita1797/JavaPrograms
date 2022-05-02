package BasicPrograms;

public class ExtractIntFromStringAndSum {

	public static void main(String args[]) {

		String str = "s1u2s3m4i5t6a7";
		int sum=0;

		StringBuilder sb = new StringBuilder(str);

		for(int i=0;i<str.length();i++) {

			if(Character.isDigit(str.charAt(i))) {

				Character.getNumericValue(str.charAt(i));
			}
		}

		System.out.println(sum);
	}
}
