package chapter10;

public class Question5 {
	public int sparseSearch(String target, String[] strings) {
		int low = 0;
		int high = strings.length - 1;
		return sparseSearchRecur(target, strings, low, high);
	}
	private int sparseSearchRecur(String target, String[] strings, int low, int high) {
		if(low > high) {
			return -1;
		}
		int mid = (low + high) / 2;
		
		if(strings[mid].isEmpty()) { // find non empty new mid
			int midLeft = mid - 1;
			int midRight = mid + 1;
			String newMid = "";
			while(newMid == "") {
				if(strings[midLeft] != "") {
					newMid = strings[midLeft];
					mid = midLeft;
				}else if(strings[midRight] != "") {
					newMid = strings[midRight];
					mid = midRight;
				}
				midLeft--;
				midRight++;
				if(midLeft < low || midRight > high) {
					return -1;
				}
			}
		}
		if(target.equals(strings[mid])) {
			return mid;
		}else if (strings[mid].compareTo(target) < 0) {
			return sparseSearchRecur(target, strings, mid + 1, high);
		}else {
			return sparseSearchRecur(target, strings, low, mid - 1);
		}
	}
	
	public static void main(String[] args) {
		Question5 test = new Question5();
		String[] strings = {"at", "", "", "", "ball", "", "", "car", "", "", "dad", "", ""};
		System.out.println(test.sparseSearch("ball", strings));
	}
}
