package personextended; //name,age,jobtitle,listcat,listdog,addcat/dog,removecat/dog

import java.util.ArrayList;

public class Person {

	// Attributes
	private String name;
	private int age;
	private String jobTitle;
	private ArrayList<Cat> cats = new ArrayList<>();
	private ArrayList<Dog> dogs = new ArrayList<>();

	public Person(String name, int age, String jobTitle) {
		super();
		this.name = name;
		this.age = age;
		this.jobTitle = jobTitle;

	}

	public Person() {
		// default constructor
	}

	// Behaviours - what it does.

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

	public void Print() {
		System.out.print("Name: ");
		System.out.println(this.name);
		System.out.print("Age: ");
		System.out.println(this.age);
		System.out.print("Job Title ");
		System.out.println(this.jobTitle);
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

	public String getJobTitle() {
		return jobTitle;
	}

	public void setJobTitle(String jobTitle) {
		this.jobTitle = jobTitle;
	}

}