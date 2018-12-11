package saxParser_and_jaxb_lesson010;

import java.io.File;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;

public class Lesson_010_Task3 {

	static JAXBContext jaxbContext = null;
	static Marshaller jaxbMarshaller = null;

	public static void main(String[] args) {

		Cities city = new Cities();
		city.setCity("Kyiv");
		city.setStreet("Raskovoy");
		city.setNumberOfHouse(11);

		try {

			File file = new File("C:\\cities.xml");
			jaxbContext = JAXBContext.newInstance(Cities.class);
			jaxbMarshaller = jaxbContext.createMarshaller();

			jaxbMarshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);

			jaxbMarshaller.marshal(city, file);
			jaxbMarshaller.marshal(city, System.out);

		} catch (JAXBException e) {
			e.printStackTrace();
		} finally {
			city = null;
			jaxbContext = null;
			jaxbMarshaller = null;
		}

	}

}
