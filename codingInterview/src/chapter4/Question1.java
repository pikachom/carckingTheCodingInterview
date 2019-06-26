package chapter4;

import java.util.LinkedList;
import java.util.Queue;

import chapter4.Node.NodeStates;

public class Question1 {
	public boolean hasRouteBetweenNodes(Graph g1, Node fromNode, Node toNode) {
		//n1에서 출발해서 n2까지 가기만 하면 됨
		if(!g1.hasNode(fromNode)||!g1.hasNode(toNode)) {
			return false;
		}
		
		//방문안한상태로 초기화 시키기		
		for(Node n1 : g1.nodes) {
			n1.state = NodeStates.Unvisited;
		}		
		//BFS 시작
		return breadthFirstSearch(fromNode, toNode);		
	}
	public boolean breadthFirstSearch(Node n1, Node n2) {
		Queue<Node> queue = new LinkedList<Node>();
		n1.state = NodeStates.Visiting;
		queue.add(n1);
		Node visitingNode;
		while(!queue.isEmpty()) {
			visitingNode = queue.remove();
			if(visitingNode != null) {
				for(Node neighborNode : visitingNode.getAdjacent()) {
					if(neighborNode.state == NodeStates.Unvisited) {
						if(neighborNode == n2) {
							return true;							
						}else {
							neighborNode.state = NodeStates.Visiting;
							queue.add(neighborNode);
						}
					}
				}
				visitingNode.state = NodeStates.Visited;
			}
		}
		return false;
	}
	public static void main(String[] args) {
		Question1 test = new Question1();
		Graph g1 = new Graph();
		Node n1 = new Node();
		Node n2 = new Node();
		Node n3 = new Node();
		Node n4 = new Node();
		Node n5 = new Node();
		g1.addNode(n1);
		g1.addNode(n2);
		g1.addNode(n3);
		g1.addNode(n4);
		g1.addNode(n5);
		g1.connectNode(n1, n2);
		g1.connectNode(n1, n3);
		g1.connectNode(n1, n4);
		g1.connectNode(n1, n5);
		g1.connectNode(n2, n3);
		System.out.println(test.hasRouteBetweenNodes(g1, n5, n2));
		Node n6 = new Node();
		System.out.println(test.hasRouteBetweenNodes(g1, n1, n6));
	}
}
