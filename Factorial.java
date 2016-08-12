package programs;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int number = scanner.nextInt();
		int f=1;
		if (number == 0) {
			System.out.println(1);
		} else {
			for (int i = 1; i <= number; i++) {
				f = f * i;
			}
			System.out.println(f);
		}
	}

}
