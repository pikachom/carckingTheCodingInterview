package chapter3;

import java.util.EmptyStackException;

public class KhMyStack<T> {
	public static class StackNode<T>{
		T data;
		StackNode<T> next;
		
		
		public StackNode(T data) {
			this.data = data;
		}
	}
	StackNode<T> top;
	int stackLength;
	
	public T pop() {
		if(top == null) throw new EmptyStackException();
		T item = top.data;
		top = top.next;
		stackLength--;
		return item;
	}
	
	public void push(T item) {
		StackNode<T> t = new StackNode<T>(item);
		t.next = top;
		stackLength++;
		top = t;
	}
	
	public T peek() {
		if(top == null) throw new EmptyStackException();
		return top.data;		
	}
	
	public boolean isEmpty() {
		return top == null;
	}
	
}
