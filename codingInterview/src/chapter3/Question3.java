package chapter3;

import java.util.ArrayList;
import java.util.EmptyStackException;

import chapter3.MyStack.StackNode;

public class Question3 {
	public class SetOfStacks{
		public SetOfStacks(int capacity) {
			this.capacity = capacity;
			stacks.add(tmpStack);			
		}
		public int capacity;
		
		ArrayList<MyStack<Integer>> stacks = new ArrayList<MyStack<Integer>>();		
		MyStack<Integer> tmpStack = new MyStack<Integer>();
		
		public void push(Integer item) {			
			tmpStack = stacks.get(stacks.size()-1);
			if(tmpStack.stackLength <= capacity) {
				StackNode<Integer> t = new StackNode<Integer>(item);
				t.next = tmpStack.top;
				tmpStack.top = t;
				stacks.set(tmpStack.stackLength-1, tmpStack);
			}else {
				MyStack<Integer> newStack = new MyStack<Integer>();
				newStack.push(item);				
				stacks.add(newStack);
			}
			
		}
		public Integer pop() {
			if(stacks.get(stacks.size()-1).isEmpty()) throw new EmptyStackException();
			Integer item = stacks.get(stacks.size()-1).top.data;
			stacks.get(stacks.size()-1).top = stacks.get(stacks.size()-1).top.next;
			
			return item;
		}
		public Integer peek() {
			if(stacks.get(stacks.size()-1).isEmpty()) throw new EmptyStackException();
			return stacks.get(stacks.size()-1).top.data;
		}
		
			
		
	}
}
