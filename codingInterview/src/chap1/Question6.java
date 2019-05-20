package chap1;
//n^2이 안 되도록 만드는 방법을 모르겠음...char'사전'을 만들어서 돌리면 26n이 될 순 있겠지만...
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
