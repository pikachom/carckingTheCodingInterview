package chap1;

public class Question9 {
	public boolean isSubstring(String first, String second) {
		if (first.contains(second)) {
			return true;
		}
		return false;
	}

	public boolean stringRotation(String first, String second) {
		if (!(first.length() == second.length())) {
			return false;
		}
		first = first + first + first;
		return isSubstring(first, second);
	}

	public static void main(String[] args) {
		Question9 test = new Question9();
		System.out.println(test.stringRotation("waterbottle", "erbottlewat"));
	}
}
