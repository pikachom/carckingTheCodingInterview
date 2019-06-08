package chapter3;

import java.util.EmptyStackException;

public class Question1 {	
	public class multiStacks{
		int mStackCapacity;
		int mArrayLength;
		int[] mArray;
		int[] mLengthOfEachStacks;
		int[] mIndexOfTops;
		public multiStacks(int mStackCapacity) {
			this.mStackCapacity = mStackCapacity;
			this.mArrayLength = mStackCapacity * 3;
			this.mArray = new int[mArrayLength];
			this.mLengthOfEachStacks = new int[3];			
			this.mIndexOfTops = new int[3];
			for(int i=0;i<3;i++) {
				this.mIndexOfTops[i] = mStackCapacity*(i+1)-1;
				this.mLengthOfEachStacks[i] = 0;
			}
			
		}
		
		public void push(int whichStack, int item) {
			if(mLengthOfEachStacks[whichStack] > mStackCapacity) {
				System.out.println("Stack is full, push failed");
			}else {
				mLengthOfEachStacks[whichStack]++;
				mIndexOfTops[whichStack]--;
				mArray[mIndexOfTops[whichStack]] = item;
			}
			
		}
		public int pop(int whichStack) {
			if(mLengthOfEachStacks[whichStack] == 0) {
				System.out.println("Stack is empty, pop failed");
				throw new EmptyStackException();
			}
			mLengthOfEachStacks[whichStack]--;
			int item = mArray[mIndexOfTops[whichStack]];
			mIndexOfTops[whichStack]++;
			
			return item;
		}		
	}
		
	public static void main(String[] args) {
		Question1 test = new Question1();
		multiStacks stack = test.new multiStacks(5); // 이부분 신택스가 잘 이해 안감
		stack.push(0, 1);
		stack.push(0, 2);
		stack.push(0, 3);
		stack.push(1, 11);
		stack.push(1, 12);
		stack.push(2, 21);
		stack.push(2, 22);
		System.out.println(stack.pop(0));
		System.out.println(stack.pop(0));
		stack.push(0, 5);
		System.out.println(stack.pop(1));
		
		
		 
	}
}
