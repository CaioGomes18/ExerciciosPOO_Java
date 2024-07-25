package edu.caio.exercicios.ExE10;

public class ContainsDuplicateClass {
	public static void main(String [] args) {
		//int []nums = {1,1,1,3,3,4,3,2,4};
		int [] nums = {1,2,3,3};
		//int [] nums = {1,2,3,4};
		boolean n = Solutions.hasDuplicate(nums);
		System.out.println("A lista que está sendo testada ela é "+ n);
		
	}
}
