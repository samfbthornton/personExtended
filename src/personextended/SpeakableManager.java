package personextended;

import java.util.ArrayList;
import java.util.List;

public class SpeakableManager {

	List<Speakable> speak = new ArrayList<>();

	public void addSpeakable(Speakable speaker) {
		this.speak.add(speaker);
	}

	public void removeSpeakable(Speakable speaker) {
		this.speak.remove(speaker);
	}

	public void speak() {
		for (Speakable s : speak) {
			s.speak();
		}
	}
}
