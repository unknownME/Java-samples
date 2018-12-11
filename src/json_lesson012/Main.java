package json_lesson012;

import java.io.IOException;
import com.fasterxml.jackson.core.JsonGenerationException;
import com.fasterxml.jackson.databind.JsonMappingException;

public class Main {

	public static final String EXAMPLE = "{\"Country\":\"Ukraine\",\"City\":\"Kyiv\",\"Street\":\"Kreshatuk\"}";

	public static void main(String[] args) throws JsonGenerationException, JsonMappingException, IOException {
		GsonParser.toGSON(EXAMPLE);
		JacksonParser.toJson(EXAMPLE);

	}

}
