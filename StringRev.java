package programs;

import java.util.Scanner;

public class StringRev {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String str = scanner.next();
		System.out.println("Entered String is: " + str);
		StringBuffer buffer = new StringBuffer(str);
		str = buffer.reverse().toString();
		System.out.println("Reversed String is: " + str);
		scanner.close();
	}

}
