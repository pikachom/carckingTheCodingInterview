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

		// �̵尪�� �� Ŀ������ �̵� ���ʸ� üũ�ϸ� �ǰ�, �̵尪�� �� �۾ƹ����� �̵���ʸ�üũ�ϸ��
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
