package edu.caio.exercicios.ExE10;


import java.util.Arrays;

public class Solutions {
	public static boolean hasDuplicate(int[] nums) {
		
		Arrays.sort(nums);
		int n = nums.length;
		for(int i = 1 ; i < n; i++) {
			if(nums[i] == nums[i - 1]) {
				return true;
			}
		}
		return false;
	}
}
