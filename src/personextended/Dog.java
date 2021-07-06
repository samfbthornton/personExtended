package personextended; //name,age,colour,speak()

public class Dog extends Pet {

	private String breed;

	public Dog(String breed) {
		super("Dog", "Fido", 12, "Chocolate");
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
		System.out.println("Woof");
	}

	public String getBreed() {
		return breed;
	}

	public void setBreed(String breed) {
		this.breed = breed;
	}
}
