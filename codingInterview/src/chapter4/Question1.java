package chapter4;

import java.util.LinkedList;
import java.util.Queue;

import chapter4.Node.NodeStates;

public class Question1 {
	public boolean hasRouteBetweenNodes(Graph g1, Node fromNode, Node toNode) {
		if(!g1.hasNode(fromNode)||!g1.hasNode(toNode)) {
			return false;
		}
		//n1���� ����ؼ� n2���� ���⸸ �ϸ� ��
		
		
		for(Node n1 : g1.nodes) {
			n1.state = NodeStates.Unvisited;
		}
		fromNode.state = NodeStates.Visiting;
		
		
		
		
		
		return true;
	}
	public void breadthFirstSearch(Node n1) {
		Queue<Node> queue = new LinkedList<Node>();
		n1.state = NodeStates.Visited;
		
	}

}
