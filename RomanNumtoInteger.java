package programs;

import java.util.Scanner;

public class RomanNumtoInteger {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		char[] ch = new char[] { 'I', 'V', 'X', 'L', 'C', 'D', 'M' };
		int[] val = new int[] { 1, 5, 10, 50, 100, 500, 1000 };
		System.out.println("Enter the roman number");
		int number = 0;
		String roman = scanner.next();
		roman = roman.toUpperCase();
		char[] r = roman.toCharArray();
		for (int i = 0; i < r.length; i++) {
			for (int j = 0; j < ch.length; j++) {
				if (r[i] == ch[j]) {
					number += val[j];
				}
			}
		}
		System.out.println(number);
		scanner.close();
	}

}
