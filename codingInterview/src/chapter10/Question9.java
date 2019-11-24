package chapter10;

public class Question9 {
	void matrixSearch(int[][] input, int target) {
		int row = input.length;
		int col = input[0].length;
		int resultY = -1;
		int resultX = -1;
		for(int y = 0; y < row; y++) {
//			System.out.println(y);
			if(input[y][0] <= target && input[y][col-1] >= target) {
				int x = binarySearchRecur(input[y], target, 0, col);
				if(x != -1) {
					resultX = x;
					resultY = y;
					break;
				}
			}
		}
		System.out.println("x, y = "+resultX + "," + resultY);
		
		
		
		
	}
	private int binarySearchRecur(int[] input,int target, int low, int high) {
		int mid = (low + high) / 2;
//		System.out.println("mid:" + mid);
//		System.out.println("low:" + low);
//		System.out.println("high:" + high);
		if(low > high) {
			return -1;
		}
		if(input[mid] == target) {
			return mid;
		} else if(input[mid] > target) {
			return binarySearchRecur(input, target, low, mid - 1);
		} else {
			return binarySearchRecur(input, target, mid + 1, high);
		}
	}
	
	
	
	
	
	public static void main(String[] args) {
		int[][] input = 
			{
					{15, 20, 40, 85},
					{20, 35, 80, 95},
					{30, 55, 95, 105},
					{40, 80, 100, 120},
					{50, 85, 110, 130}
			};
		Question9 test = new Question9();
		test.matrixSearch(input, 55);
	}
	
}
