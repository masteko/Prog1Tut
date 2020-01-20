package Termin8;

public class Auto {
	int ps;
	Auto next;
	
	public Auto(int ps) {
		this.ps = ps;
	}
	
	@Override
	public String toString() {
		return "Ich bin das Auto mit " + ps + "ps.";
	}
}
