package chap1;

import java.util.Arrays;

public class Question2 {
	public boolean checkPermutation(String first, String second){
		char[] firstArr = first.toCharArray();
		char[] secondArr = second.toCharArray();
		
		Arrays.sort(firstArr);
		Arrays.sort(secondArr);		
		
		
		if(Arrays.equals(firstArr,secondArr)) {
			return true;
		}		
		return false;
	}
	public static void main(String[] args) {
		String first = "Aabc";
		String second = "acbA";
		
		Question2 test = new Question2();
		System.out.println(test.checkPermutation(first, second));
		
	}
}
