package romanToInt;

import java.util.LinkedHashMap;

public class RomanToInt {

	public static void main(String[] args) {
		System.out.println("Testing III");
		System.out.printf("%d\n", romanInt("III"));
		
		System.out.println("Testing IIII");
		System.out.printf("%d\n", romanInt("IIII"));
		
		System.out.println("Testing IV");
		System.out.printf("%d\n", romanInt("IV"));

		System.out.println("Testing IX");
		System.out.printf("%d\n", romanInt("IX"));
	
		System.out.println("Testing LVIII");
		System.out.printf("%d\n", romanInt("LVIII"));
		
		System.out.println("Testing MCMXCIV");
		System.out.printf("%d\n", romanInt("MCMXCIV"));
	}
	
	public static int romanInt(String s) {
		/*	I - 1
		 *  V - 5
		 *  X - 10
		 *  L - 50
		 *  C - 100
		 *  D - 500
		 *  M - 1000
		 */
		LinkedHashMap<Character, Integer> numerals= new LinkedHashMap<Character, Integer>();
		numerals.put('I', 1);
		numerals.put('V', 5);
		numerals.put('X', 10);
		numerals.put('L', 50);
		numerals.put('C', 100);
		numerals.put('D', 500);
		numerals.put('M', 1000);
		int intVal = 0;
		for(int i = 0; i < s.length() ; i++) {
			if(i+1 < s.length()) {
				//check for subtraction if the next character is larger than current 
				if(numerals.get(s.charAt(i)) < numerals.get(s.charAt(i+1))) {
					intVal -= numerals.get(s.charAt(i));
				}
				//if next char is not larger, add together
				else {
					intVal += numerals.get(s.charAt(i));
				}
			}
			else {
				intVal += numerals.get(s.charAt(i));
			}
		}
		
		return intVal;
	}

}
