package chapter4;

import java.util.Stack;

public class KhBinarySearchTree {
	public KhTreeNode root;
	public KhBinarySearchTree(int rootValue) {
		this.root = new KhTreeNode(rootValue);
	}
	public void dfs(KhTreeNode root) {
		if(root == null) {
			return;
		}
		Stack<KhTreeNode> nodeStack = new Stack<KhTreeNode>();
		nodeStack.push(root);
		
		while(!nodeStack.isEmpty()) {
			KhTreeNode node = nodeStack.pop();
			System.out.println(node.value + " ");
			
			if(node.right != null) {
				nodeStack.push(node.right);
			}
			if(node.left != null) {
				nodeStack.push(node.left);
			}
		}
	}
	
}
