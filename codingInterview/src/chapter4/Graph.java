package chapter4;

import java.util.ArrayList;

public class Graph {
	public ArrayList<Node> nodes = new ArrayList<Node>();
//	public Graph(Node n1) {
//		this.nodes.add(n1);
//	}
	public boolean hasNode(Node n1) {
		for(Node n : nodes) {
			if(n.equals(n1)) {
				return true;
			}
		}
		return false;
	}
	

	
}
