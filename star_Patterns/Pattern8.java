package star_Patterns;

public class Pattern8 {
	
	public static void show(int n8) {
		for(int i = 0; i < n8; i++) {
			
			for(int j = 0; j < i; j++) {
				System.out.print(" ");
			}
			for(int j = i*2; j < n8*2-1; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		show(5);
	}

}
