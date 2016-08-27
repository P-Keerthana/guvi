package programs;

import java.util.Arrays;
import java.util.Scanner;

public class NumEqualToIndex {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the no. of elements");
		int n = scanner.nextInt();
		int[] num = new int[n];
		System.out.println("Enter the elements(elements should be unique)");
		int count = 0;
		for (int i = 0; i < n; i++) {
			num[i] = scanner.nextInt();
		}
		Arrays.sort(num);
		for (int j = 0; j < num.length; j++) {
			if (j == num[j]) {
				System.out.println("Index " + j + " and array element " + num[j] + " are equal");
				count = 1;
			}
		}
		if (count != 1) {
			System.out.println("No element should be equal ");
			scanner.close();
		}
	}

}
