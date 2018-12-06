package serialization;

import java.io.*;
import java.util.ArrayList;
import reflection.*;
import reflection.Animals_Task2.Bird;
import reflection.Animals_Task2.Cat;
import reflection.Animals_Task2.Dog;

public class Lesson_009_Task2 {

	public static void main(String[] args) throws Exception {
		
		final File file = new File("C:\\Animals.txt");

		Dog dog = new Animals_Task2().new Dog();
		Cat cat = new Animals_Task2().new Cat();
		Bird bird = new Animals_Task2().new Bird();

		ArrayList<Object> array = new ArrayList<>();

		try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(file));
				ObjectInputStream ois = new ObjectInputStream(new FileInputStream(file))) {
			array.add(dog);
			array.add(cat);
			array.add(bird);
			oos.writeObject(array);

			Object anim = ois.readObject();

			System.out.println(anim);

		} catch (Exception e) {
			e.printStackTrace();
		
		} finally {
			dog = null;
			cat = null;
			bird = null;
		}

	}

}
