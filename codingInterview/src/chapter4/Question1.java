package chapter4;

import java.util.LinkedList;
import java.util.Queue;

import chapter4.KhNode.NodeStates;

public class Question1 {
	public boolean hasRouteBetweenNodes(KhGraph g1, KhNode fromNode, KhNode toNode) {
		//
		if(!g1.hasNode(fromNode)||!g1.hasNode(toNode)) {
			return false;
		}
		
		//		
		for(KhNode n1 : g1.nodes) {
			n1.state = NodeStates.Unvisited;
		}		
		//
		return breadthFirstSearch(fromNode, toNode);		
	}
	public boolean breadthFirstSearch(KhNode n1, KhNode n2) {
		Queue<KhNode> queue = new LinkedList<KhNode>();
		n1.state = NodeStates.Visiting;
		queue.add(n1);
		KhNode visitingNode;
		while(!queue.isEmpty()) {
			visitingNode = queue.remove();
			if(visitingNode != null) {
				for(KhNode neighborNode : visitingNode.getAdjacent()) {
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
		KhGraph g1 = new KhGraph();
		KhNode n1 = new KhNode();
		KhNode n2 = new KhNode();
		KhNode n3 = new KhNode();
		KhNode n4 = new KhNode();
		KhNode n5 = new KhNode();
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
		KhNode n6 = new KhNode();
		System.out.println(test.hasRouteBetweenNodes(g1, n1, n6));
	}
}
