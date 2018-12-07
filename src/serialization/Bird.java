package serialization;

import java.io.Serializable;

public class Bird implements Serializable {

	public static String name = "Birdie";
	public transient String color;
	public final int SIZE = 4;

	public Bird() {
	}

	public Bird(String color) {
		this.color = color;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}
	
	public String toString() {
		return "The name of dird is: " + name + " AND THE COLOR IS: " + color + " and the size in centimeters is: "
				+ SIZE;
	}

}
