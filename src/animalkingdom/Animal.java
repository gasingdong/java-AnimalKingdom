package animalkingdom;

public abstract class Animal {

	private static int animalId = 0;

	private final String name;
	private final int yearNamed;
	private final int id;

	public Animal(String name, int yearNamed) {
		this.name = name;
		this.yearNamed = yearNamed;
		this.id = animalId++;
	}

	public String consume() {
		return "eat";
	}

	public abstract String move();

	public abstract String breath();

	public abstract String reproduce();
}