package programs;

import java.util.Scanner;

public class DigitsRev {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the digits:");
		int digits = scanner.nextInt();
		int temp;
		int reverse = 0;
		for (; digits != 0;) {
			temp = digits % 10;
			digits = digits / 10;
			reverse = (reverse * 10) + temp;
		}
		System.out.println("Reversed Digits :" + reverse);
	}
}
