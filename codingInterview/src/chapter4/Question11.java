package chapter4;

import java.util.ArrayList;
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
		ArrayList<KhTreeNode> nodes = new ArrayList<KhTreeNode>();
		nodeStack.push(root);
		
		while(!nodeStack.isEmpty()) {
			KhTreeNode node = nodeStack.pop();
			nodes.add(node);
			numNodes ++;
			
			if(node.right != null) {
				nodeStack.push(node.right);
			}
			if(node.left != null) {
				nodeStack.push(node.left);
			}
		}
		//전체 노드 수 체크완료
		//노드스택은 비었음 
		
		Random random = new Random();
		int randomNodeNum = random.nextInt(numNodes);
		return nodes.get(randomNodeNum);
	}
	public static void main(String[] args) {
		/*
		 * 			5
		 * 		3		 8
		 * 	2	  4    6
		 * */
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
		Question11 test = new Question11();
		System.out.println(test.getRandomNode(tree).value);
	}
		//아래처럼 전체검색하지말고 바로 랜덤인덱스에 대해 찾
//		
//		numNodes = 0;
//		nodeStack.push(root);
//		
//		while(!nodeStack.isEmpty()) {
//			KhTreeNode node = nodeStack.pop();
//			numNodes ++;
//			if(numNodes == randomNodeNum) {
//				return node;
//			}
//			
//			if(node.right != null) {
//				nodeStack.push(node.right);
//			}
//			if(node.left != null) {
//				nodeStack.push(node.left);
//			}
//		}
//		return null;
//		
//	}
}
