package Termin9;

public class Knoten {
	Knoten links;
	Knoten rechts;
	String name;
	
	public Knoten(String name) {
		this.name = name;
	}
	
	@Override
	public String toString() {
		return "Knoten: " + name;
	}
}
