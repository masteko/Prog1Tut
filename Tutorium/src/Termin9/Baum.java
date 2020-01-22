package Termin9;

public class Baum {
	Knoten wurzel;
	
	public void einfuegen(Knoten k) {
		if (wurzel == null) {
			wurzel = k;
		} else {
			einfuegen(wurzel, k);
		}
	}
	
	private void einfuegen(Knoten vorgaenger, Knoten k) {
		if (vorgaenger.name.compareTo(k.name) < 0) {
			if (vorgaenger.rechts == null) {
				vorgaenger.rechts = k;
			} else {
				einfuegen(vorgaenger.rechts, k);
			}
		} else {
			if (vorgaenger.links == null) {
				vorgaenger.links = k;
			} else {
				einfuegen(vorgaenger.links, k);
			}
		}
	}
	
	public void loeschen(Knoten k) {
		
	}
	
	public Knoten suchen(String name) {
		return null;
	}
	
	public void ausgeben() {
		ausgeben(wurzel);
	}
	
	private void ausgeben(Knoten aktueller) {
		if (aktueller.links != null) {
			ausgeben(aktueller.links);
		}
		System.out.println(aktueller.name);
		if (aktueller.rechts != null) {
			ausgeben(aktueller.rechts);
		}
	}
}
