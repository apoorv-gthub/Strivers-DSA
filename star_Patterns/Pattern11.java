package star_Patterns;

public class Pattern11 {

	public static void show(int n) {
		int start;
		
		for(int i = 1; i <= 5; i++) {
		if(i%2 == 0) {
			start = 0;
		}else start = 1;
		
		for(int j = 0; j < i; j++) {
			System.out.print(start);
			start = 1 - start;
		}System.out.println();
		
		}
	}
	public static void main(String[] args) {
		show(5);
	}
}
