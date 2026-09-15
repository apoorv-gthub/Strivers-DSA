package star_Patterns;

public class Pattern20 {

	public static void show(int n) {

		for (int i = 1; i <= n; i++) {

			for (int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			for (int j = 2 * i; j <= 2 * n - 1; j++) {
				System.out.print(" ");
			}
			for (int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		for (int i = 1; i <= n; i++) {

			for (int j = i; j < n; j++) {
				System.out.print("*");
			}
			for(int j= 2*i+3; j >= n-1; j--){
				System.out.print(" ");
			}
			for(int j = i; j < n; j++) {
				System.out.print("*");
			}System.out.println();

		}

	}

	public static void main(String[] args) {
		show(5);
	}

}
