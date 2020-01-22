package Termin9;

public class BaumMain {
	public static void main(String[] args) {
		Baum baum = new Baum();
		Knoten k1 = new Knoten("hallo");
		Knoten k2 = new Knoten("halloo");
		Knoten k3 = new Knoten("halloa");
		Knoten k4 = new Knoten("hallov");
		Knoten k5 = new Knoten("hal");
		Knoten k6 = new Knoten("ha");
		Knoten k7 = new Knoten("ha");
		
		baum.einfuegen(k1);
		baum.einfuegen(k2);
		baum.einfuegen(k3);
		baum.einfuegen(k4);
		baum.einfuegen(k5);
		baum.einfuegen(k6);
		baum.einfuegen(k7);
		System.out.println(baum.suchen("hal"));
		System.out.println(baum.suchen("hallov"));
		System.out.println(baum.suchen("ha"));
		System.out.println(baum.suchen("halloa"));
		System.out.println(baum.suchen("h"));
		System.out.println(baum.suchen("halloas"));
		System.out.println("------------");
		baum.loeschen(k7);
		baum.loeschen(k1);
		baum.loeschen(k4);
		baum.ausgeben();
	}
}
