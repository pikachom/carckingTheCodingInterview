package chapter4;

import java.util.Stack;

public class Question10 {
	public boolean checkContainsTree(KhBinarySearchTree t1, KhBinarySearchTree t2) {
		KhTreeNode nodeToFind = t2.root;
		KhTreeNode root = t1.root;
		if(root == null) {
			return false;
		}
		Stack<KhTreeNode> nodeStack = new Stack<KhTreeNode>();
		nodeStack.push(root);
		
		while(!nodeStack.isEmpty()) {
			KhTreeNode node = nodeStack.pop();
			if(node == nodeToFind) {
				return true;
			}
			
			if(node.right != null) {
				nodeStack.push(node.right);
			}
			if(node.left != null) {
				nodeStack.push(node.left);
			}
		}
		return false;
	}
}
