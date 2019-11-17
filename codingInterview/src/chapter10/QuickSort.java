package chapter10;

public class QuickSort {
	void quickSort(int[] arr, int left, int right) {
		int index = partition(arr, left, right);
		if(left < index - 1) { // sort left half
			quickSort(arr, left, index - 1);
		}
		if(index < right) { // sort right half
			quickSort(arr, index, right);
		}
	}
	
	int partition(int[] arr, int left, int right) {
		int pivot = arr[(left + right) / 2]; // pick pivot point
		while(left <= right) {
			// find element on left that should be on right
			while(arr[left] < pivot) left++;
			
			// find element on right that should be on left
			while(arr[right] > pivot) right--;
			
			//swap elements, move left and right indices
			if(left <= right) {
				swap(arr, left, right);
				left++;
				right--;
			}
		}
		return left;
	}
	void swap(int[] arr, int left, int right) {
		
	}
}
