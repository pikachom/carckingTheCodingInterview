package chapter4;

public class Node {
	public String name;
	public Node[] children;
	
	enum State{
		Unvisited, Visited, Visiting;
	}
}

