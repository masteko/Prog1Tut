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
		
		baum.einfuegen(k1);
		baum.einfuegen(k2);
		baum.einfuegen(k3);
		baum.einfuegen(k4);
		baum.einfuegen(k5);
		baum.einfuegen(k6);
		baum.ausgeben();
	}
}
