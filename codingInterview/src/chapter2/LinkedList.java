package chapter2;

public class LinkedList {
	
	public Node head = null;
	
	public Node deleteNode(Node head, int d){
		Node n = head;
		if(n.data == d){
			return head.next;
		}
		while(n.next!=null){
			if(n.next.data == d){
				n.next = n.next.next;
				return head;
			}
			n = n.next;
		}
		return head;
	}
	public void appendToTail(int d){
		Node end = new Node(d);
		if(this.head == null){
			this.head = end;
			return;
		}
		Node n = this.head;
		while(n.next != null){
			n = n.next;
		}
		n.next = end;
	}
	
	public void printList(){
		Node n = this.head;
		while(n != null){
			System.out.println(n.data);
			n = n.next;
		}
	}
	public void addFiveRandomElements() {
		for(int i=1; i<=5; i++) {
			int d = (int)(Math.random() * 10) + 1;
			this.appendToTail(d);
		}
	}
	
	public class Node{
		Node next = null;
		int data;
		
		public Node(int d){
			data = d;
		}
		
		
	}
}
