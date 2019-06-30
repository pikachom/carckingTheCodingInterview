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
		//이게 AVL트리 라고 하네요 ㅎ
	}
	public static void main(String[] args) {
		TreeNode n1 = new TreeNode(1);
		TreeNode n2 = new TreeNode(2);
		TreeNode n3 = new TreeNode(3);
		TreeNode n4 = new TreeNode(4);
		TreeNode n5 = new TreeNode(5);
		BinarySearchTree tree = new BinarySearchTree(0);
		TreeNode root = tree.root;
		tree.root.left = n1;
		tree.root.right = n2;
		n1.left = n3;
		n1.right = n4;
		n2.left = n5;
		Question4 test = new Question4();
		System.out.println(test.isBalanced(root));
	}
}
