package chapter4;

public class Question5 {
	public boolean checkBST(TreeNode root) {
		return checkBST(root, Integer.MIN_VALUE, Integer.MAX_VALUE);
	}
	public boolean checkBST(TreeNode node, int min, int max) {
		if(node == null) {
			return true;
		}
		if(node.value < min || node.value > max) {
			return false;
		}
		boolean result = (checkBST(node.left, min, node.value-1) && checkBST(node.right, node.value+1, max));
		return result;
		
		
	}
	public static void main(String[] args) {
		TreeNode n1 = new TreeNode(3);
		TreeNode n2 = new TreeNode(8);
		TreeNode n3 = new TreeNode(2);
		TreeNode n4 = new TreeNode(4);
		TreeNode n5 = new TreeNode(6);
		BinarySearchTree tree = new BinarySearchTree(5);
		TreeNode root = tree.root;
		tree.root.left = n1;
		tree.root.right = n2;
		n1.left = n3;
		n1.right = n4;
		n2.left = n5;
		Question5 test = new Question5();
		System.out.println(test.checkBST(root));
	}
	/*
	 * 5
	 * 3  8
	 * 2 4 6
	 * 
	 * 
	 * */
	
}
