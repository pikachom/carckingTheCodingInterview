package chapter10;

public class Question4 {
	static class Listy{
		int[] valueInside;
		public Listy(int[] list) {
			this.valueInside = list;
		}
		public int elementAt(int i) {
			if(i <= this.valueInside.length - 1) {
				return this.valueInside[i];
			}else {
				return -1;
			}
		}
	}
	public int search(Listy list, int value) {
		int index = 1;
		while (list.elementAt(index) != -1 && list.elementAt(index) < value) {
			index *= 2;
		}
		return binarySearch(list, value, index / 2, index);
	}
	
	private int binarySearch(Listy list, int value, int low, int high) {
		int mid;
		
		while(low <= high) {
			mid = (low + high) / 2;
			int middle = list.elementAt(mid);
			if(middle > value || middle == -1) {
				high = mid - 1;
			} else if (middle < value) {
				low = mid + 1;
			} else {
				return mid;
			}
		}
		return -1;
	}
	
	public static void main(String[] args) {
		Question4 test = new Question4();
		int[] list = {1, 2, 3, 4, 5, 6, 10};
		Listy listy = new Listy(list);
		System.out.println(test.search(listy, 10));
		
	}
}
