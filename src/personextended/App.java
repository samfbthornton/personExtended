package personextended;

public class App {

	public static void main(String[] args) {

		PersonManager manager = new PersonManager();

		Person p1 = new Person("ST", 37, "Software Engineer");

		p1.addDog(new Dog("Rex", 2, "Black"));

		manager.addPerson(p1);

		manager.print();

		Person found = manager.findByName("Barry");

		if (found != null) {
			found.Print();
		} else {
			System.out.println("Trainer doesn't exist with that name");
		}
	}
}