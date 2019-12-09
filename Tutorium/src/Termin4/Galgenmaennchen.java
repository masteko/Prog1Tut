package Termin4;

import java.util.Scanner;

public class Galgenmaennchen {
	public static void main(String[] args) {
		String[] woerter = {"Tutorium", "Programmieren", "Computer"};
		Scanner scanner = new Scanner(System.in);
		final int maxRateAnzahl = 16;
		int anzahlRateVersuche = 1;
		boolean erraten = false;
		
		int index = (int) (Math.random() * woerter.length);
		String gesuchtesWort = woerter[index];
		
		char[] errateneBuchstaben = new char[gesuchtesWort.length()];
		System.out.println(gesuchtesWort);
		
		do {
			ausgabe(gesuchtesWort, errateneBuchstaben, anzahlRateVersuche);
			char eingabe = scanner.nextLine().charAt(0);
			eingabeTest(gesuchtesWort, errateneBuchstaben, eingabe);
			erraten = wurdeWortErraten(gesuchtesWort, errateneBuchstaben);
			anzahlRateVersuche++;
		} while (!erraten && anzahlRateVersuche < maxRateAnzahl);
		ausgabe(gesuchtesWort, errateneBuchstaben, anzahlRateVersuche);
		
		scanner.close();
	}
	
	public static boolean wurdeWortErraten(String gesuchtesWort, char[] errateneBuchstaben) {
		char[] buchstaben = gesuchtesWort.toUpperCase().toCharArray();
		
		int sum = 0;
		for (int i = 0; i < buchstaben.length; i++) {
			for (int j = 0; j < errateneBuchstaben.length; j++) {
				if(errateneBuchstaben[j] == buchstaben[i]) {
					sum++;
					break;
				}
			}
		}
		
		return buchstaben.length == sum;
	}
	
	public static void eingabeTest(String gesuchtesWort, char[] errateneBuchstaben, char eingabe) {
		char[] buchstaben = gesuchtesWort.toUpperCase().toCharArray();
		
		for (int i = 0; i < buchstaben.length; i++) {
			if (buchstaben[i] == Character.toUpperCase(eingabe)) {
				for (int j = 0; j < errateneBuchstaben.length; j++) {
					if (errateneBuchstaben[j] == 0) {
						errateneBuchstaben[j] = buchstaben[i];
						return;
					}
				}
			}
		}
	}
	
	public static void ausgabe(String gesuchtesWort, char[] errateneBuchstaben, int count) {
		char[] buchstaben = gesuchtesWort.toUpperCase().toCharArray();

		System.out.print(count + ". Versuch ");
		
		for (int i = 0; i < buchstaben.length; i++) {
			char buchstabe = '_';
			for (int j = 0; j < errateneBuchstaben.length; j++) {
				if(buchstaben[i] == errateneBuchstaben[j]) {
					buchstabe = buchstaben[i];
					break;
				}
			}
			System.out.print(buchstabe + " ");
		}
		System.out.println();
	}
}
