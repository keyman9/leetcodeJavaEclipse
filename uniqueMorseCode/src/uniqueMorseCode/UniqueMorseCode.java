package uniqueMorseCode;

import static org.junit.Assert.assertEquals;
import java.lang.StringBuilder;
import java.util.ArrayList;
import java.util.Arrays;

public class UniqueMorseCode {

	public static void main(String[] args) {
		String[] test1 = {"gin", "zen", "gig", "msg"};
		int test1Uniques = uniqueMorseRepresentations(test1);
		assertEquals(test1Uniques,2);
		System.out.printf("There are %d unique morse codes generated by %s.\n", test1Uniques,Arrays.toString(test1));
	}
	public static int uniqueMorseRepresentations(String[] words) {
		//Array for converting from char to String
		String[] englishMorse = {".-","-...","-.-.","-..",".","..-.",
								 "--.","....","..",".---","-.-",".-..",
								 "--","-.","---",".--.","--.-",".-.",
								 "...","-","..-","...-",".--","-..-",
								 "-.--","--.."};
		//'a' is 97 on the ascii table, but
		//will be converting using englishMorse array
		//so subtracting 97 will be the simplest way to create 
		//one-to-one conversion
		final int asciiOffset = 97;
		
		//Storage for the unique values of morse code generated by conversion
		ArrayList<String> uniqueCodes = new ArrayList<String>();
		
		
		//for each word in the input
		for(int i = 0; i < words.length; i++) {
			
			//mutable data structure rather than using String concatination
			StringBuilder code = new StringBuilder();
			
			//check each letter
			for(int j = 0; j < words[i].length(); j++) {
				//build the morse code
				code.append(englishMorse[words[i].charAt(j)-asciiOffset]);
			}
			
			//maintain uniqueness of morse codes
			//if the morse code is not present in the ArrayList
			if(!uniqueCodes.contains(code.toString())){
				//add it
				uniqueCodes.add(code.toString());
				System.out.printf("Added %s because it was not already added.\n", code.toString());
			}
		}
		System.out.printf("Unique codes: %s.\n", uniqueCodes.toString());
		
		//since all values in uniqueCodes are unique
		//return its size
		return uniqueCodes.size();
	}
}