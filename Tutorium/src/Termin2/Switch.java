package Termin2;

import java.util.Scanner;

public class Switch {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Bitte geben Sie einen Wochentag ein");
		String dayOfWeek = scanner.nextLine();
		scanner.close();
		
		System.out.println("Methode liefert: " + getDayOfWeekId(dayOfWeek));
	}
	
	public static int getDayOfWeekId(String dayOfWeek) {
		switch (dayOfWeek.toLowerCase()) {	// in Kleinbuchstaben umwandeln, damit User sowohl klein als auch groﬂ schreiben kann
			case "montag": return 0;
			case "dienstag": return 1;
			case "mittwoch": return 2;
			case "donnerstag": return 3;
			case "freitag": return 4;
			case "samstag": return 5;
			case "sonntag": return 6;
			default: return -1;
		}
	}
}
