package Termin2;

public class Schleifen {
	public static void main(String[] args) {
		int n = 10;
		
		System.out.println("-------- while");
		
		// while
		while (n >= 0) {
			System.out.print(n + " ");
			--n;
		}
		
		System.out.println("\n");
		System.out.println("-------- do while");
		
		n = 10;
		
		// do while
		do {
			System.out.print(n + " ");
			--n;
		} while (n >= 0);	
		
		System.out.println("\n");
		System.out.println("-------- for");
		

		// for
		for (n = 10; n >= 0; n--) {
			System.out.print(n + " ");
		}
		
	}
}
