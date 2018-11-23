package introductiontocollections;

import java.util.*;

public class Car {

	private String model;
	private int price;
	private String color;

	public Car(String model, int price, String color) {
		this.model = model;
		this.price = price;
		this.color = color;
	}

	public static void main(String[] args) {

		Car[] cars = { new Car("BMW", 12000, "red"), new Car("Audi", 7777, "blue"), new Car("Skoda", 33000, "grey"),
				new Car("Suzuki", 4000, "green"), new Car("Citroen", 22222, "white"),
				new Car("Renault", 9999, "yellow"), new Car("Mercedes", 44444, "black"),
				new Car("Hyundai", 11777, "white"), new Car("Opel", 6612, "black"),
				new Car("Maserati", 6457, "purple") };

		List<Car> listOfCars = Arrays.asList(cars);
		Iterator iterator = listOfCars.iterator();

		while (iterator.hasNext()) {
			Object element = iterator.next();
			System.out.println(element.toString());
		}
	}

	@Override
	public String toString() {
		return "Model is: " + this.model + " by " + this.color + " color and with price: " + this.price;

	}

}
