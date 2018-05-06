package moveZeroes;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;

public class MoveZeroes {
	/*
	 * Description:
	 * Given an array nums, write a function to move all 0's to the end of it while maintaining the relative order of the non-zero elements.
	 * For example, given nums = [0,1,0,3,12], after calling your function
	 * 					  numes should be [1,3,12,0,0].
	 * 
	 * Note:
	 * 1. You must do this in-place without making a copy of the array.
	 * 2. Minimize the total number of operations
	 */

	public static void main(String[] args) {
		int[] t1_in = {0, 1, 0, 3, 12};
		int[] t1_out = {1, 3, 12, 0, 0};
		
		moveZeroes(t1_in);
		assertEquals(Arrays.toString(t1_out),Arrays.toString(t1_in));
		
		int[] t2_in = {0,1};
		int[] t2_out = {1,0};
		moveZeroes(t2_in);
		assertEquals(Arrays.toString(t2_out),Arrays.toString(t2_in));
		
		int[] t3_in = {1,0,0};
		int[] t3_out = {1,0,0};
		moveZeroes(t3_in);
		assertEquals(Arrays.toString(t3_out),Arrays.toString(t3_in));
	}
	
	public static void moveZeroes(int[] nums) {
		
		int temp = 0;
		for(int i = 0,j=0; i < nums.length; i++) {
			if(nums[i] != 0) {
				//move it toward the front of the array
				temp = nums[j];
				nums[j] = nums[i];
				nums[i] = temp;
				j++;
			}
		}
	
	}

}
