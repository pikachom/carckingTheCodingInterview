package chapter4;

public class Question8 {
	public int getDepth(TreeNode node) {
		int depth = 0;
		while(node != null) {
			node = node.parent;
			depth++;
		}
		return depth;
	}
	
	public TreeNode commonAncestor(TreeNode lowerNode, TreeNode higherNode) {
		// °°Àº µª½º³¢¸® ¸ÂÃç³õ°í ÇÑÄ­¾¿ ¿Ã¶ó°¡¸ç ¸ÂÃç¾ßÇÔ
		// higherNodeÀÇ µª½º°¡ ´õ ±íÀ» °æ¿ì µÑÀ» ¹Ù²ãÁÜ
		if(getDepth(lowerNode)<getDepth(higherNode)) {
			TreeNode tmpNode = higherNode;
			higherNode = lowerNode;
			lowerNode = tmpNode;
		}
		while(getDepth(lowerNode) != getDepth(higherNode)) {
			lowerNode = lowerNode.parent;
			//System.out.println("current lowerNode : " + lowerNode.value);
		}
		//System.out.println(lowerNode.value);
		while(lowerNode != higherNode) {
			lowerNode = lowerNode.parent;
			higherNode = higherNode.parent;
		}
		return lowerNode;
	}
	/*
	 * 			5
	 * 		3		 8
	 * 	2	  4    6
	 * */
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
		Question8 test = new Question8();
		System.out.println(test.commonAncestor(n5, n1).value);
		System.out.println(test.commonAncestor(n3, n4).value);
	}
}
