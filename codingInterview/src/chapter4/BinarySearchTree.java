package chapter4;

import java.util.Stack;

public class BinarySearchTree {
	public TreeNode root;
	public BinarySearchTree(int rootValue) {
		this.root = new TreeNode(rootValue);
	}
	public void dfs(TreeNode root) {
		if(root == null) {
			return;
		}
		Stack<TreeNode> nodeStack = new Stack<TreeNode>();
		nodeStack.push(root);
		
		while(!nodeStack.isEmpty()) {
			TreeNode node = nodeStack.pop();
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
