package star_Patterns;

public class Pattern15 {
	public static void show(char n) {
		for(char i = n; i >= 'A'; i--) {
			for(char j = 'A'; j <= i; j++) {
				System.out.print(j);
			}System.out.println();
		}
		
	}
	public static void main(String[] args) {
		show('E');
	}
}
