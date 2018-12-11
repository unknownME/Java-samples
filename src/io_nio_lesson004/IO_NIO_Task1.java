package io_nio_lesson004;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;

public class IO_NIO_Task1 {

	public static void main(String[] args) throws IOException {

		File file = new File("C:\\1.txt");

		try (PrintWriter pw = new PrintWriter(file)) {
			pw.println(
					"regular file of that name cannot be created, or if some other error occurs while opening or creating the file");
		} catch (Exception e) {
			e.printStackTrace();
		}

		BufferedReader br = new BufferedReader(new FileReader(file));
		System.out.println(br.readLine());
		br.close();

	}

}
