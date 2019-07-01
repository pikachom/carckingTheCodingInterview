package chapter4;

import java.util.ArrayList;

public class KhNode {
	public String name = "";
	public ArrayList<KhNode> adjacent = new ArrayList<KhNode>();
	public NodeStates state;
	
	public ArrayList<KhNode> getAdjacent(){
		return this.adjacent;
	}
	enum NodeStates{
		Unvisited, Visited, Visiting;
	}
}

