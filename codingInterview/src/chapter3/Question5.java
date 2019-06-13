package chapter3;

public class Question5 {
	public MyStack<Integer> sort(MyStack<Integer> stack){
		MyStack<Integer> sortedStack = new MyStack<Integer>();
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
		MyStack<Integer> testStack = new MyStack<Integer>();
		testStack.push(11);
		testStack.push(23);
		testStack.push(5);
		testStack.push(42);
		testStack.push(2);
		testStack.push(88);
		
		MyStack<Integer> resultStack = new MyStack<Integer>();
		resultStack = test.sort(testStack);
		
		while(!resultStack.isEmpty()) {
			System.out.println(resultStack.pop());
		}
		
	}
}
