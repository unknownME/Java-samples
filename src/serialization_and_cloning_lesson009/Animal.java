package serialization_and_cloning_lesson009;

public class Animal {

	private String name;
	private String color;
	private int weight;

	public Animal(String name, String color, int weight) {
		this.name = name;
		this.color = color;
		this.weight = weight;
	}

	public static void main(String[] args) {

		Eagle eagle = new Eagle("Bobik", "Grey", 15);
		try {
			Eagle eagle2 = (Eagle) eagle.clone();
			System.out.println(eagle);
			System.out.println(eagle2);
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		} finally {
			eagle = null;
		}
	}

	public String toString() {
		return "The name of animal is: " + name + " and the color is: " + color + " and the weight is: " + weight;
	}

}

class Eagle extends Animal implements Cloneable {

	public Eagle(String name, String color, int weight) {
		super(name, color, weight);
	}

}
