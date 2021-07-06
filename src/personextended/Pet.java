package personextended;

public class Pet {

	private String species;
	private String name;
	private int age;
	private String colour;

	public Pet(String species, String name, int age, String colour) {
		this.species = species;
		this.name = name;
		this.age = age;
		this.colour = colour;
	}

	public void speak() {
		System.out.println("I'm the boss of this house!");
	}

	public void print() {

		System.out.print("\nSpecies: ");
		System.out.print(this.getSpecies());
		System.out.print("Name: ");
		System.out.print(this.getName());
		System.out.print(", Age: ");
		System.out.print(this.getAge());
		System.out.print(", Colour: ");
		System.out.println(this.getColour());
	}

	public String getSpecies() {
		return species;
	}

	public void setSpecies(String species) {
		this.species = species;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getColour() {
		return colour;
	}

	public void setColour(String colour) {
		this.colour = colour;
	}
}