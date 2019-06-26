package chapter4;

import java.util.ArrayList;

public class Graph {
	public ArrayList<Node> nodes = new ArrayList<Node>();
	
	public void addNode(Node n1) {
		this.nodes.add(n1);
	}
	public void connectNode(Node n1, Node n2) {
		if(!n1.getAdjacent().contains(n2)) {
			n1.adjacent.add(n2);
			n2.adjacent.add(n1);
		}
		
	}	
	
	public boolean hasNode(Node n1) {
		for(Node n : nodes) {
			if(n.equals(n1)) {
				return true;
			}
		}
		return false;
	}
	

	
}
