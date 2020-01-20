package Termin7;

public class Liste {
	Personenknoten start;
	
	public void einfuegen(Personenknoten p) {
		if (start == null) { //Die Liste ist leer
			start = p;
		} else  { // Die Liste ist nicht leer
			if (start.getAlter() <= p.getAlter()) { //Knoten wird irgendwo in der Liste eingefügt
				einfuegen(start, p);				
			} else { //Einzufügender Knoten ist neuer Startknoten
				p.setNachfolger(start);
				start.setVorgaenger(p);
				start = p;
			}
		}
	}
	
	public void einfuegen(Personenknoten p1, Personenknoten p2) {
		if (p1.getAlter() <= p2.getAlter()) { //Einzufügender Knoten ist älter als der aktuelle Knoten
			if (p1.getNachfolger() == null) { //Einzufügender Knoten ist neuer letzter Knoten
				p1.setNachfolger(p2);
				p2.setVorgaenger(p1);
			} else {	//Suche weiter nach geeigneter Stelle
				einfuegen(p1.getNachfolger(), p2);
			}
		} else { //Einzufügender Knoten wird zwischen 2 anderen Knoten eingefügt
			p1.getVorgaenger().setNachfolger(p2);
			p2.setVorgaenger(p1.getVorgaenger());
			p2.setNachfolger(p1);
			p1.setVorgaenger(p2);
		}
	}
	
	public Personenknoten sucheViaNachname(String nachname) {
		if (start == null) { //Liste ist leer
			return null;
		} else { //Liste ist nicht leer, suche nach dem Namen
			return sucheViaNachname(start, nachname);
		}
	}
	
	public Personenknoten sucheViaNachname(Personenknoten p, String nachname) {
		if (p.getNachname().equals(nachname)) { //Person mit dem Namen gefunden!
			return p;
		} else {
			if (p.getNachfolger() != null) { //Wenn die Liste noch weitere Einträge hat, suche weiter
				return sucheViaNachname(p.getNachfolger(), nachname);
			} else { //ansonsten wurde der Name nicht in der Liste gefunden
				return null;				
			}
		}
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
