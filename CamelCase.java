package programs;

import java.util.Scanner;

public class CamelCase {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String str = scanner.nextLine();
		String[] str1 = str.toLowerCase().split(" ");
		String t1;
		String t2;
		if (str1.length > 1) {
			for (int i = 0; i < str1.length; i++) {
				t1= str1[i].substring(0, 1).toUpperCase();
				t2= str1[i].substring(1).toLowerCase();
				str1[i]=t1+t2;
				System.out.print(str1[i]+" ");
			}
		} else {
			t1 = str.substring(0, 1).toUpperCase();
			t2 = str.substring(1).toLowerCase();
			str=t1+t2;
			System.out.println(str);
		}
		scanner.close();
	}
}
