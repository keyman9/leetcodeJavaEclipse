package reverseString;

import static org.junit.Assert.assertEquals;


public class ReverseString {

	public static void main(String[] args) {
		/*
		 * Write a function that takes a string as input and returns the string reversed.
		 * Example:
		 * Given s = "hello", return "olleh".
		 */
		
		String t1_in = "hello";
		String t1_out = "olleh";
		assertEquals(t1_out, reverse(t1_in));

	}
	
	public static String reverse(String s) {
		StringBuilder reversed = new StringBuilder();
		for(char letter : s.toCharArray()) { reversed.insert(0,letter); }
		s = reversed.toString();
		return s;
	}

}
