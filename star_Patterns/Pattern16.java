package star_Patterns;

public class Pattern16 {

	public static void show(char n) {

		for (char i = 'A'; i <= n; i++) {

			for (char j = 'A'; j <= i; j++) {
				System.out.print(i);
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		show('E');
	}
}
