package programs;

import java.util.Scanner;

public class StringInRevOrderWithNoDuplicates {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String str = s.nextLine();
		StringBuffer buffer = new StringBuffer(str);
		buffer=buffer.reverse();
		for (int i = 0; i < buffer.length(); i++) {
			for (int j = i + 1; j < buffer.length(); j++) {
				if (buffer.charAt(i) == buffer.charAt(j)) {
					buffer.deleteCharAt(j);
					j--;
				}
			}
		}
		System.out.println(buffer);
		s.close();
	}

}
