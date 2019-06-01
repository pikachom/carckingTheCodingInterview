package chap2;

//다른 자료형을(array같은) 안쓰고 해보고싶었는데 넘 어려워요

public class Question6 {
	public boolean checkPalindrome(LinkedList ll) {
		LinkedList.Node n = ll.head;
		int length = lengthOfLinkedList(ll);
		int[] intArr = new int[length];
		for(int i = 0; i<length; i++) {
			intArr[i] = n.data;
			n = n.next;
		}
//		for(int value : intArr){
//			System.out.println(value);
//		}
		
		for(int j = 0; j < length/2; j++) {
			if(intArr[j] != intArr[length-1-j]) {
				return false;
			}
		}		
		return true;
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
		LinkedList notPalindromeLL = new LinkedList();
		notPalindromeLL.addFiveRandomElements();
		LinkedList palindromeLL = new LinkedList();
		palindromeLL.appendToTail(1);
		palindromeLL.appendToTail(2);
		palindromeLL.appendToTail(3);
		palindromeLL.appendToTail(3);
		palindromeLL.appendToTail(2);
		palindromeLL.appendToTail(1);
		
		Question6 test = new Question6();
		
		System.out.println(test.checkPalindrome(notPalindromeLL));
		System.out.println(test.checkPalindrome(palindromeLL));
	}
}
