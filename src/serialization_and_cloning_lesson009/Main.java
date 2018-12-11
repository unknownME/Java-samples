package serialization_and_cloning_lesson009;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

//home work 009 - deep clonning with serialization
public class Main {

	public static void main(String[] args) {

		Bird bird = new Bird("Green");

		try (ByteArrayOutputStream baos = new ByteArrayOutputStream();
				ObjectOutputStream oos = new ObjectOutputStream(baos)) {
			oos.writeObject(bird);
			try (ByteArrayInputStream bais = new ByteArrayInputStream(baos.toByteArray());
					ObjectInputStream ois = new ObjectInputStream(bais)) {

				Bird clonnedBird = (Bird) ois.readObject();
				System.out.println(bird);
				System.out.println("---------------------");
				System.out.println(clonnedBird);
				System.out.println("=====================");

				clonnedBird.setColor("Blue");

				System.out.println(bird);
				System.out.println("---------------------");
				System.out.println(clonnedBird);
			} catch (Exception e) {
				e.printStackTrace();
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			bird = null;
		}

	}

}
