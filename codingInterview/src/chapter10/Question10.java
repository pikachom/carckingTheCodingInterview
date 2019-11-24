package chapter10;

public class Question10 {
	// binary search tree
	class Node{
		int value;
		Node left, right;
		int leftSize;
		
		public Node() {
			
		}
		public Node(int value) {
			this.value = value;
			this.leftSize = 0;
			this.left = null;
			this.right = null;
		}
		
	}
	Node insert(Node root, int value) {
		if(root == null) {
			Node rootNode = new Node(value);
			return root = rootNode;
		}
		if(value <= root.value) {
			root.left = insert(root.left, value);
			root.leftSize++;
		}else {
			root.right = insert(root.right, value);
		}
		
		
		return root;
	}
	int getRank(Node root, int target) {
		if(root.value == target) {
			return root.leftSize;
		}
		if(root.value > target) {
			return getRank(root.left, target);
		} else { // bigger than root, count leftsize + root(1) + rightsize
			int rightSize = getRank(root.right, target);
			return root.leftSize + rightSize + 1;
		}
	}
	public static void main(String[] args) {
		int[] stream = {5, 1, 4, 4, 5, 9, 7, 13, 3};
		Question10 test = new Question10();
		Node root = test.new Node(); // here, Node root = null; has problem.... any help?
		for(int i : stream) {
//			System.out.println(i);
			test.insert(root, i);
		}
//		System.out.println(root.value);
		System.out.println(test.getRank(root, 1));
		System.out.println(test.getRank(root, 3));
		System.out.println(test.getRank(root, 4));
	}

}
