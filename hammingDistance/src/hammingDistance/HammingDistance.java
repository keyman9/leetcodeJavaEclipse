package hammingDistance;

import static org.junit.Assert.assertEquals;

public class HammingDistance {

	public static void main(String[] args) {
		/* Description:
		 * The Hamming distance between two integers is the number of positions
		 *   at which the corresponding bits are different.
		 * 
		 * Given two integers x and y, calculate the Hamming distance
		 *  where x>= 0 and y < 2^31
		 */
		int t1_x = 1;
		int t1_y = 4;
		int t1_dist = hammingDist(t1_x,t1_y);
		System.out.printf("The hamming distance betwen %d and %d is %d.\n", t1_x,t1_y,t1_dist);
		assertEquals(t1_dist,2);
	}
	
	public static int hammingDist(int x, int y) {
		int distance = 0;
		String xString = String.format("%32s", Integer.toBinaryString(x)).replace(' ', '0');
		String yString = String.format("%32s", Integer.toBinaryString(y)).replace(' ', '0');
		
		System.out.printf("xString: %s\nyString: %s.\n",xString,yString);
		for(int i = 0; i < xString.length() && i < yString.length(); i++) {
			
			if(xString.charAt(i) != yString.charAt(i)) {
				distance++;
			}
		}
		
		return distance;
	}
	
}
