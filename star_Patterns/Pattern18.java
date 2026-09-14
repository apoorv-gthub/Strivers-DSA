package star_Patterns;

public class Pattern18 {

	public static void show(char n) {
		for(char i = n; i >= 'A'; i--) {
			
			for(char j = i; j <= n; j++) {
				System.out.print(j+" ");
			}System.out.println();
		}
	}
	public static void main(String[] args) {
		show('E');
	}

}
