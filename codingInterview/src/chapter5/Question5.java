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
	// ��� �ڸ��� 0���� �̷�����־���� true�� ���ϵ� 
	// input�� 2�� �ŵ��������� �ƴ��� �׽�Ʈ�ϴ� ���� 
}
