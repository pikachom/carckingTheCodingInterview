package chapter4;

import java.util.Stack;

public class Question10 {
	public boolean checkContainsTree(BinarySearchTree t1, BinarySearchTree t2) {
		TreeNode nodeToFind = t2.root;
		TreeNode root = t1.root;
		if(root == null) {
			return false;
		}
		Stack<TreeNode> nodeStack = new Stack<TreeNode>();
		nodeStack.push(root);
		
		while(!nodeStack.isEmpty()) {
			TreeNode node = nodeStack.pop();
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
