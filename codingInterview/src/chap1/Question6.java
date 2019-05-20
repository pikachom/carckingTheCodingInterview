package chap1;
//n^2�� �� �ǵ��� ����� ����� �𸣰���...char'����'�� ���� ������ 26n�� �� �� �ְ�����...
public class Question6 {
	public String stringCompress(String inputString) {
		
		StringBuilder sb = new StringBuilder();
		char[] charArr = inputString.toCharArray();
		for(int i=0; i<charArr.length; i++) {			
			if(!(charArr[i]=='*')) {
				int count = 0;
				char c = charArr[i];				
				for(int j=0; j<charArr.length; j++) {
					if(c==charArr[j]) {
						count++;
						charArr[j] = '*';					
					}
				}
				sb.append(c);
				sb.append(count);				
				charArr[i] = '*';
			}
		}
		if(sb.toString().length()>inputString.length()) {
			return inputString;
		}		
		return sb.toString();
	}
	public static void main(String[] args) {
		Question6 test = new Question6();
		String result = test.stringCompress("aaaBBBccDDDDD");
		System.out.println(result);
	}
}
