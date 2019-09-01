package chapter8;

import java.util.ArrayList;

public class Question4 {
	public ArrayList<ArrayList<Integer>> powerSet(int[] nums){
		ArrayList<ArrayList<Integer>> finalResult = new ArrayList<ArrayList<Integer>>();
		ArrayList<Integer> currentSet = new ArrayList<Integer>();
		return powerSet(nums, currentSet, finalResult, 0);
	}
	private ArrayList<ArrayList<Integer>> powerSet(int[] nums, 
													ArrayList<Integer> currentSet, 
													ArrayList<ArrayList<Integer>> finalResult, 
													int startIndex){
		
		if(startIndex == nums.length) {
			finalResult.add(new ArrayList<Integer>());
			return finalResult;
		}
		for(int i=startIndex; i<nums.length; i++) {
			currentSet.add(nums[i]);
			ArrayList<Integer> tempSet = new ArrayList<Integer>(currentSet);
			if(!finalResult.contains(currentSet)) {
				finalResult.add(tempSet);
			}
			
			
			if(currentSet.size() == (nums.length - startIndex)) {
				currentSet.clear();
			}
		}
		
		powerSet(nums, currentSet, finalResult, startIndex+1);
		
		return finalResult;
	}
	public static void main(String[] args) {
		int[] nums = {1,2,3,4};
		Question4 test = new Question4();
		System.out.println(test.powerSet(nums));
	}
}
