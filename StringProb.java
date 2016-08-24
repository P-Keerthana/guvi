package programs;

import java.util.Scanner;

public class StringProb {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String str = scanner.next();
		char[] c = str.toCharArray();
		char ch = 0;
		int temp = 0;
		int count;
		for (int i = 0; i < c.length; i++) {
			count = 0;
			if (Character.isAlphabetic(c[i])) {
				ch = c[i];
				if (i < c.length - 2) {
					if (Character.isDigit(c[i + 1]) && Character.isDigit(c[i + 2])) {
						temp = (Character.getNumericValue(c[i + 1]) * 10) + Character.getNumericValue(c[i + 2]);
						count = 1;
					}
				}
				if (count != 1) {
					if (Character.isDigit(c[i + 1])) {
						temp = Character.getNumericValue(c[i + 1]);
					}
				}
				for (int j = 0; j < temp; j++) {
					System.out.print(ch);
				}
			}
		}
		scanner.close();
	}
}
