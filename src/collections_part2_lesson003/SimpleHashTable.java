package collections_part2_lesson003;

import java.util.HashMap;
import java.util.Map;

public class SimpleHashTable {

	static Map<String, String> gettedMap = SecondHomeTask.getMap();
	static final HashMap<String, String> TABLE = (HashMap<String, String>) gettedMap;

	public static void main(String[] args) {

		replaceElement("Juarez", "AAA");
		System.out.println(TABLE);
		replaceElement("Juarez", "AAA", "BBB");
		System.out.println(TABLE);
		removeElement("Juarez");
		System.out.println(TABLE);
		removeElement("Moscow", "Ivanovu");
		System.out.println(TABLE);
	}

	private static void replaceElement(String key, String value) {
		TABLE.replace(key, value);
	}

	private static void replaceElement(String key, String oldValue, String newValue) {
		TABLE.replace(key, oldValue, newValue);
	}

	private static void removeElement(Object key) {
		TABLE.remove(key);
	}

	private static void removeElement(Object key, Object value) {
		TABLE.remove(key, value);
	}

}
