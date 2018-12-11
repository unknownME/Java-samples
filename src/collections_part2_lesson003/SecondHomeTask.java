package collections_part2_lesson003;

import java.util.HashMap;
import java.util.Map;

public class SecondHomeTask {

	private static final String[] CITIES = { "Moscow", "Kyiv", "London", "Paris", "Juarez" };
	private static final String[] FAMILIES = { "Ivanovu", "Petrovu", "Smits", "Parles", "Seviliases" };

	public static void main(String[] args) {

		for (Map.Entry<String, String> entry : getMap().entrySet()) {
			System.out.println("In city " + entry.getKey() + " lives - " + entry.getValue());
		}
	}

	public static Map<String, String> getMap() {
		Map<String, String> map = new HashMap<>();
		for (int i = 0; i < 5; i++) {
			map.put(CITIES[i], FAMILIES[i]);
		}
		return map;
	}

}
