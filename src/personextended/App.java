package personextended;

public class App {

	public static void main(String[] args) {

		PersonManager manager = new PersonManager();

		Person p1 = new Person("ST", 37, "Software Engineer");
		p1.addPet(new Cat("Cat", "Mog", "Jiji", 7, "Black"));
		p1.addPet(new Pet("Tortoise", "Shelly", 11, "Green"));
		p1.addPet(new Pet("Tortoise", "Torterra", 11, "Green"));
		p1.addPet(new Dog("Labrador"));

		manager.addPerson(p1);

		manager.print();

		// Person found = manager.findByName("Barry");

		// if (found != null) {
		// found.Print();
		// } else {
		// System.out.println("Trainer doesn't exist with that name");
		// }
	}
}