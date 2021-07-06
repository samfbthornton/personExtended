package personextended; //name,age,colour,speak()

public class Dog {

	public String name;
	public int age;
	public String colour;
	public Dog cat;

	public Dog(String name, int age, String colour) {
		this.name = name;
		this.age = age;
		this.colour = colour;
		System.out.println(this);
	}

	public Dog() {

	}

	public void speak() {
		System.out.println("Woof");
	}

}
