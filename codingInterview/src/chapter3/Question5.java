package chapter3;

public class Question5 {
	public KhMyStack<Integer> sort(KhMyStack<Integer> stack){
		KhMyStack<Integer> sortedStack = new KhMyStack<Integer>();
		while(!stack.isEmpty()) {
			Integer tmpValue = stack.pop();
			while(!sortedStack.isEmpty() && sortedStack.peek()>tmpValue) {
				stack.push(sortedStack.pop());				
			}
			sortedStack.push(tmpValue);
		}		
		return sortedStack;
	}
	
	
	public static void main(String[] args) {
		Question5 test = new Question5();
		KhMyStack<Integer> testStack = new KhMyStack<Integer>();
		testStack.push(11);
		testStack.push(23);
		testStack.push(5);
		testStack.push(42);
		testStack.push(2);
		testStack.push(88);
		
		KhMyStack<Integer> resultStack = new KhMyStack<Integer>();
		resultStack = test.sort(testStack);
		
		while(!resultStack.isEmpty()) {
			System.out.println(resultStack.pop());
		}
		
	}
}
