package collections_part1_lesson002;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class SecondHomeTask {

	public static void main(String[] args) throws IOException {

		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

		List<String> list = new ArrayList<>();
		for (int i = 0; i < 5; i++) {
			System.out.println("Please, enter value:");
			list.add(reader.readLine());
		}

		doubleValues(list);

		for(int i = 0; i < list.size(); i++) {
			System.out.print(list.get(i) + ", ");
		}
		
	}

	private static List<String> doubleValues(List<String> list) {
		for (int i = 0; i < list.size(); i++) {
			String value = list.get(i);
			list.add(i, value);
			i++;
		}
		return list;

	}

}
