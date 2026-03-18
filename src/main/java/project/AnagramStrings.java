package project;

import java.util.Arrays;

public class AnagramStrings {

	private static boolean checkAnagram(String s1, String s2) {
		if (s1.length() != s2.length())
			return false;
		char[] s1Chars = s1.toLowerCase().toCharArray();
		char[] s2Chars = s2.toLowerCase().toCharArray();
		Arrays.sort(s1Chars);
		Arrays.sort(s2Chars);
		return Arrays.equals(s1Chars, s2Chars);
	}

	public static void main(String[] args) {
		String s1 = "silent";
		String s2 = "LISTEN";
		System.out.println(checkAnagram(s1, s2));
		String s3 = "Aniruddh";
		String s4 = "Aditya";
		System.out.println(checkAnagram(s3, s4));
	}

}
