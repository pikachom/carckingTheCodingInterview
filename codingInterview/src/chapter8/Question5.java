package chapter8;

public class Question5 {
	//solution is genius....
	public int getProduct(int a, int b) {
		if(a>b) {
			int temp = a;
			a=b;
			b=temp;
		}
		
		return recurProduct(a, b);
	}
	private int recurProduct(int smaller, int bigger) {
		if(smaller == 0) {
			return 0;
		}else if(smaller == 1) {
			return bigger;
		}
		
		int halfOfSmaller = smaller>>1;
		int halfResult = recurProduct(halfOfSmaller, bigger);
		
		if(smaller%2 == 0) {
			return halfResult + halfResult;
		}else {
			return halfResult + halfResult + bigger;
		}
	}
	public static void main(String[] args) {
		Question5 test = new Question5();
		System.out.println(test.getProduct(30, 43));
		System.out.println(test.getProduct(31, 11));
		System.out.println(test.getProduct(11, 11));
	}
}
