package chapter8;

public class Question3 {
	public int magicIndex(int[] array) {
		int start = 0;
		int end = array.length-1;
		
		return magicIndex(array, start, end);
	}
	private int magicIndex(int[] array, int start, int end) {
		if(start>end) {
			return -1;
		}
		int mid = (start+end) / 2;

		// 미드값이 더 커버리면 미드 앞쪽만 체크하면 되고, 미드값이 더 작아버리면 미드뒷쪽만체크하면됨
		if(array[mid]>mid) {
			return magicIndex(array, start, mid-1);
		}else if(array[mid]<mid){
			return magicIndex(array, mid+1, end);	
		}else {
			return mid;
		}
	}
	public static void main(String[] args) {
		int[] array = {-40,-20,-1,1,2,3,5,7,9,12,13};
		Question3 test = new Question3();
		System.out.println(test.magicIndex(array));
	}
}
