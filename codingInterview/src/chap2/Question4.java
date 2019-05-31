package chap2;

public class Question4 {
	public LinkedListNode dividePartition(LinkedListNode ll, int partition) {
		LinkedListNode left = new LinkedListNode();
		LinkedListNode right = new LinkedListNode();		
		LinkedListNode.Node n = ll.head;
		//LinkedListNode.Node rNode = right.head; 여기에 이걸 넣어놓으면 계속 head가 null인 문제가 있었음...
		
		
		while(n != null) {
			if(n.data < partition) {
				left.appendToTail(n.data);
			}else {
				right.appendToTail(n.data);
			}
			n = n.next;
		}
		
		LinkedListNode.Node rNode = right.head;
				
		while(rNode != null) {
			left.appendToTail(rNode.data);
			rNode = rNode.next;
		}
		
		return left;
	}
	public static void main(String[] args) {
		LinkedListNode ll = new LinkedListNode();
		ll.appendTenRandomElements();
		ll.printList();
		System.out.println("======================");
		Question4 test = new Question4();
		test.dividePartition(ll, 5).printList();
	}
	
	
}
