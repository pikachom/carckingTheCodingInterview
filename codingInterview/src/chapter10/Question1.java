package chapter10;

public class Question1 {
	public void merge(int[] a, int[] b) {
		int lastIndexA = a.length - 1;
		while(a[lastIndexA] == 0) {
			lastIndexA--;
		}
		int lastIndexB = b.length - 1;
		
		mergeHelper(a, b, lastIndexA, lastIndexB);
		
	}
	private void mergeHelper(int[] a, int[] b, int lastIndexA, int lastIndexB) {
		int lastIndexMerged = lastIndexA + lastIndexB + 1;
		int indexA = lastIndexA;
		int indexB = lastIndexB;
		
		while(indexB >= 0) {
			if( indexA >= 0 && a[indexA] > b[indexB]) {
				a[lastIndexMerged] = a[indexA];
				indexA--;
			} else {
				a[lastIndexMerged] = b[indexB];
				indexB--;
			}
			lastIndexMerged--;
		}
	}
	
	
	
	public static void main(String[] args) {
		int[] a = new int[10];
		for(int i = 0; i<=4; i++) {
			a[i] = 2 * (i+1);
		}
		int[] b = {3, 5, 7};
		
		System.out.print("int[] a : ");
		for(int j = 0; j<a.length; j++) {
			System.out.print(a[j] + ",");
		}
		System.out.println("");
		Question1 test = new Question1();
		test.merge(a, b);
		
		System.out.println("===after merge===");
		System.out.print("int[] a : ");
		for(int j = 0; j<a.length; j++) {
			System.out.print(a[j] + ",");
		}
	}
}
