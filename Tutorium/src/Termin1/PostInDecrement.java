package Termin1;

public class PostInDecrement {
	public static void main(String[] args) {
		// --n/++n berechne erst das neue n und gebe das neue n zur�ck
		// n--/n++ gebe erst altes n zur�ck und berechne anschlie�end das neue n

		int n = 5;
		
		System.out.println(n);		// 5
		System.out.println(--n);	// 4
		System.out.println(n);		// 4
		System.out.println(n--);	// 4
		System.out.println(n);		// 3
	}
}
