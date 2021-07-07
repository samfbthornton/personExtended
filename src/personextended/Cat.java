package personextended; //name,age,colour,speak()

public class Cat extends Pet {

	private String breed;

	public Cat() {

	}

	public Cat(String species, String breed, String name, int age, String colour) {
		super(species, name, age, colour);
		this.breed = breed;
	}

	@Override
	public void print() {

		System.out.print("\nSpecies: ");
		System.out.print(this.getSpecies());
		System.out.print(", Breed: ");
		System.out.print(this.breed);
		System.out.print(", Name: ");
		System.out.print(this.getName());
		System.out.print(", Age: ");
		System.out.print(this.getAge());
		System.out.print(", Colour: ");
		System.out.println(this.getColour());
	}

	@Override
	public void speak() {
		System.out.println("Meow");
	}

	public String getBreed() {
		return breed;
	}

	public void setBreed(String breed) {
		this.breed = breed;
	}

}
