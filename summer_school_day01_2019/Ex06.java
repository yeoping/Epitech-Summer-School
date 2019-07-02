import java.util.ArrayList;

public class Ex06 {
	public static void printStringArrayList(ArrayList<String> stringArrayList) {
		for (int i = 0; i < stringArrayList.size(); i++) {
			if (i != stringArrayList.size() - 1)
				System.out.print(stringArrayList.get(i) + " ");
			else
				System.out.println(stringArrayList.get(i));
		}
	}

	public static ArrayList<String> myGetArgs(String... args) {
		ArrayList<String> al = new ArrayList<>();
		for (int i = 0; i < args.length; i++)
			al.add(args[i]);
		return al;
	}

	public static void main(String args[]) {
		ArrayList<String> myArgs = new ArrayList<String>(
				myGetArgs("Eternal", "Sunshine", "of", "the", "Spotless", "Mind"));
		printStringArrayList(myArgs);
	}
}
