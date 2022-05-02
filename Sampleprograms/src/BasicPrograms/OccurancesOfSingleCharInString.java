package BasicPrograms;

public class OccurancesOfSingleCharInString {

	public static void main(String[] args) {

		String str = "Susmita";
		int count =0;
		//char ch='s';

		for(char c:str.toCharArray()) {

			if(str.charAt(c)=='s') {

				count++;
			}
		}

		//Another approach : int count = str.length()-str.replace("s","").length();

		System.out.println(count);

	}

}
