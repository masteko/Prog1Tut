package Termin9;

public class Addierer {

	public static void main(String[] args) {
		int[] zahl1 = {3, 4, 2};
		int[] zahl2 = {6, 2, 9};
		
		int[] erg = addiere(zahl1, zahl2);
		
		for (int d : erg) {
			System.out.print(d); //Gebe die Zahl aus
		}
		
		System.out.println();
	}

	public static int [] addiere(int[] zahl1, int[] zahl2) {
 		int tmp[] = new int[zahl1.length + 1];
		int overflow = 0;
		int value;
		
		for (int i = zahl1.length - 1; i >= 0; i--) {
			value = (zahl1[i] + zahl2[i] + overflow) % 10; //Addiere die Werte
			overflow = (zahl1[i] + zahl2[i] + overflow) / 10; //Setze möglichen overflow
			tmp[i + 1] = value;
		}
		
		tmp[0] = overflow; //füge dem MSB den overflow hinzu (der kann natürlich 0 sein)
		
		int leadingZeroCount = 0;
		for (int i = 0; i < tmp.length; i++) { //ermittle die Anzahl der führenden Nullen
			if (tmp[i] == 0) leadingZeroCount++;
			else break;
		}
		
		if (leadingZeroCount == 0) { //Wenn es keine führenden Nullen gibt, gebe tmp als ergebnis zurück
			return tmp;			
		} else {	//Es gibt führende Nullen
			int[] result = new int[tmp.length - leadingZeroCount]; //Erzeuge neuen Array der um die Anzahl der führenden Nullen reduziert ist
			for (int i = leadingZeroCount; i < tmp.length; i++) { //Fange ab der ersten Ziffer mit dem iterieren an
				result[i - leadingZeroCount] = tmp[i]; //und fülle das Ergebnis Array
			}
			return result;
		}
	}
}
