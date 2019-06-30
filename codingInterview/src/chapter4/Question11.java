package chapter4;

import java.util.Random;
import java.util.Stack;

public class Question11 {
	public TreeNode getRandomNode(BinarySearchTree tree) {
		TreeNode root = tree.root;
		int numNodes = 0;
		if(root == null) {
			return null;
		}
		Stack<TreeNode> nodeStack = new Stack<TreeNode>();
		nodeStack.push(root);
		
		while(!nodeStack.isEmpty()) {
			TreeNode node = nodeStack.pop();
			numNodes ++;
			
			if(node.right != null) {
				nodeStack.push(node.right);
			}
			if(node.left != null) {
				nodeStack.push(node.left);
			}
		}
		
		// search를 한 번 더하는게 맘에 걸림
		//모든 node를 따로 저장해뒀다가 index로 접근하는것과 이 방법중 뭐가 나을지?
		Random random = new Random();
		int randomNodeNum = random.nextInt(numNodes);
		
		
		numNodes = 0;
		nodeStack.push(root);
		
		while(!nodeStack.isEmpty()) {
			TreeNode node = nodeStack.pop();
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
