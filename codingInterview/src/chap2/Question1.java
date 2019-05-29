package chap2;

import java.util.HashSet;

public class Question1 {
	public void removeDuplication(LinkedListNode ll) {
		LinkedListNode.Node n = ll.head;
		LinkedListNode.Node tmpNode  = null;
		HashSet<Integer> dataSet = new HashSet<Integer>();
		while(n.next != null) {			
			if(dataSet.contains(n.data)) {
				tmpNode.next = n.next;				
				//¾Æ´Ï¾¯¹úµµ´ëÃ¼¿Ö ¾ÈµÅ????
			}else {
				dataSet.add(n.data);
				tmpNode = n;
			}
			
			n = n.next;			
		}
				
	}
	public static void main(String[] args) {
		LinkedListNode ll = new LinkedListNode();
		ll.appendToTail(1);
		ll.appendToTail(2);
		ll.appendToTail(3);
		ll.appendToTail(3);
		ll.appendToTail(4);
		ll.appendToTail(3);
		ll.appendToTail(2);
		ll.appendToTail(1);
		ll.printList();
		System.out.println("====================================");
		Question1 test = new Question1();
		test.removeDuplication(ll);		
		ll.printList();
		
	}
}
