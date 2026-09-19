package basicMath;

public class ArmstrongNumber {

	public static void main(String[] args) {
		
		boolean isArmstrong = false;
		int n = 371;
		int sum = 0;
		int x = n;
		while(n > 0) {
			int lastDigit = n % 10;
			sum = sum + (lastDigit * lastDigit * lastDigit);
			n = n / 10;
			
		}
		if(sum == x) {
			isArmstrong = true;
		}
		System.out.println(isArmstrong);
	}
}
