package chap1;

public class Question3 {
	public String urlify(String input, int trueLength) { // �̸��� �׳� urlify���� �ǳ���?
		char[] tmp = input.toCharArray();
		String result = "";
		for (int i = 0; i < trueLength; i++) {
			if (tmp[i] == ' ') {
				result = result + "%20";
			} else {
				result = result + tmp[i];
			}
		}

		return result;
	}

	public static void main(String[] args) {
		Question3 test = new Question3();
		System.out.println(test.urlify("ȫ ������ ��          ", 7));
		System.out.println(test.urlify("Mr John Smith    ", 13));
	}

}
