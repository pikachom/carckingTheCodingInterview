package chapter4;

public class TreeNode {
	public int value;
	public TreeNode left;
	public TreeNode right;
	public TreeNode parent;
	
	public void setLeft(TreeNode child) {
		this.left = child;
		child.parent = this;
	}
	public void setRight(TreeNode child) {
		this.right = child;
		child.parent = this;
	}
	
	public TreeNode(int v) {
		this.value = v;
		this.left = null;
		this.right = null;
	}
}
