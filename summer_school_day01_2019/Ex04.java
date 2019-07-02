import java.util.ArrayList;

public class Ex04 {
	public static void printStringArrayList(ArrayList<String> stringArrayList) {
		for (int i = 0; i < stringArrayList.size(); i++) {
			if (i != stringArrayList.size() - 1)
				System.out.print(stringArrayList.get(i) + " ");
			else
				System.out.println(stringArrayList.get(i));
		}
	}

	public static void main(String args[]) {
		ArrayList<String> myStringArrayList = new ArrayList<String>() {
			{
				add("Love");
				add("is");
				add("a");
				add("Laserquest");
			}
		};
		printStringArrayList(myStringArrayList);
	}
}
