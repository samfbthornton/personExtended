package personextended; //name,age,jobtitle,listcat,listdog,addcat/dog,removecat/dog

import java.util.ArrayList;

public class Person implements Speakable {

	// Attributes
	private String name;
	private int age;
	private String jobTitle;
	private ArrayList<Pet> pets = new ArrayList<>();

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

	public void addPet(Pet pet) {
		this.pets.add(pet);
	}

	public void removePet(Pet pet) {
		this.pets.remove(pet);
	}

	public void Print() {
		System.out.print("Name: ");
		System.out.println(this.name);
		System.out.print("Age: ");
		System.out.println(this.age);
		System.out.print("Job Title: ");
		System.out.println(this.jobTitle);
		System.out.println("----------------");
		System.out.println("Pets: ");
		for (Pet pet : this.pets) {
			pet.print();
		}
		System.out.println("\n----------------");

	}

	@Override
	public void speak() {
		System.out.println("I love my fluffies!!!");
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