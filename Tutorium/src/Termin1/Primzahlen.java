package Termin1;
import java.util.Scanner;

public class Primzahlen {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);		
		System.out.println("Gib die prüfende Zahl ein");
		int givenNumber = scanner.nextInt();
		boolean isPrimeNumber = true;
		
		// a)
		System.out.println("---------------------\na)\n---------------------");
		
		
		for (int divider = 2; divider < givenNumber; divider++) {
			if (givenNumber % divider == 0) {
				isPrimeNumber = false;
				break;
			}
		}
		if (isPrimeNumber) {
			System.out.println(givenNumber + " ist eine Primzahl");
		} else {
			System.out.println(givenNumber + " ist keine Primzahl");				
		}
		
		//alternative Ausgabe:
		//System.out.println(givenNumber + " ist " + (isPrimeNumber ? "eine" : "keine") + " Primzahl");
		
		
		// b)
		System.out.println("---------------------\nb)\n---------------------");
		
		
		System.out.println("1 ist keine Primzahl");
		for (int currentNumber = 2; currentNumber <= givenNumber; currentNumber++) {
			isPrimeNumber = true;
			for (int divider = 2; divider < currentNumber; divider++) {
				if (currentNumber % divider == 0) {
					isPrimeNumber = false;
					break; // -> Keine Primzahl, springe aus der inneren Schleife
				}
			}
			if (isPrimeNumber) {
				System.out.println(currentNumber + " ist eine Primzahl");
			} else {
				System.out.println(currentNumber + " ist keine Primzahl");				
			}
			
		}
		scanner.close();			
	}

}
