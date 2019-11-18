package Termin3;
import java.util.Scanner;

public class Primzahlen {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);		
		System.out.println("Gib die prüfende Zahl ein");
		int givenNumber = scanner.nextInt();
		
		System.out.println("1 ist keine Primzahl");
		for (int currentNumber = 2; currentNumber <= givenNumber; currentNumber++) {

			if (isPrimeNumber(currentNumber)) {
				System.out.println(currentNumber + " ist eine Primzahl");
			} else {
				System.out.println(currentNumber + " ist keine Primzahl");				
			}
			
		}
		scanner.close();			
	} // main
	
	public static boolean isPrimeNumber(int number) {
		for (int divider = 2; divider < number; divider++) {
			if (number % divider == 0) {
				return false;
			}
		}
		return true;
	}

}
