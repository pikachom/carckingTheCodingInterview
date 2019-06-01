package chap2;

import java.util.HashSet;

import chap2.LinkedList.Node;

public class Question8 {
	public Node loopDetection(LinkedList ll) {
		HashSet<Node> nodeSet= new HashSet<Node>();
		Node node = ll.head;
		while(node != null) {
			if(nodeSet.contains(node)) {
				return node;
			}
			nodeSet.add(node);
			node = node.next;			
		}		
		return null;
	}
	public static void main(String[] args) {
		LinkedList ll = new LinkedList();
		ll.appendToTail(1);
		ll.appendToTail(2);
		ll.appendToTail(3);
		ll.appendToTail(4);
		ll.appendToTail(5);
		Question8 test = new Question8();
		System.out.println(test.loopDetection(ll));
		
		LinkedList ll2 = new LinkedList();
		ll2.appendToTail(1);
		ll2.appendToTail(2);		
		ll2.appendToTail(3);
		ll2.appendToTail(4);
		ll2.appendToTail(5);
		ll2.head.next.next.next.next.next = ll2.head.next.next;
		System.out.println(test.loopDetection(ll2).data);
	}
}
