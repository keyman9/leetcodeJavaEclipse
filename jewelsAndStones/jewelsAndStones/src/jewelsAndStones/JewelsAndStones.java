package jewelsAndStones;

import static org.junit.Assert.assertEquals;

public class JewelsAndStones {

	public static void main(String[] args) throws AssertionError {
		/*
		 * Description:
		 * You're given strings J representing the types of stones that are jewels,
		 *   and S representing the stones you have. Each character in S is a type of stone you have.
		 * You want to know how many of the stones you have are also jewels.
		 * 
		 * The letters in J are guaranteed distinct, and all characters in J and S are letters.
		 * Letters are case sensitive, so "a" is considered a different type of stone from "A".
		 * 
		 * Example 1:
		 * Input: J = "aA", S = "aAAbbbb"
		 * Output: 3
		 * 
		 * Example 2:
		 * Input: J = "z", S = "ZZ"
		 * Output: 0
		 * 
		 */
		assertEquals(numJewelsInStones("aA","aAAbbbb"), 3);
		assertEquals(numJewelsInStones("z","ZZ"),0);
		
		String J1 = new String("aA");
		String S1 = new String("aAAbbbb");
		System.out.printf("There are %d Jewels in the %s Stone.\n", numJewelsInStones(J1,S1), S1);
		
		String J2 = new String("z");
		String S2 = new String("ZZ");
		System.out.printf("There are %d Jewels in the %s Stone.\n", numJewelsInStones(J2,S2), S2);
	}
	
	public static int numJewelsInStones(String J, String S) {
		int count = 0;
		
		for(int i = 0; i < J.length(); i++) {
			for(int j = 0; j < S.length(); j++) {
				if(J.charAt(i) == S.charAt(j)) {
					count++;
				}
			}
		}
		
		return count;
	}
}
