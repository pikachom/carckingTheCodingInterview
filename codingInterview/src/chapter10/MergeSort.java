package chapter10;

public class MergeSort {
	void mergesort(int[] array) {
		int[] helper = new int[array.length];
		mergesort(array, helper, 0, array.length-1);
	}
	void mergesort(int[] array, int[] helper, int low, int high) {
		if(low<high) {
			int middle = (low + high) / 2;
			mergesort(array, helper, low, middle);
			mergesort(array, helper, middle+1, high);
			merge(array, helper, low, middle, high);
		}
	}
	void merge(int[] array, int[] helper, int low, int middle, int high) {
		for(int i=low; i<=high; i++) {
			helper[i] = array[i];
		}
	}
}
