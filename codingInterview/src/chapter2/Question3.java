package chapter2;

public class Question3 {
	public void deleteMiddleNode(LinkedList ll) {
		int length = lengthOfLinkedList(ll);
		LinkedList.Node node = ll.head;
		for(int i=0;i<(length/2) - 1;i++) {
			node = node.next;
		}
		node.next = node.next.next;
	}
	public int lengthOfLinkedList(LinkedList ll) {
		int length = 0;
		LinkedList.Node n = ll.head;
		while(n != null) {
			length++;
			n = n.next;			
		}
		return length;
	}
	public static void main(String[] args) {
		Question3 test = new Question3();
		LinkedList ll = new LinkedList();
		ll.addFiveRandomElements();
		ll.printList();
		System.out.println("===========");
		test.deleteMiddleNode(ll);
		ll.printList();
	}
}
