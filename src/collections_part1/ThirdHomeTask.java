package collections_part1;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class ThirdHomeTask {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		List<Integer> list = new LinkedList<>();
		for (int i = 0; i < 5; i++) {
			System.out.println("Please enter the " + i + " number:");
			list.add(sc.nextInt());
		}

		System.out.println(getMinimum(list));
	}

	private static int getMinimum(List<Integer> list) {
		return list.stream().reduce(Integer::min).get();
	}

}
