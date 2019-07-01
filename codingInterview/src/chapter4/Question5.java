package chapter4;

public class Question5 {
	public boolean checkBST(KhTreeNode root) {
		return checkBST(root, Integer.MIN_VALUE, Integer.MAX_VALUE);
	}
	public boolean checkBST(KhTreeNode node, int min, int max) {
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
		KhTreeNode n1 = new KhTreeNode(3);
		KhTreeNode n2 = new KhTreeNode(8);
		KhTreeNode n3 = new KhTreeNode(2);
		KhTreeNode n4 = new KhTreeNode(4);
		KhTreeNode n5 = new KhTreeNode(6);
		KhBinarySearchTree tree = new KhBinarySearchTree(5);
		KhTreeNode root = tree.root;
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
