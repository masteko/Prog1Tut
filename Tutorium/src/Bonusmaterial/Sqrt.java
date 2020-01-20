package Bonusmaterial;

import java.util.Scanner;

public class Sqrt {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Geben Sie die Zahl ein:");
		double zahl = scanner.nextDouble();
		
		System.out.println("Die genaeherte Wurzel von " + zahl + " ist: " + root(zahl));
		
		scanner.close();
	}
	
	public static double root(double x) {
		double naeherung = 1;
		
		do {
			naeherung = (naeherung + x/naeherung) / 2;
			
		} while (Math.abs(x/naeherung - naeherung) > 10e-15);
		
		return naeherung;
	}
}
