package chapter4;

public class Question2 {
	public TreeNode createMinimalBST(int[] array) {
		int middleIndex = (array.length-1)/2;
		TreeNode middleNode = new TreeNode(array[middleIndex]);
		return createMinimalBST(왼쪽어레이, middleNode, 오른쪽어레이);
	}
	TreeNode createMinimalBST(int[] leftArr, TreeNode middleNode, int[] rightArr) {
		return null;
	}
}
