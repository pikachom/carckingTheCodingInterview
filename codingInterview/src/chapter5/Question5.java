package chapter5;

public class Question5 {
	public boolean debugger(int n) {
		System.out.println(((n&(n-1)) == 0));
		return ((n&(n-1)) == 0);
	}
	public static void main(String[] args) {
		Question5 test = new Question5();
		test.debugger(3);
		test.debugger(4);
	}
	// 모든 자리가 0으로 이루어져있었어야 true가 리턴됨 
	// input이 2의 거듭제곱인지 아닌지 테스트하는 것임 
}
