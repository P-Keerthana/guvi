package programs;

import java.util.Arrays;
import java.util.Scanner;

public class LeastNumber {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String s=scanner.next();
		char[] c=s.toCharArray();
		int[] number=new int[c.length];
		String s1="";
		for(int i=0;i<c.length;i++){
			number[i]=Character.getNumericValue(c[i]);
		}
		Arrays.sort(number);
		System.out.println("Enter the number of digits to delete");
		int k = scanner.nextInt();
		if (k > 0 && k < number.length) {
			for (int j = 0; j < k - 1; j++) {
				s1+=number[j];
			}
			System.out.println(s1);
		} else {
			System.out.println("k value should be greater than 0 & less than array length.2");
		}
		scanner.close();
	}

}
