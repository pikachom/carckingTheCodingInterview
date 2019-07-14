package chapter5;

import java.lang.Integer;
public class Question7 {
	public int pairwiseSwap(int num) {
		return ( ((num&170) >>> 1) | ((num&85)<<1) );
	}
	
	public static void main(String[] args) {
		int num = Integer.parseInt("10101010", 2);
		System.out.println(num); // answer = 170
		int num2 = Integer.parseInt("01010101", 2);
		System.out.println(num2); // answer = 85
		Question7 test = new Question7();
		System.out.println(test.pairwiseSwap(170));
	}
}
