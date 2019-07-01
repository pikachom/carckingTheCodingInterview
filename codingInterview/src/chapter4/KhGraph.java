package chapter4;

import java.util.ArrayList;

public class KhGraph {
	public ArrayList<KhNode> nodes = new ArrayList<KhNode>();
	
	public void addNode(KhNode n1) {
		this.nodes.add(n1);
	}
	public void connectNode(KhNode n1, KhNode n2) {
		if(!n1.getAdjacent().contains(n2)) {
			n1.adjacent.add(n2);
			n2.adjacent.add(n1);
		}
		
	}	
	
	public boolean hasNode(KhNode n1) {
		for(KhNode n : nodes) {
			if(n.equals(n1)) {
				return true;
			}
		}
		return false;
	}
	

	
}
