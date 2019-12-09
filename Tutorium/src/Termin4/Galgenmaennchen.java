package Termin4;

import java.util.Scanner;

public class Galgenmaennchen {
	//Bitte beachtet das dieser Code noch diverse Fehler und Dopplungen enthält. 
	//Er wurde zu verständniszwecken so einfach wie möglich gehalten

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
		char[] buchstaben = gesuchtesWort.toUpperCase().toCharArray(); //to UpperCase damit Groß/Kleinschreibung nicht beachtet werden muss
		
		int count = 0;
		for (int i = 0; i < buchstaben.length; i++) {
			for (int j = 0; j < errateneBuchstaben.length; j++) {
				if(errateneBuchstaben[j] == buchstaben[i]) { //gehe das Wort durch und schaue ob die einzelnen Buchstaben schon gefunden wurden
					count++;	//wenn ja erhöre den counter um 1
					break;
				}
			}
		}
		
		return buchstaben.length == count; //ist der Zähler gleich der Länge des Wortes, wurde das Wort erraten
	}
	
	public static void eingabeTest(String gesuchtesWort, char[] errateneBuchstaben, char eingabe) {
		char[] buchstaben = gesuchtesWort.toUpperCase().toCharArray(); //to UpperCase damit Groß/Kleinschreibung nicht beachtet werden muss
		
		for (int i = 0; i < buchstaben.length; i++) {
			if (buchstaben[i] == Character.toUpperCase(eingabe)) { //to UpperCase damit Groß/Kleinschreibung nicht beachtet werden muss
				for (int j = 0; j < errateneBuchstaben.length; j++) {
					if (errateneBuchstaben[j] == 0) { //erster freier Eintrag, da Arrays mit 0 initialisiert werden
						errateneBuchstaben[j] = buchstaben[i]; //schreibe gefundenen Buchstaben in den Array
						return;
					}
				}
			}
		}
	}
	
	public static void ausgabe(String gesuchtesWort, char[] errateneBuchstaben, int count) {
		char[] buchstaben = gesuchtesWort.toUpperCase().toCharArray(); //to UpperCase damit groß und Kleinschreibung nicht beachtet werden muss

		System.out.print(count + ". Versuch ");
		
		for (int i = 0; i < buchstaben.length; i++) {
			char buchstabe = '_';
			for (int j = 0; j < errateneBuchstaben.length; j++) {	//wurde der Buchstabe schon erraten)
				if(buchstaben[i] == errateneBuchstaben[j]) { 
					buchstabe = buchstaben[i];	//falls ja ersetze '_' durch den Buchstaben
					break;	//danach muss ich nicht weiter in den bereits erratenen Buchstaben suchen
				}
			}
			System.out.print(buchstabe + " "); //gebe '_' oder erratenen Buchstaben aus
		}
		System.out.println();
	}
}
