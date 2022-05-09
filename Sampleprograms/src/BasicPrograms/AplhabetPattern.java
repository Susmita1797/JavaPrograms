susmita susmita susmita
package BasicPrograms;

public class AplhabetPattern {

	public static void main(String[] args) {

		AplhabetPattern ap = new AplhabetPattern();

		//		ap.first();
		//		ap.second();
		ap.third();

	}

	//	A
	//	AB
	//	ABC
	//	ABCD
	//	ABCDE
	//	ABCDEF

	public void first() {

		int alpha=65;

		for(int i=0;i<=5;i++) {

			for(int j=0;j<=i;j++) {

				System.out.print((char)(alpha+j));

			}

			System.out.println();
		}
	}

	//	A
	//	BB
	//	CCC
	//	DDDD
	//	EEEEE
	//	FFFFFF

	public void second() {

		int alpha=65;

		for(int i=0;i<=5;i++) {

			for(int j=0;j<=i;j++) {

				System.out.print((char)(alpha+i));

			}

			System.out.println();
		}
	}

	//	A
	//	BC
	//	DEF
	//	GHIJ
	//	KLMNO
	//	PQRSTU

	public void third() {

		int alpha=65;
		int k=0;

		for(int i=0;i<=5;i++) {

			for(int j=0;j<=i;j++) {

				System.out.print((char)(alpha+k));
				k++;
			}

			System.out.println();
		}
	}
}
