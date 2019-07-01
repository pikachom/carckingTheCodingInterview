package chapter4;

public class KhTreeNode {
	public int value;
	public KhTreeNode left;
	public KhTreeNode right;
	public KhTreeNode parent;
	
	public void setLeft(KhTreeNode child) {
		this.left = child;
		child.parent = this;
	}
	public void setRight(KhTreeNode child) {
		this.right = child;
		child.parent = this;
	}
	
	public KhTreeNode(int v) {
		this.value = v;
		this.left = null;
		this.right = null;
	}
}
