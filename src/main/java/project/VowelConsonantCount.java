package project;

import java.util.Scanner;

public class VowelConsonantCount {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a string: ");
		String str = sc.nextLine();
		sc.close();

		int vowelCount = 0;
		int consonantCount = 0;

		str = str.toLowerCase();
		for (char c : str.toCharArray()) {
			if (c >= 'a' && c <= 'z') {
				if ("aeiou".indexOf(c) != -1)
					vowelCount += 1;
				else
					consonantCount += 1;
			}
		}

		System.out.println("vowel count: " + vowelCount);
		System.out.println("consonant count: " + consonantCount);

	}

}