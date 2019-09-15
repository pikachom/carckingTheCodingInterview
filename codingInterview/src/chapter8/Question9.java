package chapter8;

import java.util.HashSet;

public class Question9 {
	public HashSet<String> generateParens(int n) {
		HashSet<String> result = new HashSet<String>();
		generateParens(result, "", n, n);
		return result;
	}

	private void generateParens(HashSet<String> result, String prefix, int left, int right) {
		if (left > right) {
			return;
		}
		if (left == 0 && right == 0) {
			System.out.println(prefix);
			result.add(prefix);
			return;
		}
		if (left > 0) {
			generateParens(result, prefix + "(", left - 1, right);
		}
		if (right > 0) {
			generateParens(result, prefix + ")", left, right - 1);
		}
	}
	public static void main(String[] args) {
		Question9 test = new Question9();
		System.out.println(test.generateParens(3));
	}

}
