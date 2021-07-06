package personextended; //name,age,colour,speak()

public class Cat {

	public String name;
	public int age;
	public String colour;
	public Cat cat;

	public Cat(String name, int age, String colour) {
		this.name = name;
		this.age = age;
		this.colour = colour;
		System.out.println(this);
	}

	public Cat() {

	}

	public void speak() {
		System.out.println("Meow");
	}

}
