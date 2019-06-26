package chapter4;

import java.util.ArrayList;

public class Node {
	public String name = "";
	public ArrayList<Node> adjacent = new ArrayList<Node>();
	public NodeStates state;
	
	public ArrayList<Node> getAdjacent(){
		return this.adjacent;
	}
	enum NodeStates{
		Unvisited, Visited, Visiting;
	}
}

