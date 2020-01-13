package Termin7;

public class Liste {
	Personenknoten start;
	
	public void einfuegen(Personenknoten p) {
		if (start == null) { //Die Liste ist leer
			start = p;
		} else  {
			if (start.getAlter() <= p.getAlter()) { //Knoten wird irgendwo in der Liste eingef�gt
				einfuegen(start, p);				
			} else { //Einzuf�gender Knoten ist neuer Startknoten
				p.setNachfolger(start);
				start.setVorgaenger(p);
				start = p;
			}
		}
	}
	
	public void einfuegen(Personenknoten p1, Personenknoten p2) {
		if (p1.getAlter() <= p2.getAlter()) { //Einzuf�gender Knoten ist �lter als der aktuelle Knoten
			if (p1.getNachfolger() == null) { //Einzuf�gender Knoten ist neuer letzter Knoten
				p1.setNachfolger(p2);
				p2.setVorgaenger(p1);
			} else {	//Suche weiter nach geeigneter Stelle
				einfuegen(p1.getNachfolger(), p2);
			}
		} else { //Einzuf�gender Knoten wird zwischen 2 anderen Knoten eingef�gt
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
			if (p.getNachfolger() != null) { //Wenn die Liste noch weitere Eintr�ge hat, suche weiter
				return sucheViaNachname(p.getNachfolger(), nachname);
			} else { //ansonsten wurde der Name nicht in der Liste gefunden
				return null;				
			}
		}
	}
	
	public static void main(String[] args) {
		Liste liste = new Liste();
		liste.einfuegen(new Personenknoten(20, "Person1"));
		liste.einfuegen(new Personenknoten(30, "Person2"));
		liste.einfuegen(new Personenknoten(25, "Person3"));
		liste.einfuegen(new Personenknoten(18, "Person4"));
		
		System.out.println(liste.sucheViaNachname("Person1"));
		System.out.println(liste.sucheViaNachname("Person2"));
		System.out.println(liste.sucheViaNachname("Person3"));
		System.out.println(liste.sucheViaNachname("person3"));
		System.out.println(liste.sucheViaNachname("Person4"));
		System.out.println(liste.sucheViaNachname("Person5"));
	}
}
