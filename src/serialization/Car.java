package serialization;

import java.io.*;

public class Car implements Externalizable {

	public static final String BRAND = "BMW";
	public static final String MODEL = "X5";
	private double price;
	private String color;
	private int sizeOfWheels;

	public Car() {

	}

	public Car(double price, String color, int sizeOfWheels) {
		this.price = price;
		this.color = color;
		this.sizeOfWheels = sizeOfWheels;
	}

	public static void main(String[] args) {

		Car car = new Car(10000.00, "green", 17);

		File file = new File("C:\\test.txt");

		try {
			file.getParentFile().mkdirs();
			file.createNewFile();

			try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(file));
					ObjectInputStream ois = new ObjectInputStream(new FileInputStream(file))) {
				oos.writeObject(car);

				Car finalCar = (Car) ois.readObject();
				System.out.println(finalCar.toString());

			} catch (Exception e) {
				e.printStackTrace();
			}

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			car = null;
		}

	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public int getSizeOfWheels() {
		return sizeOfWheels;
	}

	public void setSizeOfWheels(int sizeOfWheels) {
		this.sizeOfWheels = sizeOfWheels;
	}

	@Override
	public void writeExternal(ObjectOutput out) throws IOException {
		out.writeObject(price);
		out.writeObject(sizeOfWheels);
	}

	@Override
	public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException {
		price = (double) in.readObject();
		sizeOfWheels = (int) in.readObject();
	}

	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("The Brand of car is: " + BRAND + "\n");
		sb.append("and the model of car is: " + MODEL + "\n");
		sb.append("and the price is: " + price + "\n");
		sb.append("and the size of wheels is: " + sizeOfWheels);
		return sb.toString();
	}

}
