package chapter3;

public class Question1 {	
	public class multiStacks{
		int mStackCapacity;
		int mArrayLength;
		int[] mArray;
		int top1;
		int top2;
		int top3;
				
		public int getStackCapacity() {
			return mStackCapacity;
		}
		public void setStackCapacity(int mStackCapacity) {
			this.mStackCapacity = mStackCapacity;
			this.mArrayLength = mStackCapacity * 3;
			this.mArray = new int[mArrayLength];
			this.top1 = mArray[0];
			this.top2 = mArray[mStackCapacity];
			this.top3 = mArray[mStackCapacity*2];			
		}
		
		public void push(int stackNum, int item) {
			
		}
		
//		public int pop(int stackNum) {
//			if(stackNum == 1) {
//				
//			}
//			
//			
//			return 
//			
//		}
		
		
		
		
		
		
		
		
	}
	
	
	
	
	
	public static void main(String[] args) {
		//set stack capacity~~
		//set
	}
}
