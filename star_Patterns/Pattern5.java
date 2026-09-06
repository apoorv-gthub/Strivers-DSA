package star_Patterns;

public class Pattern5 {
	
	public static void show() {
		
		int n5 = 5;
		
		for(int i = n5; i >= 1; i--) {
			for(int j = i; j>= 1; j--) {
				System.out.print("* ");
			}System.out.println();
		}
	}
	
	public static void main(String[] args) {
		show();
	}
}
