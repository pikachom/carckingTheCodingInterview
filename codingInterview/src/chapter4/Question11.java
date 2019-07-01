package chapter4;

import java.util.Random;
import java.util.Stack;

public class Question11 {
	public KhTreeNode getRandomNode(KhBinarySearchTree tree) {
		KhTreeNode root = tree.root;
		int numNodes = 0;
		if(root == null) {
			return null;
		}
		Stack<KhTreeNode> nodeStack = new Stack<KhTreeNode>();
		nodeStack.push(root);
		
		while(!nodeStack.isEmpty()) {
			KhTreeNode node = nodeStack.pop();
			numNodes ++;
			
			if(node.right != null) {
				nodeStack.push(node.right);
			}
			if(node.left != null) {
				nodeStack.push(node.left);
			}
		}
		
		// search�� �� �� ���ϴ°� ���� �ɸ�
		//��� node�� ���� �����ص״ٰ� index�� �����ϴ°Ͱ� �� ����� ���� ������?
		Random random = new Random();
		int randomNodeNum = random.nextInt(numNodes);
		
		
		numNodes = 0;
		nodeStack.push(root);
		
		while(!nodeStack.isEmpty()) {
			KhTreeNode node = nodeStack.pop();
			numNodes ++;
			if(numNodes == randomNodeNum) {
				return node;
			}
			
			if(node.right != null) {
				nodeStack.push(node.right);
			}
			if(node.left != null) {
				nodeStack.push(node.left);
			}
		}
		return null;
		
	}
}
