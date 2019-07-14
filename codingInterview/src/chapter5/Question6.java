package chapter5;

public class Question6 {
	public int conversion(int a, int b) {
		int count = 0;
		int c = a^b;
		while(c!=0) {
			count += c&1;
			c>>>=1;
		}
		return count;	
	}
	public static void main(String[] args) {
		Question6 test = new Question6();
		System.out.println(test.conversion(29, 15));
	}
}
