package star_Patterns;

public class Pattern7 {

	public static void show(int n7) {
	
		for(int i = 0; i < n7; i++) {
			for(int j = 0; j < n7-i -1; j++) {
				System.out.print(" ");
			}
			for(int j = 0; j < 2*i+1; j++) {
				System.out.print("*");
			}
			for(int j = 0; j < n7-i-1; j++) {
				System.out.print(" ");
			}
			System.out.println();
		}
		
	}
	
	public static void main(String[] args) {
		show(5);
	}

}
