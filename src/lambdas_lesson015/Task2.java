package lambdas_lesson015;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

public class Task2 {

	public static void main(String[] args) {
		int sum = 0;
		List<Integer> a = getFilledList().stream().map(i -> i = (int) Math.sqrt(i)).collect(Collectors.toList());
		System.out.println("Second rounded list with random integers is:\n" + a + "\n-----------------------");
		for (Integer b : a) {
			sum += b;
		}
		System.out.println("Final sum of rounded integers before:\n" + sum);
	}

	public static ArrayList<Integer> getFilledList() {
		ArrayList<Integer> list = new ArrayList<>();
		for (int i = 0; i < 10; i++) {
			list.add(new Random().nextInt(10000));
		}
		System.out.println("First list with random integers is:\n" + list + "\n-----------------------");
		return list;

	}

}
