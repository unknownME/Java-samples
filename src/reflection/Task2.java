package reflection;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Scanner;

public class Task2 {

	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please, enter the name of interested Class - dog, cat or bird:");

		getInfo(getReflectedClass(sc.next()));
		sc.close();
	}

	private static Class<?> getReflectedClass(String className) throws Exception {

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

	private static void getInfo(Class<?> className) {
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

	class Dog implements IAnimals {

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

	}

	class Cat implements IAnimals {

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

	}

	class Bird implements IAnimals {

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

	}

	interface IAnimals {

		String getName();

		int getAge();

		String getColor();
	}
}
