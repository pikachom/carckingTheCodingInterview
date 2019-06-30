package chapter4;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Set;
import java.util.Stack;



public class Question3 {
	public HashMap<TreeNode, Integer> makeNodeMap(BinarySearchTree tree){
		//<node, 해당노드의 depth>를 저장하는 맵을 만듬
		
		TreeNode root = tree.root;
		int depth = 0;
		HashMap<TreeNode, Integer> resultMap = new HashMap<TreeNode, Integer>();
		if(root == null) {
			return null;
		}
		Stack<TreeNode> nodeStack = new Stack<TreeNode>();
		nodeStack.push(root);
		resultMap.put(root, depth);
		
		while(!nodeStack.isEmpty()) {
			TreeNode node = nodeStack.pop();			
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
	
	public ArrayList<LinkedList<TreeNode>> makeLinkedListFromMap(HashMap<TreeNode, Integer> nodeMap){
		//만들어진 맵에서 트리노드의 ll을 만들고 arraylist에 집어넣음
		
		ArrayList<LinkedList<TreeNode>> resultArrList = new ArrayList<LinkedList<TreeNode>>();
		for(TreeNode node : nodeMap.keySet()) {
			
			
			int index = nodeMap.get(node);
			if(resultArrList.get(index) == null) {
				resultArrList.add(index, new LinkedList<TreeNode>());
			}
			LinkedList<TreeNode> linkedList = resultArrList.get(index);
			linkedList.add(node);
		}
		
		
		return resultArrList;
	}
	public static void main(String[] args) {
		TreeNode n1 = new TreeNode(1);
		TreeNode n2 = new TreeNode(2);
		TreeNode n3 = new TreeNode(3);
		TreeNode n4 = new TreeNode(4);
		TreeNode n5 = new TreeNode(5);
		BinarySearchTree tree = new BinarySearchTree(0);
		tree.root.left = n1;
		tree.root.right = n2;
		n1.left = n3;
		n1.right = n4;
		n2.left = n5;
		
		Question3 test = new Question3();
		HashMap<TreeNode, Integer> nodeMap = test.makeNodeMap(tree);
		ArrayList<LinkedList<TreeNode>> result = test.makeLinkedListFromMap(nodeMap);
		System.out.println(result.get(0));
	}
}
