package chap2;

public class Question2_2 {
	public LinkedListNode kToLast(LinkedListNode ll, int k) {
		LinkedListNode.Node n = ll.head;
		int index = 1;
		while(n != null) {
//			if(index >= k) {
//				n.next = n.next.next;
//				
//			}
//			index++;
			if(index++ >= k) {
				ll.head = n;
				break;
			}
			n= n.next;
		}
		
		
		
		
		return ll;
	}
	public static void main(String[] args) {
		LinkedListNode ll = new LinkedListNode();
		ll.appendToTail(1);
		ll.appendToTail(2);
		ll.appendToTail(3);
		ll.appendToTail(4);
		ll.appendToTail(5);
		ll.appendToTail(6);
		ll.appendToTail(7);
		ll.appendToTail(8);
		ll.appendToTail(9);
		ll.appendToTail(10);
		ll.printList();
		System.out.println("====================================");
		Question2_2 test = new Question2_2();
		test.kToLast(ll, 2).printList();
		
	}
}
