package longestPreInStringArray;

import java.util.Arrays;

public class PrefixInStringArray {

	public static void main(String[] args) {
		System.out.println("Testing Input = [flower,flow,flight]" );
		String[] test1 = new String[] {"flower","flow","flight"};
		System.out.printf("Common prefix: %s\n", commonPrefix(test1));
		
		System.out.println("Testing Input = ['piggy','piglet','pink']");
		String[] test2 = new String[] {"piggy","piglet","pink"};
		System.out.printf("Common prefix: %s\n", commonPrefix(test2));
		
		System.out.println("Testing Input = ['dog','racecar','car'");
		String[] test3 = new String[] {"dog","racecar","car"};
		System.out.printf("Common prefix: %s\n", commonPrefix(test3));
		
		System.out.println("Testing Input = ['abca','abc']");
		String[] test4 = new String[] {"abca","abc"};
		System.out.printf("Common prefix: %s\n", commonPrefix(test4));
		
		System.out.println("Testing Input = ['abba','abba']");
		String[] test5 = new String[] {"abba","abba"};
		System.out.printf("Common prefix: %s\n", commonPrefix(test5));
	}
	
	public static String commonPrefix(String[] strs) {
		String commonPre = "";
		if(strs != null && strs.length != 0) {
			//find the length of the shortest element, default being the first
			int maxLen = strs[0].length();
			for(int i = 1; i < strs.length; i++) {
				if(strs[i].length() < maxLen) {
					maxLen = strs[i].length();
				}
			}
			//sort the array
			Arrays.sort(strs);
			
			//for position 
			for(int pos = 0, str = 0; pos < maxLen && str < strs.length; pos++) 
			{
				//assume the char is part of the prefix
				boolean isPrefix = true;
				char pre = strs[str].charAt(pos);
				while(str < strs.length && pos < maxLen)
				{
					if(strs[str].charAt(pos) != pre) 
					{
						isPrefix = false;
					}
					str++;
				}
				if(isPrefix) 
				{
					commonPre += pre;
					str = 0;
				}
			}
		}	
		return commonPre;
		
	}
}
