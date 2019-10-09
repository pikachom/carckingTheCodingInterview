package chapter8;

import java.util.HashSet;

public class Question7 {
	public HashSet<String> permutationWithoutDup(String input){
		HashSet<String> result = new HashSet<String>();
		if(input==null) {
			return null;
		}
		if(input.length()==0) {
			result.add("");
			return result;
		}
		String recurInput = input.substring(0, input.length()-1);
		String lastChar = input.substring(input.length()-1);
		
		HashSet<String> recurResult = permutationWithoutDup(recurInput);
		for(String recurPermutation : recurResult) {
			for(int i=0; i<=recurPermutation.length(); i++) {
				String front = recurPermutation.substring(0, i);
				String back = recurPermutation.substring(i);
				String permutation = front + lastChar + back;
				result.add(permutation);
			}
		}
		
		
		
		return result;
		
	}
	
	public static void main(String[] args) {
		Question8 test = new Question8();
		System.out.println(test.permutationWithoutDup("abc"));
//		System.out.println("abcde".substring(0, 4));
//		System.out.println("abcde".substring(4));
	}
}
