package chapter4;

public class Question2 {
	public TreeNode createMinimalBST(int[] array) {
		int middleIndex = (array.length-1)/2;
		TreeNode middleNode = new TreeNode(array[middleIndex]);
		return createMinimalBST(���ʾ��, middleNode, �����ʾ��);
	}
	TreeNode createMinimalBST(int[] leftArr, TreeNode middleNode, int[] rightArr) {
		return null;
	}
}
