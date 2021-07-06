package personextended; //listperson,addperson(),removeperson(),findpersonbyname()

import java.util.ArrayList;

public class PersonManager {

	public ArrayList<Person> people = new ArrayList<>();

	public void addPerson(Person person) {
		this.people.add(person);

	}

	public void removePerson(Person person) {
		this.people.remove(person);
	}

	public Person findByName(String name) {
		for (Person person : this.people) {
			if (person.name == name) {

				return person;
			}
		}
		return null;
	}

	public void print() {
		System.out.println("Hello!");
	}

}