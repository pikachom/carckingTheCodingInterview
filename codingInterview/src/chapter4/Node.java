package chapter4;

public class Node {
	public String name;
	public Node[] adjacent;
	public NodeStates state;
	
	public Node[] getAdjacent(){
		return this.adjacent;
	}
	
	enum NodeStates{
		Unvisited, Visited, Visiting;
	}
}

