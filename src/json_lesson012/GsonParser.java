package json_lesson012;

import java.io.IOException;
import java.net.MalformedURLException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class GsonParser {

	public static final String PATH = "C:\\GSON.json";

	public static void toGSON(String example) throws MalformedURLException, IOException {

		Gson gson = new GsonBuilder().setPrettyPrinting().create();
		String a = gson.toJson(example);
		System.out.println(a);
		Files.write(Paths.get(PATH), a.getBytes(), StandardOpenOption.CREATE);

	}

}
