package Bonusmaterial;

/**
 * Schachbrett
 */
public class Schachbrett {

    public static void main(String[] args) {
        char[][] feld = initialisiereSchachbrett();

        for (int i = 0; i < feld.length; i++) {
            System.out.print(String.valueOf(feld[i]));
            System.out.println();
        }
    }

    public static char[][] initialisiereSchachbrett() {
        char[][] result = new char[8][8];

        for (int row = 0; row < result.length; row++) {
            for (int col = 0; col < result[row].length; col++) {
                result[row][col] = (row == 1 || row == 6) ? 'B' : 'L';
            }
        }

        return result;
    }
}