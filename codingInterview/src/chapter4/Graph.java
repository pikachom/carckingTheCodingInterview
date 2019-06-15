package chapter4;

import java.util.ArrayList;

public class Graph {
	public ArrayList<Node> nodes;
	
	public boolean hasNode(Node n1) {
		for(Node n : nodes) {
			if(n.equals(n1)) {
				return true;
			}
		}
		return false;
	}

	
}
