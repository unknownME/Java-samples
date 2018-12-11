package saxParser_and_jaxb_lesson010;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Cities {
 
	private String city;
	private String street;
	private int numberOfHouse;

	public String getCity() {
		return city;
	}

	@XmlElement
	public void setCity(String city) {
		this.city = city;
	}

	public String getStreet() {
		return street;
	}

	@XmlElement
	public void setStreet(String street) {
		this.street = street;
	}

	public int getNumberOfHouse() {
		return numberOfHouse;
	}

	@XmlElement
	public void setNumberOfHouse(int numberOfHouse) {
		this.numberOfHouse = numberOfHouse;
	}
}

