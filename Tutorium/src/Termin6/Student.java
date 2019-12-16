package Termin6;

public class Student {
	String name;
	String nname;
	
	Student(String name, String nname) {
		this.name = name;
		this.nname = nname;
	}
	
	public String toString() {
		return name + " " + nname;
	}
	
	public static void main(String[] args) {
		Student foo = new Student("Max", "Muster");
		Student copyFoo = foo;
		copyFoo.name = "Trump";
		System.out.println(foo.toString());
	}
}
