package chapter1;

import java.util.HashSet;

public class Question1 {
	public static boolean isUnique(String sentence) {
		char[] sentenceCharArr = sentence.toCharArray();
		HashSet<Character> resultSet = new HashSet<Character>();
		for (char s : sentenceCharArr) {
			if (!resultSet.contains(s)) {
				resultSet.add(s);

			} else {
				System.out.println(sentence + " has same characters");
				return false;
			}
		}
		System.out.println(sentence + " has all unique characters");
		return true;

	}

	public static void main(String[] args) {
		String sentence = "asdfzxvQWERgbj10";
		isUnique(sentence);
		String sentence2 = "asdfzxvQWERgggbj10";
		isUnique(sentence2);
	}
}
