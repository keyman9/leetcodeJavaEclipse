package reverseInt;

public class Reverse {

	public static void main(String args[]){
		System.out.println("Attempting to reverse '153'");
		System.out.printf("Reversed: %d\n", reverse(153));
		
		System.out.println("Attempting to reverse '1534236469'");
		System.out.printf("Reversed: %d\n", reverse(1534236469));
		  
	}
	
	public static int reverse(int x){
		int reversed = 0;
		while(x != 0) {
			int lastDigit = x % 10;
			int mayOverflow = reversed * 10 + lastDigit;
			if((mayOverflow - lastDigit) / 10 != reversed) {
				return 0;
			}
			reversed = mayOverflow;
			x /= 10;
		}
		return reversed;
	}
}