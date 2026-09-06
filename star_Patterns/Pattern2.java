package star_Patterns;

public class Pattern2 {

	public static void show() {
		
		int n2 = 5;
		
		for(int i = 0; i < n2; i++) {
			for(int j = 0; j <= i; j++) {
				System.out.print("* ");
			}System.out.println();
		}
	}
	
	
	public static void main(String[] args) {
		show();
		
		
	}

}
