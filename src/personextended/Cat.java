package personextended; //name,age,colour,speak()

public class Cat {

	private String name;
	private int age;
	private String colour;

	public Cat(String name, int age, String colour) {
		this.name = name;
		this.age = age;
		this.colour = colour;
	}

	public Cat() {

	}

	public void print() {
		System.out.println("Name: ");
		System.out.println(this.name);
		System.out.println("Age: ");
		System.out.println(this.age);
		System.out.println("Colour: ");
		System.out.println(this.colour);
	}

	public void speak() {
		System.out.println("Meow");
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
