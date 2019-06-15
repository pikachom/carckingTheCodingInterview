package chapter4;

public class Graph {
	public Node[] nodes;
	
	public boolean hasNode(Node n1) {
		for(Node n : nodes) {
			if(n.equals(n1)) {
				return true;
			}
		}
		return false;
	}
}
