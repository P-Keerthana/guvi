package programs;

import java.util.Scanner;

public class SwappinChar {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String str = scanner.next();
		char[] c = str.toCharArray();
		char temp;
		for (int i = 0; i <str.length()-1 ; i = i + 2) {
			temp = c[i];
			c[i] = c[i + 1];
			c[i + 1] = temp;

		}
		for (int j = 0; j < c.length; j++) {
			System.out.print(c[j]);
		}
		scanner.close();
	}
}
