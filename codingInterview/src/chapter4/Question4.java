package chapter4;

public class Question4 {
	public int getHeight(KhTreeNode root) {
		if(root == null) {
			return -1;
		}
		return Math.max(getHeight(root.left),  getHeight(root.right)) + 1 ; 
	}
	public boolean isBalanced(KhTreeNode root) {
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
	public static void main(String[] args) {
		KhTreeNode n1 = new KhTreeNode(1);
		KhTreeNode n2 = new KhTreeNode(2);
		KhTreeNode n3 = new KhTreeNode(3);
		KhTreeNode n4 = new KhTreeNode(4);
		KhTreeNode n5 = new KhTreeNode(5);
		KhBinarySearchTree tree = new KhBinarySearchTree(0);
		KhTreeNode root = tree.root;
		tree.root.left = n1;
		tree.root.right = n2;
		n1.left = n3;
		n1.right = n4;
		n2.left = n5;
		Question4 test = new Question4();
		System.out.println(test.isBalanced(root));
	}
}
