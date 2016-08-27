package programs;

import java.util.Scanner;

public class FindingTwoNumbers {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int limit = s.nextInt();
		int[] arr = new int[limit];
		int count = 0;
		for (int i = 0; i < limit; i++) {
			arr[i] = s.nextInt();
		}
		int target = s.nextInt();
		for (int i = 0; i < limit; i++) {
			for (int j = i + 1; j < limit; j++) {
				if (arr[i] + arr[j] == target) {
					count++;
					System.out.println("The numbers are " + arr[i] + " & " + arr[j]);
				}
			}
		}
		if (count == 0) {
			System.out.println("No integers w'd give the target value ");
		}
		s.close();
	}
}
