package Termin7;

public class ListMain {
	public static void main(String[] args) {
		Liste liste = new Liste();
		liste.einfuegen(new Personenknoten(20, "Person1"));
		liste.einfuegen(new Personenknoten(30, "Person2"));
		liste.einfuegen(new Personenknoten(25, "Person3"));
		liste.einfuegen(new Personenknoten(18, "Person4"));
		
		System.out.println(liste);
		System.out.println("--------------------------");
		
		System.out.println(liste.sucheViaNachname("Person1"));
		System.out.println(liste.sucheViaNachname("Person2"));
		System.out.println(liste.sucheViaNachname("Person3"));
		System.out.println(liste.sucheViaNachname("person3"));
		System.out.println(liste.sucheViaNachname("Person4"));
		System.out.println(liste.sucheViaNachname("Person5"));
	}
}
