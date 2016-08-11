package programs;

import java.util.Scanner;

public class VowelOrConsonant {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		char[] vowels = { 'a', 'e', 'i', 'o', 'u' };
		char c = scanner.next().charAt(0);
		int count = 0;
		for (char v : vowels) {
			if ((v == c) || ((char)(v-32)==c)) {
				count++;
			}
		}
		if (count>0) {
			System.out.println("Entered Character is a Vowel: " + c);
		} else {
			System.out.println("Entered character is a Consonants: " + c);
		}
		scanner.close();

	}

}
