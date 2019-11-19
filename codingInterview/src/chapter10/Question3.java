package chapter10;

public class Question3 {
	public int searchRotated(int[] a, int x) {
		int midIndex = (a.length - 1) / 2;		
		int leftHalfFirstIndex = 0;
		int rightHalfLastIndex = midIndex + 1;
		return searchRotatedRecur(a, leftHalfFirstIndex, rightHalfLastIndex, x);
	}
	
	private int searchRotatedRecur(int[] a, int leftHalfFirstIndex, int rightHalfLastIndex, int x) {
		int midIndex = (leftHalfFirstIndex + rightHalfLastIndex) / 2;
		if(x == a[midIndex]) {
			//System.out.println(midIndex);
			return midIndex;
		}
//		if(x == a[rightHalfLastIndex]) {
//			return rightHalfLastIndex;
//		}
		if(a[leftHalfFirstIndex] < a[midIndex]) {
			if(x >= a[leftHalfFirstIndex] && x <= a[midIndex]) {
				return searchRotatedRecur(a, leftHalfFirstIndex, midIndex - 1, x);
			} else {
				return searchRotatedRecur(a, midIndex + 1, rightHalfLastIndex, x);
			}
		} else {
			if(x >= a[midIndex] && x <= a[rightHalfLastIndex]) {
				return searchRotatedRecur(a, midIndex + 1, rightHalfLastIndex, x);
			} else {
				return searchRotatedRecur(a, leftHalfFirstIndex, midIndex , x);
			}
		}
		
		
		
		
	}
	public static void main(String[] args) {
		Question3 test = new Question3();
		int[] a = {50, 5, 20, 30, 40};
		System.out.println(test.searchRotated(a, 5));
		int[] b = {1, 2, 5, 6, 7, 8};
		System.out.println(test.searchRotated(b, 6));
		//7 or 8 test case is stack overflow...why??
	}
}
