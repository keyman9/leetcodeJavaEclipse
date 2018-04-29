package jewelsAndStones;

import static org.junit.Assert.assertEquals;

public class JewelsAndStones {

	public static void main(String[] args) throws AssertionError {
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
