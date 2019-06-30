package chapter4;

public class Question6 {
	/*
	 * successor의 조건
	 * 1)노드x의 right이 존재하는 경우, right subtree의 leftmost(최소값)
	 * 2)노드x의 right이 존재하지 않는 경우, 노드y의 subtree의 rightmost(최대값)이 노드x인 노드y
	 * 3) 위의 2번케이스가 없는 경우 successor가 없음
	 * */
	public TreeNode findLeftMost(TreeNode root) {
		if(root == null) {
			return null;
		}
		while(root.left != null) {
			root = root.left;
		}
		return root;
	}
	public TreeNode findSuccessor(TreeNode node) {
		if(node.right != null) {
			return findLeftMost(node.right);
		}else {
			TreeNode parent = node.parent;
			while(parent != null && parent.right == node) {
				node = parent;
				parent = parent.parent;
			}
			return parent;
		}
		
	}
	public static void main(String[] args) {
		TreeNode n1 = new TreeNode(3);
		TreeNode n2 = new TreeNode(8);
		TreeNode n3 = new TreeNode(2);
		TreeNode n4 = new TreeNode(4);
		TreeNode n5 = new TreeNode(6);
		BinarySearchTree tree = new BinarySearchTree(5);
		TreeNode root = tree.root;
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
