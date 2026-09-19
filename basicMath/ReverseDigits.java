package basicMath;

public class ReverseDigits {

	public static void main(String[] args) {
		
		int n = 7789;
		int reverseNumber = 0;
		
		while(n > 0) {
			
			int lastDigit = n% 10;
			
			n = n/10;
			
			reverseNumber = (reverseNumber * 10) + lastDigit;
		}
	}
}
