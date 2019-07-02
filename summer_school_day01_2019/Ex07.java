import java.util.ArrayList;

public class Ex07 {
	public static int myFindLowestNumber(ArrayList<Integer> intArrayList) {
		int min_idx = 0;
		for (int i = 1; i < intArrayList.size(); i++)
			if (intArrayList.get(min_idx) > intArrayList.get(i))
				min_idx = i;
		return intArrayList.get(min_idx);
	}

	public static void main(String args[]) {
		ArrayList<Integer> myIntArrayList = new ArrayList<Integer>();
		myIntArrayList.add(713705);
		myIntArrayList.add(42);
		myIntArrayList.add(1337);
		myIntArrayList.add(314);

		int lowest = myFindLowestNumber(myIntArrayList);
		System.out.println(lowest);
	}
}
