package io_nio_lesson004;

import java.io.*;
import java.util.Arrays;
import java.util.Random;

public class IO_NIO_Task2 {

	public static void main(String[] args) throws IOException {
		File file = new File("C:\\2.txt");
		int[] a = getArray();
		Arrays.sort(a);
		Writer wr = new FileWriter(file);
		for (int i = 0; i < getArray().length; i++) {
			wr.write(String.valueOf(a[i]) + " ");
		}
		wr.close();

		BufferedReader br = new BufferedReader(new FileReader(file));
		String temp;
		while ((temp = br.readLine()) != null) {
			System.out.println(temp);
		}
		br.close();

	}

	private static int[] getArray() {
		Random random = new Random();
		int[] array = new int[30];
		for (int i = 0; i < 30; i++) {
			array[i] = random.nextInt(300);
		}
		return array;
	}

}
