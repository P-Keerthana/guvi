package programs;

import java.util.Scanner;

public class StringtoInteger {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String str = scanner.next();
		try {
			int i = Integer.parseInt(str);
			System.out
					.println("Values after String to Integer conversion:" + i);
		} catch (Exception e) {
			System.out.println(e.getClass() + " " + e.getMessage());
		}
		scanner.close();
	}

}
