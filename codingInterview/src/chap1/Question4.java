package chap1;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Set;


public class Question4 {
	public boolean palindromePermutation(String input){
		HashMap<Character, Integer> mCharCount= new HashMap<Character, Integer>();
		input = input.replaceAll("\\s","").toLowerCase();
		char[] tmp = input.toCharArray();
		Arrays.sort(tmp);
		for(int i=0; i<tmp.length; i++) {			
			if (mCharCount.get(tmp[i])==null) {
				mCharCount.put(tmp[i], 1);
			}else {
				int value = mCharCount.get(tmp[i]);
				mCharCount.replace(tmp[i], value+1);
			}			
		}
		Set<Character> keys = mCharCount.keySet();
		int mCountOddKeys = 0;
		for(char key : keys) {
			if(mCharCount.get(key) % 2 == 1) {
				mCountOddKeys++;
			}
		}		
		return (mCountOddKeys <= 1);
	}
	public static void main(String[] args) {
		Question4 test = new Question4();
		System.out.println(test.palindromePermutation("Tact Coa"));
	}
	

}
