package star_Patterns;

public class Pattern19 {

	public static void show(int n) {
		for(int i = 1; i <= n; i++) {
			
			for(int j = n; j >= i; j--) {
				System.out.print("*");
			}
			
			for(int j = 2; j <= 2*i-1; j++){
				System.out.print(" ");
			}
			
			for(int j = n; j >= i; j--) {
				System.out.print("*");
			}System.out.println();
		}
		
		for(int i = 1; i <= n; i++) {
			
			for(int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			for(int j = 2*n-1; j >= 2*i; j--) {
				System.out.print(" ");
			}
			for(int j = 1; j <= i; j++) {
				System.out.print("*");
			}System.out.println();	
		}
	}
	public static void main(String[] args) {
		show(5);
	}
}
