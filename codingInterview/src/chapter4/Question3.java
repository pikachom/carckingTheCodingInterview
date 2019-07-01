package chapter4;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Set;
import java.util.Stack;



public class Question3 {
	public HashMap<KhTreeNode, Integer> makeNodeMap(KhBinarySearchTree tree){
		//<node, �ش����� depth>�� �����ϴ� ���� ����
		
		KhTreeNode root = tree.root;
		int depth = 0;
		HashMap<KhTreeNode, Integer> resultMap = new HashMap<KhTreeNode, Integer>();
		if(root == null) {
			return null;
		}
		Stack<KhTreeNode> nodeStack = new Stack<KhTreeNode>();
		nodeStack.push(root);
		resultMap.put(root, depth);
		
		while(!nodeStack.isEmpty()) {
			KhTreeNode node = nodeStack.pop();			
			resultMap.put(node,depth);
			if(node.right != null) {
				nodeStack.push(node.right);
				depth++;
			}
			if(node.left != null) {
				nodeStack.push(node.left);
				depth++;
			}
		}		
		return resultMap;				
	}
	
	public ArrayList<LinkedList<KhTreeNode>> makeLinkedListFromMap(HashMap<KhTreeNode, Integer> nodeMap){
		//������� �ʿ��� Ʈ������� ll�� ����� arraylist�� �������
		
		ArrayList<LinkedList<KhTreeNode>> resultArrList = new ArrayList<LinkedList<KhTreeNode>>();
		for(KhTreeNode node : nodeMap.keySet()) {
			
			
			int index = nodeMap.get(node);
			if(resultArrList.get(index) == null) {
				resultArrList.add(index, new LinkedList<KhTreeNode>());
			}
			LinkedList<KhTreeNode> linkedList = resultArrList.get(index);
			linkedList.add(node);
		}
		
		
		return resultArrList;
	}
	public static void main(String[] args) {
		KhTreeNode n1 = new KhTreeNode(1);
		KhTreeNode n2 = new KhTreeNode(2);
		KhTreeNode n3 = new KhTreeNode(3);
		KhTreeNode n4 = new KhTreeNode(4);
		KhTreeNode n5 = new KhTreeNode(5);
		KhBinarySearchTree tree = new KhBinarySearchTree(0);
		KhTreeNode root = tree.root;
		tree.root.left = n1;
		tree.root.right = n2;
		n1.left = n3;
		n1.right = n4;
		n2.left = n5;
		
		Question3 test = new Question3();
		HashMap<KhTreeNode, Integer> nodeMap = test.makeNodeMap(tree);
		ArrayList<LinkedList<KhTreeNode>> result = test.makeLinkedListFromMap(nodeMap);
		System.out.println(result.get(0));
	}
}
