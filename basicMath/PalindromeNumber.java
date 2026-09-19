package basicMath;

public class PalindromeNumber {

	public static void main(String[] args) {
		
		boolean isPalindrome = false;
		int n = 1342431;
		int x = n;
		int revNo = 0;
		
		while(n > 0) {
			int lastDigit = n % 10;
			n = n/10;
			
			revNo = (revNo * 10) + lastDigit;
		}
		if(x == revNo) {
			isPalindrome = true;
		}
		System.out.println(isPalindrome);
	}

}
