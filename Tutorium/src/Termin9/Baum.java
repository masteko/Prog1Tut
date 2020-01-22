package Termin9;

public class Baum {
	Knoten wurzel;
	
	public void einfuegen(Knoten k) {
		if (wurzel == null) { //Baum ist leer, f�ge Knoten als Wurzelknoten hinzu
			wurzel = k;
		} else { //Baum ist nicht leer, suche geeignete Stelle
			einfuegen(wurzel, k);
		}
	}
	
	private void einfuegen(Knoten vorgaenger, Knoten k) {
		if (vorgaenger.name.compareTo(k.name) < 0) { //m�ssen wir nach links oder rechts?
			if (vorgaenger.rechts == null) { //gibt es rechts weitere Elemente die wir �berpr�fen m�ssen?
				vorgaenger.rechts = k; //nein
			} else {
				einfuegen(vorgaenger.rechts, k); //ja
			}
		} else { // das selbe f�r die linke Seite
			if (vorgaenger.links == null) {
				vorgaenger.links = k;
			} else {
				einfuegen(vorgaenger.links, k);
			}
		}
	}
	
	public void loeschen(Knoten k) {
		Knoten tmp;
		if (wurzel != null) { // Wenn der Baum nicht leer ist suchen wir das zu l�schende Element ab der Wurzel
			if (wurzel.equals(k)) { // Das zu l�schende Element ist die Wurzel -> Spezialfall
				tmp = wurzel.links; 
				wurzel = wurzel.rechts; //Der rechte Knoten wird neuer Wurzelknoten
				if (tmp != null) { //F�ge linken Teilbaum ein falls nicht null 
					einfuegen(tmp); //Den linken Teilbaum f�gen wir dem Baum neu hinzu					
				}
			}
			
			// Baum ist nicht leer und die Wurzel soll nicht gel�scht werden
			// Wo m�ssen wir im Baum weiter suchen? links oder rechts?
			if (wurzel.name.compareTo(k.name) < 0) {
				loeschen(wurzel, wurzel.rechts, k);				
			} else {
				loeschen(wurzel, wurzel.links, k);				
			}
		}
	}
	
	private void loeschen(Knoten vorgaenger, Knoten aktueller, Knoten k) {
		//Hier ist �hnlich wie bei der Wurzel
		if (aktueller != null) { // Wenn es das aktuelle Element gibt (sonst Ende Baum -> zu l�schende Element ist nicht im Baum)
			if (aktueller.equals(k)) { // Wir haben das zu l�schende Element gefunden
				// 
				if (vorgaenger.name.compareTo(k.name) < 0) {
					vorgaenger.rechts = aktueller.rechts;
				} else {
					vorgaenger.links = aktueller.rechts; 
				}
					
				if (aktueller.links != null) {
					einfuegen(aktueller.links); //Den linken Teilbaum f�gen wir dem Baum neu hinzu					
				}
			}
			
			// Baum ist nicht leer und die Wurzel soll nicht gel�scht werden
			// Wo m�ssen wir im Baum weiter suchen? links oder rechts?
			if (aktueller.name.compareTo(k.name) < 0) {
				loeschen(aktueller, aktueller.rechts, k);				
			} else {
				loeschen(aktueller, aktueller.links, k);				
			}
		}
	}
	
	public Knoten suchen(String name) {
		return suchen(wurzel, name);
	}
	
	private Knoten suchen(Knoten aktueller, String name) {
		if (aktueller == null) return null; //Wurde f�r den aktuellen Knoten null �bergeben? Wenn ja gibt es das gesuchte Element nicht im Baum und wir sind am Ende
		
		if (aktueller.name.equals(name)) { //Wir haben den gesuchten Knoten gefunden
			return aktueller;
		}
		
		if (aktueller.name.compareTo(name) < 0) { //Wir haben den Knoten noch nicht gefunden, m�ssen wir links oder rechts suchen?
			return suchen(aktueller.rechts, name);
		} else {
			return suchen(aktueller.links, name);
		}
	}
	
	public void ausgeben() {
		ausgeben(wurzel);
	}
	
	private void ausgeben(Knoten aktueller) {
		//kleinster Wert steht ganz links
		//gr��ter Wert steht ganz rechts
		
		if (aktueller.links != null) { //schaue ob es links weiter geht -> kleinere Werte
			ausgeben(aktueller.links); //rufe rekursiv mit dem kleineren Wert auf
		}
		
		// Wenn wir hier sind haben wir entweder kein linken Wert, oder haben die Linken Werte schon ausgegeben
		System.out.println(aktueller.name);
		
		// Jetzt suchen wir noch den rechten Baum ab
		if (aktueller.rechts != null) {
			ausgeben(aktueller.rechts);
		}
	}
}
