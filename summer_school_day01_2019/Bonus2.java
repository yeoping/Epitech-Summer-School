
public class Bonus2 {
	public static void myPrintComb2() {
		for (int i = 0; i < 100; i++) {
			for (int j = i + 1; j < 100; j++) {
				if (i < 10)
					System.out.print("0");
				System.out.print(i + " ");
				if (j < 10)
					System.out.print("0");
				System.out.print(j + ", ");
			}
		}
	}

	public static void main(String args[]) {
		myPrintComb2();
	}
}