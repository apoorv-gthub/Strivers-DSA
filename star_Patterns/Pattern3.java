package star_Patterns;

public class Pattern3 {
	
	public static void show() {
		int n3 = 5;
		for(int i = 1; i <= n3; i++) {
			for(int j = 1; j <=i; j++) {
				System.out.print(j);
			}System.out.println();
		}
	}

	public static void main(String[] args) {
	show();
	}
}
