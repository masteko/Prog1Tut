package Termin9;

public class IstZweistellig {

	public static void main(String[] args) {
		System.out.println("1: " + istZweistellig(1));
		System.out.println("9: " + istZweistellig(9));
		System.out.println("10: " + istZweistellig(10));
		System.out.println("-9: " + istZweistellig(-9));
		System.out.println("-10: " + istZweistellig(-10));
		System.out.println("50: " + istZweistellig(50));
		System.out.println("99: " + istZweistellig(99));
		System.out.println("100: " + istZweistellig(100));
		System.out.println("-99: " + istZweistellig(-99));
		System.out.println("-100: " + istZweistellig(-100));
		System.out.println("1000: " + istZweistellig(1000));

	}
	
	public static boolean istZweistellig(int arg) {
		return (arg > 9 && arg < 100) || (arg < -9 && arg > -100);
	}

}
