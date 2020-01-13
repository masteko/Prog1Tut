package Termin7;

public class Personenknoten {
	private int alter;
	private String nachname;
	private Personenknoten vorgaenger;
	private Personenknoten nachfolger;
	
	public Personenknoten(int alter, String nachname, Personenknoten vorgaenger, Personenknoten nachfolger) {
		super();
		this.alter = alter;
		this.nachname = nachname;
		this.vorgaenger = vorgaenger;
		this.nachfolger = nachfolger;
	}
	public Personenknoten(int alter, String nachname) {
		super();
		this.alter = alter;
		this.nachname = nachname;
	}
	public int getAlter() {
		return alter;
	}
	public void setAlter(int alter) {
		this.alter = alter;
	}
	public String getNachname() {
		return nachname;
	}
	public void setNachname(String nachname) {
		this.nachname = nachname;
	}
	public Personenknoten getVorgaenger() {
		return vorgaenger;
	}
	public void setVorgaenger(Personenknoten vorgaenger) {
		this.vorgaenger = vorgaenger;
	}
	public Personenknoten getNachfolger() {
		return nachfolger;
	}
	public void setNachfolger(Personenknoten nachfolger) {
		this.nachfolger = nachfolger;
	}
	
	@Override
	public String toString() {
		return "Person: " + nachname + " mit dem Alter " + alter;
	}
}
