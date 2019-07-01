package chapter4;

public class Question2 {
	public KhTreeNode createMinimalBST(int[] array) {
		if(array == null) {
			return null;
		}
		int middleIndex = (array.length-1)/2;
		KhTreeNode middleNode = new KhTreeNode(array[middleIndex]);
		int[] leftArr = new int[middleIndex];
		int[] rightArr = new int[middleIndex];
		for(int i=0; i<middleIndex; i++) {
			leftArr[i] = array[i];
			rightArr[i] = array[middleIndex+i+1];
		}
		middleNode.left = createMinimalBST(leftArr);
		middleNode.right = createMinimalBST(rightArr);
		return middleNode;
	}
	
}
