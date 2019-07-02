
public class Ex02 {
	public static String getAngryDog(int nbr) {
		String tmp = "";
		for (int i = 0; i < nbr; i++)
			tmp += "woof";
		return tmp;
	}

	public static void main(String args[]) {
		System.out.println(getAngryDog(3));
	}
}
