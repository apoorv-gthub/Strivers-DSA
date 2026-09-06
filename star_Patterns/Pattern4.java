package star_Patterns;

public class Pattern4 {

	public static void show(){
		
		int n4 = 5;
		
		for(int i =1; i <= n4; i++) {
			for(int j = 1; j <= i; j++) {
				System.out.print(i);
			}System.out.println();
		}
	}
	
	public static void main(String[] args) {	
		show();
	}

}
