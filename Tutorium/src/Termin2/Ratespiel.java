package Termin2;

import java.util.Scanner;

public class Ratespiel {
	public static void main(String[] args) {
		int rand = (int) (Math.random() * 100 + 1);
		Scanner scanner = new Scanner(System.in);
		int guess;
		int maxGuesses = 5;
		int guessCounter = 1;

		do {
			System.out.println("Gib deine Schätzung ein: ");
			guess = scanner.nextInt();
			
			if (guess > rand) {
				System.out.println("Die gesuchte Zahl ist kleiner. Versuche: " + guessCounter + "/" + maxGuesses);
			} else if (guess < rand) {
				System.out.println("Die gesuchte Zahl ist größer. Versuche " + guessCounter + "/" + maxGuesses);
			}

			System.out.println();
		} while (guess != rand && guessCounter++ < maxGuesses);

		if (guess == rand) {
			System.out.println("Du hast die Zahl erraten! Es ist " + rand);			
		} else {
			System.out.println("Keine Versuche mehr übrig, leider verloren");
		}
		scanner.close();
	}
	
	
	
	
	public void alternative() {
		int rand = (int) (Math.random() * 100 + 1);
		Scanner scanner = new Scanner(System.in);
		boolean gameOver = false;
		int guess;

		do {
			System.out.println("Gib deine Schätzung ein: ");
			guess = scanner.nextInt();
			
			if (guess > rand) {
				System.out.println("Die gesuchte Zahl ist kleiner");
			} else if (guess < rand) {
				System.out.println("Die gesuchte Zahl ist größer");
			} else {
				gameOver = true;
				System.out.println("Du hast die Zahl erraten! Es ist " + rand);
				break;
			}
			
			System.out.println(); //Leerzeile für eine geordnete Ausgabe
		} while (!gameOver);
	
		
		scanner.close();
	}

}
