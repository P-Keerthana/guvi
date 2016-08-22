package programs;

public class IsomorphicStrings {

	public static void main(String[] args) {
		isoStrings("egg", "odd");
		isoStrings("Hai", "bye");
		isoStrings("paper", "title");
	}

	public static void isoStrings(String s1, String s2) {
		char[] c1 = s1.toCharArray();
		char[] c2 = s2.toCharArray();
		int count = 0;
		int pos1 = 0, pos2 = 0;
		int a = 0;
		if (c1.length == c2.length) {
			for (int i = 0; i < c1.length; i++) {
				for (int j = i + 1; j < c1.length; j++) {
					if (c1[i] == c1[j]) {
						pos1 = i;
						pos2 = j;
						count++;
					}
				}
			}
			if (count > 0) {
				if (c2[pos1] == c2[pos2]) {
					a = 1;
				}
			}
			if (a == 1) {
				System.out.println("True");
			} else {
				System.out.println("false");
			}
		} else if (c1.length != c2.length) {
			System.out.println("Isomorphic Strings Should be in equal length!!");
		}
	}
}