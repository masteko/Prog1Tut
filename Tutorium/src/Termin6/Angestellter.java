package Termin6;

public class Angestellter {
	private String name = null;
	private int alter = 0;
	private Angestellter vorgesetzter = null;
	
	Angestellter(){} //Wird benötigt, damit der Standardkonstruktur verwendet werden kann
	
	Angestellter(String name, int alter) {
		this.name = name;
		this.alter = alter;
	}
	
	Angestellter(String name, int alter, Angestellter vorgesetzter) {
		this(name, alter);
		this.vorgesetzter = vorgesetzter;
	}
	
	String getName() {
		return this.name;
	}
	
	void setName(String name) {
		this.name = "Max";
	}
	
	int getAlter() {
		return this.alter;
	}
	
	void setAlter(int alter) {
		this.alter = alter;
	}

	Angestellter getVorgesetzter() {
		return this.vorgesetzter;
	}
	
	void setVorgesetzter(Angestellter vorgesetzter) {
		this.vorgesetzter = vorgesetzter;
	}
	
	@Override
	public String toString() { //Nicht relevant bitte nicht daran aufhalten
		String result = "Der Angestellte %s ist %s Jahre alt.\n";
		
		if (vorgesetzter != null) {
			return String.format(result
					+ "Der Vorgesetzte von %s heißt %s\n", this.getName(), this.getAlter(), name, vorgesetzter.getName());			
		} else {
			return String.format(result
					+ "%s hat keinen Vorgesetzten\n", name, alter, name);
		}
	}
	
	public static void main(String[] args) {
		Angestellter max = new Angestellter("Max", 22);
		max.setName("Josef");
		
		Angestellter stromberg = new Angestellter();
		stromberg.setName("Stromberg");
		stromberg.setAlter(44);
		stromberg.setVorgesetzter(new Angestellter("Maria", 33));
		
		Angestellter maria = stromberg.getVorgesetzter();
		
		Angestellter john = new Angestellter("John", 24, stromberg);
		max.setVorgesetzter(stromberg);
		
		System.out.println(max); //funktioniert dank der toString() Methode von oben
		System.out.println(john);
		System.out.println(stromberg);
		System.out.println(maria);
	}
}
