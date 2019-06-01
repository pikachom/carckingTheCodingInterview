package chap2;

public class Question7 {
	public boolean hasIntersection(LinkedList longer, LinkedList shorter) {
		
		if(lengthOfLinkedList(shorter) > lengthOfLinkedList(longer)) {
			LinkedList tmp = new LinkedList();
			tmp = shorter;
			shorter = longer;
			longer = tmp;
		}
		while(lengthOfLinkedList(longer) != lengthOfLinkedList(shorter)) {
			longer.head = longer.head.next;
		}
		//���� ���̴� ��������
		LinkedList.Node nodeFromLonger = longer.head;
		LinkedList.Node nodeFromShorter = shorter.head;
		
		while(nodeFromLonger != null) {
			if(nodeFromLonger == nodeFromShorter) { // equals�� �ᵵ �Ȱ��� �۵���, ������ linkedlist�� ���빰�� [1]next��� ��ü�� �ּҰ� [2]data�� �ִ� int���̱� ������/
//			System.out.println(nodeFromLonger.data + " " + nodeFromLonger.next);
//			System.out.println(nodeFromShorter.data + " " + nodeFromShorter.next);
//			if(nodeFromLonger.equals(nodeFromShorter)) { 
				
				return true;
			}			
			nodeFromLonger = nodeFromLonger.next;
			nodeFromShorter = nodeFromShorter.next;
		}		
		return false;
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
		Question7 test = new Question7();
		LinkedList longer = new LinkedList();
		LinkedList shorter = new LinkedList();
		LinkedList intersectionShorter = new LinkedList();
		longer.appendToTail(1);
		longer.appendToTail(2);
		longer.appendToTail(3);
		longer.appendToTail(4);
		longer.appendToTail(5);
		shorter.appendToTail(3);
		shorter.appendToTail(4);
		shorter.appendToTail(5);
		intersectionShorter.appendToTail(6);
		intersectionShorter.head.next = longer.head.next.next;
		System.out.println("===longer===");
		longer.printList();
		System.out.println("===shorter(no intersection)===");
		shorter.printList();
		System.out.println("===shorter(yes intersection)===");
		intersectionShorter.printList();
		
		System.out.println("���ͼ��� ���� �� �׽�Ʈ ��� : " + test.hasIntersection(longer, shorter));
		System.out.println("���ͼ��� ���� �� �׽�Ʈ ��� : " + test.hasIntersection(longer, intersectionShorter));
	}
}
