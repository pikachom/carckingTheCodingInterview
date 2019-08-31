package chapter8;

import java.util.Arrays;

public class Question1 {
	public int countNumberOfCaseHop(int stair) {
		int[] cache = new int[stair+1];
		Arrays.fill(cache, -1);
		return countNumberOfCaseHop(stair, cache);
		
	}
	public int countNumberOfCaseHop(int stair, int[] cache) {
		if(stair<0) {
			return 0;
		}else if(stair==0) {
			return 1;
		}else if(cache[stair] > -1) {
			return cache[stair];
		}else {
			int result = countNumberOfCaseHop(stair-1, cache)+
						countNumberOfCaseHop(stair-2, cache)+
						countNumberOfCaseHop(stair-3, cache);
			cache[stair] = result;
			return result;
		}
	}
	public static void main(String[] args) {
		Question1 test = new Question1();
		System.out.println(test.countNumberOfCaseHop(5));
	}

}
