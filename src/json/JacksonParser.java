package json;

import java.io.File;
import java.io.IOException;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.core.JsonGenerationException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

@JsonPropertyOrder({ "Country", "City", "Street" })
public class JacksonParser {

	@JsonProperty("Country")
	private String country;

	@JsonProperty("City")
	private String city;

	@JsonProperty("Street")
	private String street;

	public static final String PATH = "C:\\JSON.json";

	public JacksonParser(String country, String city, String street) {
		this.country = country;
		this.city = city;
		this.street = street;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	@Override
	public String toString() {
		return "[country=" + country + ", city=" + city + ", street=" + street + "]";
	}

	public static void toJson(String example) throws JsonGenerationException, JsonMappingException, IOException {

		ObjectMapper mapper = new ObjectMapper();
		mapper.writeValue(new File(PATH), example);
		String jsonInString = mapper.writeValueAsString(example);
		System.out.println(jsonInString);
	}

}
