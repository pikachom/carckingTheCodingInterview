package chapter1;

public class Question5 {

	public boolean insertRemoveCheck(String firstStr, String secondStr) {
		// �� ����� �տ�����, �տ����� �������� �׽�Ʈ�ϸ� ������ý�� �μ�Ʈý�� ���ÿ� ��
		String tempStr = "";
		if (firstStr.length() < secondStr.length()) {
			tempStr = firstStr;
			firstStr = secondStr;
			secondStr = tempStr;
		} else if (firstStr.length() == secondStr.length()) {
			return false;
		}

		// firstStr�� �ѱ��ھ� ���ư��� �����غ���, secondStr�̶� ��
		for (int i = 0; i < firstStr.length(); i++) {
			tempStr = firstStr.replace(firstStr.charAt(i), ' ').replaceAll(" ", "");
			if (tempStr.equals(secondStr)) {
				return true;
			}
			// System.out.println(tempStr + "//" + secondStr);
		}
		return false;
	}

	public boolean replaceCheck(String firstStr, String secondStr) {
		if (!(firstStr.length() == secondStr.length())) {
			return false;
		}
		String tempStr1 = "";
		String tempStr2 = "";

		for (int i = 0; i < firstStr.length(); i++) {
			tempStr1 = firstStr.replace(firstStr.charAt(i), ' ');
			tempStr2 = secondStr.replace(secondStr.charAt(i), ' ');
			// System.out.println(tempStr1 + "//" + tempStr2);

			if (tempStr1.equals(tempStr2)) {
				return true;
			}
		}
		return false;
	}

	public boolean oneAway(String firstStr, String secondStr) {
		return insertRemoveCheck(firstStr, secondStr) || replaceCheck(firstStr, secondStr);
	}

	public static void main(String[] args) {
		Question5 test = new Question5();
		System.out.println(test.oneAway("pale", "bale"));
		System.out.println(test.oneAway("pale", "ale"));
		System.out.println(test.oneAway("hellyess", "hellyeah"));
	}

}
