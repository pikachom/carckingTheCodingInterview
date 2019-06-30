package chapter4;

public class Question4 {
	public int getHeight(TreeNode root) {
		if(root == null) {
			return -1;
		}
		return Math.max(getHeight(root.left),  getHeight(root.right)) + 1 ; 
	}
	public boolean isBalanced(TreeNode root) {
		if(root == null) {
			return true;
		}
		int heightDiff = Math.abs(getHeight(root.left) - getHeight(root.right));
		if(heightDiff > 1) {
			return false;
		} else {
			return isBalanced(root.left) && isBalanced(root.right); 
		}
		//�̰� AVLƮ�� ��� �ϳ׿� ��
	}
}
