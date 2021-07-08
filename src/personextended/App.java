package personextended;

public class App {

	public static void main(String[] args) {

		PersonManager manager = new PersonManager();

		Person p1 = new Person("ST", 37, "Software Engineer");
		p1.addPet(new Cat("Cat", "Mog", "Jiji", 7, "Black"));
		p1.addPet(new Cat("Tortoise", "Hermanns", "Shelly", 11, "Green"));
		p1.addPet(new Cat("Tortoise", "Hermanns", "Torterra", 11, "Green"));
		p1.addPet(new Dog("Labrador"));

		manager.addPerson(p1);

		SpeakableManager speakman = new SpeakableManager();

		Person p2 = new Person();
		Cat c1 = new Cat();
		Dog d1 = new Dog();

		speakman.addSpeakable(p2);
		speakman.addSpeakable(c1);
		speakman.addSpeakable(d1);

		speakman.speak();

		// manager.print();

	}
}