package chapter3;

import java.util.EmptyStackException;

public class Question2 {
	public class StackWithMin<Integer> extends MyStack<Integer>{
				
		public class NodeWithMin<Integer>{
			private NodeWithMin<Integer> next;
			private Integer data;

			public NodeWithMin(Integer data) {
				this.data = data;				
			}
		}				
		private NodeWithMin<Integer> top;
		private MyStack<Integer> minStack;
		
		
		public Integer pop() {
			if(top == null) throw new EmptyStackException();
			Integer item = top.data;
			top = top.next;
			if((int)item == (int)minStack.peek()) {
				minStack.pop();
			}
			return item;
		}
		
		public void push(Integer data) {			
			NodeWithMin<Integer> node = new NodeWithMin<Integer>(data);
			node.next = top;
			top = node;			
			if(((int)minStack.peek()>(int)data) || (minStack.isEmpty())) {
				minStack.push(data);
			}			
		}
		
		public Integer peek() {
			if(top == null) throw new EmptyStackException();
			return top.data;
		}
		public Integer min() {
			if(top == null) throw new EmptyStackException();
			return minStack.peek();
		}
		
		
	}
	
	
}
