package chapter3;

public class Question4 {
	public class QueueViaStack<T>{
		MyStack<T> originalStack = new MyStack<T>();
		MyStack<T> reverseStack = new MyStack<T>();
		
		public void add(T item) {
			originalStack.push(item);
		}
		public T remove() {
			fillReverseStack();
			return reverseStack.pop();
		}
		public T peek() {
			return originalStack.peek();
		}
		public void fillReverseStack() {
			while(!originalStack.isEmpty()) {
				reverseStack.push(originalStack.pop());
			}
		}
		
		
	}
}
