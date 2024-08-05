package edu.caio.exercicios.EXE12;

public class Input {
	public static void main(String[] args) {
		int [] nums = {3, 2 , 4};
		int target = 6;
		
		int []	resolution = new int[2];
		
		resolution = Solution.twoSum(nums, target);
		
		System.out.println(resolution[0]);
		System.out.println(resolution[1]);

	}
}
