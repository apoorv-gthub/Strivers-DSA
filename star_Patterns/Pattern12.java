package star_Patterns;

public class Pattern12 {

	public static void show(int n) {
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(j);
			}
			for (int j = 2 * n - 1; j >= i * 2; j--) {
				System.out.print(" ");
			}
			for (int j = i; j >= 1; j--) {
				System.out.print(j);
			}
			System.out.println();

		}
	}

	public static void main(String[] args) {
		show(4);
	}
}
