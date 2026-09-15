package star_Patterns;

public class Pattern22 {

	public static void show(int n) {

		for (int i = 0; i < 2 * n - 1; i++) {
			for (int j = 0; j < 2 * n - 1; j++) {
				int top = i;
				int bottom = (2 * n - 2) - i;
				int left = j;
				int right = (2 * n - 2) - j;

				int minDist = Math.min(Math.min(top, bottom), Math.min(right, left));

				System.out.print((n - minDist) + " ");
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		show(4);
	}

}
