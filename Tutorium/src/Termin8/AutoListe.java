package Termin8;

public class AutoListe {
	Auto start;
	int laenge;
	
	public void einfuegen(Auto a) {
		laenge++;
		if (start == null) { //Liste ist leer
			start = a;
		} else { //F�ge ans Ende der Liste ein
			Auto idx = start;
			
			while(idx.next != null) {
				idx = idx.next;
			}
			
			idx.next = a;			
		}
	}
	
	public void sortiertEinfuegen(Auto a) {
		laenge++;
		
		if(start == null) { //Liste ist leer
			start = a;
		} else {
			if (start.ps > a.ps) { //F�ge an den Listenanfang ein
				a.next = start;
				start = a;
			} else {
				Auto idx = start.next;
				Auto oldIdx = start;
				
				while (idx != null) {
					if (idx.ps > a.ps) { //F�ge mittendrin ein
						oldIdx.next = a;
						a.next = idx;
						return;
					} //F�ge am Ende ein
					oldIdx = idx;
					idx = idx.next;
				}
				oldIdx.next = a;
			}
		}
	}
	
	public void anfangEinfuegen(Auto a) {
		a.next = start;
		start = a;
	}
	
	public Auto suche(int ps) {
		Auto idx = start;
		
		while(idx != null) { //Suche nach der PS
			if (idx.ps == ps) {
				return idx;				
			}
			idx = idx.next;
		}
		
		return null;
	}
	
	public void loeschen(Auto a) {
		if (start == null) return; //Liste ist leer
		
		Auto oldIdx = start;
		Auto idx = start.next;
		
		if (start.equals(a)) { //L�sche den ersten Eintrag
			start = start.next;
			laenge--;
			return;
		}
		
		while (idx != null) {
			if (idx.equals(a)) {
				oldIdx.next = idx.next; //L�sche inmitten oder am Ende der Liste
				laenge--;
				return;
			}
			oldIdx = idx;
			idx = idx.next;
		}
	}
	
	public void print() {
		Auto idx = start;
		System.out.println("Die mit Liste mit der l�nge " + laenge + " enth�lt folgende Eintr�ge:");
		while (idx != null) {
			System.out.println(idx);
			idx = idx.next;
		}
	}
}
