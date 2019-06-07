package chapter3;

public class Question2 {
	public class StackWithMin extends MyStack<NodeWithMin>{
		public void push(int value) {
			
		}
		public NodeWithMin pop() {
			int value = super.pop();
			
			return value;
		}
	}
	
	class NodeWithMin{
		
	}
}
