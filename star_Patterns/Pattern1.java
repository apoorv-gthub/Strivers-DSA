package star_Patterns;

public class Pattern1 {
	
	
	public static int n = 5;
	
	
	public static void show() {
		for(int i = 0; i < n; i++) {
			for(int j = 0; j < n; j++) {
				System.out.print("* ");
			}System.out.println();
		}
	}
	
	public static void main(String[] args) {
		show();
		
	}

}
