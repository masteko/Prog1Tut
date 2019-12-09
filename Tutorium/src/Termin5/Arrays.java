package Termin5;

public class Arrays {
	final static int ODD = 0;
	final static int EVEN = 1;

	public static void main(String[] args) {
		int[] values = {0, 1, 2, 3, 4};	//kurzschreibeweise für Arrays
		
		System.out.println(sum(values));	//liefern beide das
		System.out.println(sum2(values));	//das gleiche Ergebnis
	
		oddAndEven(values);
		int[] arr = oddAndEven2(values);
		
		System.out.print("Der Array hat " + arr[ODD] + " ungerade ");
		System.out.println("und " + arr[EVEN] + " gerade Zahlen");
		
		String satz = "ProgramMiereN mAcht Spaß";
		String geflippterSatz = flipSentence(satz);
		
		System.out.println(satz + "\n" + geflippterSatz);
	}
	
	public static int sum(int[] arr) {
		int sum = 0;
		
		for (int el : arr) {	//for each Schleife
			sum += el;
		}
		
		return sum;
	}
	
	public static int sum2(int[] arr) {
		int sum = 0;
		
		for (int i = 0; i < arr.length; i++) {	//klassische for Schleife
			int el = arr[i];
			sum += el;
		}
		
		return sum;
	}
	
	public static void oddAndEven(int[] arr) {
		int sumOdd = 0;
		
		//alternativ können zusätzlich noch die geraden Zahlen gezählt werden
		for(int el : arr) {
			if(el % 2 != 0) {
				sumOdd++;	//zähle die ungeraden Zahlen
			}
		}
		
		//Anzahl gerade Zahlen = Länge - Anzahl ungerade Zahlen
		System.out.println("Der Array hat " + sumOdd + " ungerade und " + 
				(arr.length - sumOdd) + " gerade Zahlen");
	}
	
	public static int[] oddAndEven2(int[] arr) { //alternative mit Rückgabewert
		int sumOdd = 0;
		int[] result = new int[2];
		
		//alternativ können zusätzlich noch die geraden Zahlen gezählt werden
		for(int el : arr) {
			if(el % 2 != 0) {
				result[ODD]++;
			} else {
				result[EVEN]++;
			}
		}
		
		return result;
	}
	
	public static String flipSentence(String satz) {
		char[] satzArray = satz.toCharArray();	//erzeuge einen Array aus dem String
		char[] resultArray = new char[satz.length()]; //definiere neuen Array für den geflippten Satz
		
		for (int i = 0; i < satzArray.length; i++) {
			if (Character.isUpperCase(satzArray[i])) {
				resultArray[i] = Character.toLowerCase(satzArray[i]);	//mache aus groß -> klein
			} else {
				resultArray[i] = Character.toUpperCase(satzArray[i]);	//mache aus klein -> groß
			}
		}
		
		return String.valueOf(resultArray);	//gebe wieder einen String zurück
	}
}
