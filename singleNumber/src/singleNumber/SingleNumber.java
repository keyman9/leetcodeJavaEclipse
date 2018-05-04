package singleNumber;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;

public class SingleNumber {
	/*
	 * Description:
	 * Given a non-empty array of integers, every element appears twice except for one.
	 * Find that single non-repeated number.
	 * 
	 * Note:
	 * Your algorithm should have a linear runtime complexity.
	 * Could you implement it without using extra memory?
	 * 
	 * Example 1:
	 * Input: [2,2,1]
	 * Output: 1
	 * 
	 * Example 2:
	 * Input: [4,1,2,1,2]
	 * Output: 4
	 */
	public static void main(String[] args) {
		int[] t1_in = {2,2,1};
		int t1_out = 1;
		assertEquals(singleNum(t1_in),t1_out);
		
		int[] t2_in = {7,7, 9,9, 102395,102395, 99230,99230, 12053,12053, 79901};
		int t2_out = 79901;
		assertEquals(singleNum(t2_in),t2_out);
		
		int[] t3_in = {4,1,2,1,2};
		int t3_out = 4;
		assertEquals(singleNum(t3_in),t3_out);
		
		System.out.println("All test cases passed!");
	}
	
	public static int singleNum(int[] nums) {
		int num = 0;
		Arrays.sort(nums);
		for(int i = 0; i < nums.length; i++) {
			num = nums[i];
			if(i+1 < nums.length) {
				if(nums[i+1] != num) {
					return num;
				}
			}
			i++;
		}
		
		return num;
	}
}
