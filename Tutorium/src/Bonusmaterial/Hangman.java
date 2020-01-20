package Bonusmaterial;

import java.util.Scanner;

/**
 * Aufgabe3
 * Hangman mit sehr wenig Codezeilen
 */
public class Hangman {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] words = { "Programmiersprache", "Studium", "Hochhaus", "Schifffahrt",
            "Hoersaal", "Ich", "bin", "zu", "Faul", "mir", "zwanzig", "Woerter", "auszudenken",
            "Wasser", "Flasche", "Tastatur", "Steckdose", "Monitor", "Tisch", "Fisch" }; //Initialisiere W�rter
        int tries = 1; // Anzahl der Versuche
        char c; // zwischenspeicher f�r die for schleife in Zeile 26
        char guess; //Aktueller Versuch
        String word = words[(int) (Math.random() * words.length)].toUpperCase(); //lese ein zuf�lliges Wort
        int gaps = word.length(); //Anzahl der L�cken (wird mit der Zeit kleiner)
        char[] foundCharacters = new char[word.length()];

        do {
            System.out.print(tries++ + ". Versuch: ");
            for (int i = 0; i < foundCharacters.length; i++) {
                c = foundCharacters[i];
                System.out.print((c != 0 ? c : '_') + " "); //Gebe die gefundenen Buchstaben bzw. unterstriche aus
            }
            System.out.println();
            guess = scanner.nextLine().toUpperCase().toCharArray()[0]; //lese den gesch�tzten char ein (als Gro�buchstabe)

            if (String.valueOf(foundCharacters).indexOf(guess) == -1) { //Kommt die Eingabe im gesuchten Wort vor?
                for (int i = word.indexOf(guess); i >= 0; i = word.indexOf(guess, i + 1)) { //Dann setzte den richtig erraten Buchstaben an der richtigen Stelle des Arrays ein (damit die Ausgabe passt)
                    foundCharacters[i] = word.charAt(i);
                    gaps--;
                }
            }
        } while(tries <= 15 && gaps > 0); //Keine Versuche mehr oder Wort erraten?
        //TODO hier kann noch eine sch�ne Ausgabe erfolgen
        scanner.close();
    }
}