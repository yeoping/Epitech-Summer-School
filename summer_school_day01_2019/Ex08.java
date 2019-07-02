import java.util.ArrayList;

public class Ex08 {
	public static void myStringIsPresent(ArrayList<String> stringArrayList, String stringToFind) {
		for (int i = 0; i < stringArrayList.size(); i++)
			if (stringArrayList.get(i).equals(stringToFind)) {
				System.out.println(stringToFind);
				return;
			}
		System.out.println("I don't know this person.");
	}

	public static void main(String args[]) {
		ArrayList<String> myStringArrayList = new ArrayList<String>() {
			{
				add("Oriane");
				add("Tony");
				add("Alexandra");
				add("Basile");
				add("Maximilien");
			}
		};
		myStringIsPresent(myStringArrayList, "Tony");
		myStringIsPresent(myStringArrayList, "Romain");
	}
}