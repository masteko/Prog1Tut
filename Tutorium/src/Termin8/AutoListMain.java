package Termin8;

public class AutoListMain {
	public static void main(String[] args) {
		Auto a1 = new Auto(45);
		Auto a2 = new Auto(117);
		Auto a3 = new Auto(204);
		Auto a4 = new Auto(52);
		Auto a5 = new Auto(205);
		Auto a6 = new Auto(45);
		
		AutoListe al = new AutoListe();
		System.out.println("Suche 204ps: " + al.suche(204));
		al.loeschen(a5);
		al.print();
		al.sortiertEinfuegen(a4);
		al.print();
		al.sortiertEinfuegen(a3);
		al.print();
		al.sortiertEinfuegen(a2);
		al.print();
		al.sortiertEinfuegen(a5);
		al.print();
		al.sortiertEinfuegen(a1);
		al.print();
		al.sortiertEinfuegen(a6);
		al.print();
		
		al.loeschen(a4);
		al.print();
		al.loeschen(a1);
		al.print();
		al.einfuegen(a5);
		al.print();
		al.loeschen(a3);
		al.print();
		System.out.println("Suche 204ps: " + al.suche(204));
		System.out.println("Suche 205ps: " + al.suche(205));
	}
}
