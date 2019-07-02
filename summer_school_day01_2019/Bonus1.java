import java.util.ArrayList;

public class Bonus1 {
	public static void myPrintComb() {
		ArrayList<String> list = new ArrayList<String>();
		String digits = "";
		for (int i = 0; i < 1000; i++) {
			/* digits : 001 ... 999 */
			if (i < 10)
				digits = "00" + i;
			else if (i < 100)
				digits = "0" + i;
			else
				digits = Integer.toString(i);

			/* check if each char differs */
			if (digits.charAt(0) != digits.charAt(1) && digits.charAt(0) != digits.charAt(2)
					&& digits.charAt(1) != digits.charAt(2)) {
				/* if equal_num is 3, not add*/
				int equals_num = 0;
				
				/* check if digits's each char differs from all list number */
				for (int j = 0; j < list.size(); j++) {
					for (int c = 0; c < 3; c++)
						if(digits.indexOf(Integer.valueOf(list.get(j).charAt(c))) != -1)
							equals_num++;
					
					if(equals_num==3)
						break;
					else 
						equals_num=0;
				}
				if (equals_num != 3)
					list.add(digits);
			}
		}
		for (int i = 0; i < list.size(); i++)
			System.out.println(list.get(i));
	}

	public static void main(String args[]) {
		myPrintComb();
	}
}
