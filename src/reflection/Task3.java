package reflection;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

public class Task3 {

	public static void main(String[] args) {

		Class<?> serenity = Serenity.class;

		for (Field field : serenity.getDeclaredFields()) {
			System.out.println("Our declared field(s) is: " + field);
			System.out.println("And modifier is: " + wichModifier(field.getModifiers()));
		}
		System.out.println("--------------");
		for (Method method : serenity.getMethods()) {
			System.out.println("Our method(s) is: " + method);
			System.out.println("And modifier is: " + wichModifier(method.getModifiers()));
		}
		System.out.println("--------------");
		for (Constructor<?> constructor : serenity.getConstructors()) {
			System.out.println("Our method(s) is: " + constructor);
			System.out.println("And modifier is: " + wichModifier(constructor.getModifiers()));
		}

	}

	private static String wichModifier(int a) {
		if (Modifier.isPrivate(a)) {
			return "private ";
		} else if (Modifier.isAbstract(a)) {
			return "abstract ";
		} else if (Modifier.isStatic(a)) {
			return "static ";
		} else if (Modifier.isFinal(a)) {
			return "final ";
		} else if (Modifier.isProtected(a)) {
			return "protected ";
		} else if (Modifier.isPublic(a)) {
			return "protected ";
		}
		return null;
	}

	class Serenity extends Task3 {

		private int number;
		protected String name;
		private long salary;
		private static final String CAR = "BMW";

		public Serenity(int number) {
			this.number = number;
		}

		public Serenity(String name) {
			this.name = name;
		}

		public Serenity(long salary) {
			this.salary = salary;
		}

		public Serenity(int number, String name, long salary) {
			this.number = number;
			this.name = name;
			this.salary = salary;
		}

		public int getNumber() {
			return number;
		}

		public String getName() {
			return name;
		}

		public long getSalary() {
			return salary;
		}

		public void setNumber(int number) {
			this.number = number;
		}

		public void setName(String name) {
			this.name = name;
		}

		public void setSalary(long salary) {
			this.salary = salary;
		}

	}

}
