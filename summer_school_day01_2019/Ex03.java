import java.util.ArrayList;

public class Ex03 {
	public static void printIntArrayList(ArrayList<Integer> intArrayList) {
		for (int i = 0; i < intArrayList.size(); i++) {
			if (i != intArrayList.size() - 1)
				System.out.print(intArrayList.get(i) + " ");
			else
				System.out.println(intArrayList.get(i));
		}
	}

	public static void main(String args[]) {
		ArrayList<Integer> myIntArrayList = new ArrayList<Integer>();
		myIntArrayList.add(1);
		myIntArrayList.add(2);
		myIntArrayList.add(3);
		printIntArrayList(myIntArrayList);
	}
}
