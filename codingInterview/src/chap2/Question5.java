package chap2;

public class Question5 {
	public int sumList(LinkedListNode list1, LinkedListNode list2) {		
		return getNumberFromLinkedList(list1) + getNumberFromLinkedList(list2);
	}
	public int getNumberFromLinkedList(LinkedListNode ll) {
		LinkedListNode.Node node = ll.head;
		int result = 0;
		int power = 0;
		int tmp = 0;
		while(node != null) {
			tmp = node.data;
			tmp = (int) (tmp * Math.pow(10,power));
			result = result + tmp;
//			System.out.println(result);
//			System.out.println(tmp);
//			System.out.println(power);
			power++;
			node = node.next;
		}
		return result;
	}
	public static void main(String[] args) {
		LinkedListNode ll = new LinkedListNode();
		LinkedListNode ll2 = new LinkedListNode();
		ll.addFiveRandomElements();
		ll2.addFiveRandomElements();
		Question5 test = new Question5();
		System.out.println(test.getNumberFromLinkedList(ll));
		System.out.println(test.getNumberFromLinkedList(ll2));
		System.out.println(test.sumList(ll, ll2));
		
	}
}
