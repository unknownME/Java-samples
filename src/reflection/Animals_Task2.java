package reflection;

import java.io.Serializable;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Scanner;

public class Animals_Task2 implements Serializable{
	
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please, enter the name of interested Class - dog, cat or bird:");

		getInfo(getReflectedClass(sc.next()));
		sc.close();
	}

	public static Class<?> getReflectedClass(String className) throws Exception {

		Class<?> refClass = null;

		if (className.equalsIgnoreCase("Dog")) {
			refClass = Dog.class;
		} else if (className.equalsIgnoreCase("Cat")) {
			refClass = Cat.class;
		} else if (className.equalsIgnoreCase("Bird")) {
			refClass = Bird.class;
		} else {
			throw new Exception("Current " + className + " isn't exist");
		}
		return refClass;
	}

	public static void getInfo(Class<?> className) {
		System.out.println("Our class name is: " + className.getName());
		System.out.println("--------------");
		System.out.println("Our superclass name is: " + className.getSuperclass());
		System.out.println("--------------");
		for (Method method : className.getMethods()) {
			System.out.println("Our method(s) is: " + method);
		}
		System.out.println("--------------");
		for (Field field : className.getDeclaredFields()) {
			System.out.println("Our declared field(s) is: " + field);
		}
		System.out.println("--------------");
		System.out.println("Our constructor is: " + className.getConstructors());
		System.out.println("--------------");
		System.out.println("Our interface is: " + className.getInterfaces()[0]);

	}
	
	public class Dog implements IAnimals, Serializable {

		private static final String NAME = "Bobik";
		private static final int AGE = 2;
		private static final String COLOR = "Black";

		@Override
		public String getName() {
			return NAME;
		}

		@Override
		public int getAge() {
			return AGE;
		}

		@Override
		public String getColor() {
			return COLOR;
		}
		
		@Override
		public String toString() {
			return "Name is: " + getName() + " and age is: " + getAge() + " and color is: "  + getColor();
		}
		
		
	}

	public class Cat implements IAnimals, Serializable {

		private static final String NAME = "Sevil";
		private static final int AGE = 5;
		private static final String COLOR = "White";

		@Override
		public String getName() {
			return NAME;
		}

		@Override
		public int getAge() {
			return AGE;
		}

		@Override
		public String getColor() {
			return COLOR;
		}
		
		@Override
		public String toString() {
			return "Name is: " + getName() + " and age is: " + getAge() + " and color is: "  + getColor();
		}

	}

	public class Bird implements IAnimals, Serializable {

		private static final String NAME = "Abby";
		private static final int AGE = 3;
		private static final String COLOR = "Yellow";

		@Override
		public String getName() {
			return NAME;
		}

		@Override
		public int getAge() {
			return AGE;
		}

		@Override
		public String getColor() {
			return COLOR;
		}
		
		@Override
		public String toString() {
			return "Name is: " + getName() + " and age is: " + getAge() + " and color is: "  + getColor();
		}

	}

	interface IAnimals {

		String getName();

		int getAge();

		String getColor();
	}
}
