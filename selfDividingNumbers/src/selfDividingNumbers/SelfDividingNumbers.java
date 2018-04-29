package selfDividingNumbers;

import static org.junit.Assert.assertEquals;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.Arrays;
import java.util.ArrayList;

public class SelfDividingNumbers {

	public static void main(String[] args) {
		int left = 1;
		int right = 22;
		List<Integer> test1 = new ArrayList<Integer>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 11, 12, 15, 22));
		List<Integer> input = selfDividingNumbers(left,right);
		System.out.println(test1);
		System.out.println(input);
		assertEquals(test1,input);
	}

	public static List<Integer> selfDividingNumbers(int left, int right) {
		List<Integer> myList = new ArrayList<Integer>();
		myList = IntStream.range(left,right+1)
						  .filter(i -> isSelfDividing(i))
						  .boxed()
						  .collect(Collectors.toList());;
		return myList;
	}
	 
	public static boolean isSelfDividing(int num) {
		String numString = Integer.toString(num);
		for(int i = 0; i < numString.length(); i++) {
			int testDigit = Integer.parseInt(String.valueOf(numString.charAt(i)));
			if(testDigit == 0) {
				return false;
			}
			else if(num % testDigit != 0){
				return false;
			}  
		 }
		 return true;
	}
}
