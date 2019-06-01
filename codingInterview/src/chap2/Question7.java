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
		//이제 길이는 같아졌음
		LinkedList.Node nodeFromLonger = longer.head;
		LinkedList.Node nodeFromShorter = shorter.head;
		
		while(nodeFromLonger != null) {
			if(nodeFromLonger == nodeFromShorter) { // equals를 써도 똑같이 작동함, 이유는 linkedlist의 내용물은 [1]next라는 객체의 주소값 [2]data에 있는 int값이기 때문에/
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
		
		System.out.println("인터섹션 없을 때 테스트 결과 : " + test.hasIntersection(longer, shorter));
		System.out.println("인터섹션 있을 때 테스트 결과 : " + test.hasIntersection(longer, intersectionShorter));
	}
}
