package programs;

import java.util.Scanner;

public class RemovingDuplicates {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String str = scanner.nextLine();
		StringBuffer buffer = new StringBuffer(str);
		int count = 0;
		for (int i = 0; i < buffer.length(); i++) {
			for (int j = i + 1; j < buffer.length(); j++) {
				if (buffer.charAt(i) == buffer.charAt(j)) {
					count++;
					buffer.deleteCharAt(j);
					j--;
				}
			}
		}
		if (count > 0) {
			System.out.println(buffer);
		} else {
			System.out.println("There is no duplicate variables in " + buffer);
		}
		scanner.close();
	}
}
