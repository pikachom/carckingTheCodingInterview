package chapter4;

public class Question8 {
	public int getDepth(KhTreeNode node) {
		int depth = 0;
		while(node != null) {
			node = node.parent;
			depth++;
		}
		return depth;
	}
	
	public KhTreeNode commonAncestor(KhTreeNode lowerNode, KhTreeNode higherNode) {
		// ���� �������� ������� ��ĭ�� �ö󰡸� �������
		// higherNode�� ������ �� ���� ��� ���� �ٲ���
		if(getDepth(lowerNode)<getDepth(higherNode)) {
			KhTreeNode tmpNode = higherNode;
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
		Question8 test = new Question8();
		System.out.println(test.commonAncestor(n5, n1).value);
		System.out.println(test.commonAncestor(n3, n4).value);
	}
}
