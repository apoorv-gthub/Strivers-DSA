package star_Patterns;

public class Pattern17 {

	public static void show(char n) {

		for (char i = 'A'; i <= n; i++) {
			for (char j = n; j >= i; j--) {
				System.out.print(" ");
			}

			for (char j = 'A'; j <= i; j++) {
				System.out.print(j);
			}
			for (char j = (char) (i - 1); j >= 'A'; j--) {
				System.out.print(j);
			}System.out.println();
		}
	}

	public static void main(String[] args) {
		show('E');
	}
}
