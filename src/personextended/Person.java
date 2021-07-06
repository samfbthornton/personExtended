package personextended; //name,age,jobtitle,listcat,listdog,addcat/dog,removecat/dog

import java.util.ArrayList;

public class Person {

	// Attributes
	public String name;
	public int age;
	public String job_title;
	public ArrayList<Cat> cats = new ArrayList<>();
	public ArrayList<Dog> dogs = new ArrayList<>();

	public Person(String name, int age, String job_title) {
		super();
		this.name = name;
		this.age = age;
		this.job_title = job_title;

	}

	public Person() {
		// default constructor
	}

	// Behaviours - what it does.

	public void Print() {
		System.out.print("Name: ");
		System.out.println(this.name);
		System.out.print("Age: ");
		System.out.println(this.age);
		System.out.print("Job Title ");
		System.out.println(this.job_title);
		System.out.print("Cat: [");
		for (Cat cat : this.cats) {
			cat.print();
		}
		System.out.println("]");
		System.out.print("Dog: [");
		for (Dog dog : this.dogs) {
			dog.print();
		}
		System.out.println("]");
	}

	public void addCat(Cat cat) {
		this.cats.add(cat);

	}

	public void removeCat(Cat cat) {
		this.cats.remove(cat);
	}

	public void addDog(Dog dog) {

		this.dogs.add(dog);

	}

	public void removeDog(Dog dog) {
		dogs.remove(dog);
	}

}