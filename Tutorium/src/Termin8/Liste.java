package Termin8;

import Termin7.Personenknoten;

public class Liste {
	Personenknoten start;
	
	public void einfuegen(Personenknoten p) {
		if (start == null) { // Die Liste ist leer
			start = p;
		} else { // Die Liste ist nicht leer
			if (start.getAlter() > p.getAlter()) { // Der Knoten ist der neue Listenanfang
				p.setNachfolger(start);
				start.setVorgaenger(p);
				start = p;
			} else { // Der Knoten ist nicht der neue Listenanfang
				Personenknoten idx = start.getNachfolger();
				Personenknoten oldIdx = start;
				
				while(idx != null) {
					if (idx.getAlter() > p.getAlter()) { // Knoten muss zwischen 2 Einträge eingefügt werden
						p.setNachfolger(idx);
						p.setVorgaenger(oldIdx);
						oldIdx.setNachfolger(p);
						return; // Beende das einfügen
					} else {
						oldIdx = idx;
						idx = idx.getNachfolger();			
					}
				} // Knoten wird ans Ende der Liste eingefügt
				oldIdx.setNachfolger(p);
				p.setVorgaenger(oldIdx);
			}	
		}
	}
	
	public Personenknoten sucheViaNachname(String nachname) {
		Personenknoten pk = start;
		
		while (pk != null) { // loope solange wir nicht das Ende der Liste erreicht haben
			if (pk.getNachname().equals(nachname)) { // stimmt der Nachname mit dem gesuchten überein?
				return pk; // returne das gefundene Element
			} else {
				pk = pk.getNachfolger(); // suche weiter
			}
		}
		
		return null; // wenn wir den Knoten nicht finden oder die Liste leer ist
	}

	@Override
	public String toString() {
		String result = "Die Liste hat folgende Einträge: \n";
		Personenknoten pk = start;
		
		while (pk != null) { //loope solange bis wir am ende der Liste sind
			result += pk.toString() + "\n";
			pk = pk.getNachfolger();
		}
		
		return result;
	}
}
