package chapter4;

public class Question6 {
	/*
	 * successor�� ����
	 * 1)���x�� right�� �����ϴ� ���, right subtree�� leftmost(�ּҰ�)
	 * 2)���x�� right�� �������� �ʴ� ���, ���y�� subtree�� rightmost(�ִ밪)�� ���x�� ���y
	 * 3) ���� 2�����̽��� ���� ��� successor�� ����
	 * */
	public KhTreeNode findLeftMost(KhTreeNode root) {
		if(root == null) {
			return null;
		}
		while(root.left != null) {
			root = root.left;
		}
		return root;
	}
	public KhTreeNode findSuccessor(KhTreeNode node) {
		if(node.right != null) {
			return findLeftMost(node.right);
		}else {
			KhTreeNode parent = node.parent;
			while(parent != null && parent.right == node) {
				node = parent;
				parent = parent.parent;
			}
			return parent;
		}
		
	}
	public static void main(String[] args) {
		KhTreeNode n1 = new KhTreeNode(3);
		KhTreeNode n2 = new KhTreeNode(8);
		KhTreeNode n3 = new KhTreeNode(2);
		KhTreeNode n4 = new KhTreeNode(4);
		KhTreeNode n5 = new KhTreeNode(6);
		KhBinarySearchTree tree = new KhBinarySearchTree(5);
		KhTreeNode root = tree.root;
		root.setLeft(n1);
		root.setRight(n2);
		n1.setLeft(n3);
		n1.setRight(n4);
		n2.setLeft(n5);
		Question6 test = new Question6();
		System.out.println(root.value);
		System.out.println(test.findSuccessor(root).value);
		System.out.println(test.findSuccessor(n1).value);
		System.out.println(test.findSuccessor(n4).value);
	}
}
