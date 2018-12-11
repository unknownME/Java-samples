package saxParser_and_jaxb_lesson010;

import java.io.File;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import org.w3c.dom.Attr;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

public class Lesson_010_Task2 {

	private static final String[] CITIES = { "Kyiv", "Odessa", "Lviv" };
	private static final String[] STREETS = { "Raskovoy", "Deribasovskaya", "Bandery" };
	private static final int[] NUMBEROFHOUSES = { 11, 76, 4 };

	private static final String PATH = "C:\\cities.xml";

	public static void main(String[] args) {
		int counter = 0;

		try {
			DocumentBuilderFactory documentFactory = DocumentBuilderFactory.newInstance();
			DocumentBuilder documentBuilder = documentFactory.newDocumentBuilder();
			Document document = documentBuilder.newDocument();

			Element cityGlobal = document.createElement("City");
			document.appendChild(cityGlobal);

			Element city = document.createElement("target");
			cityGlobal.appendChild(city);

			Attr attr = document.createAttribute("id");
			attr.setValue(Integer.toString(counter + 1));
			city.setAttributeNode(attr);

			Attr attrForCity = document.createAttribute("size");
			attrForCity.setValue("big");

			Element lineCity = document.createElement("city");
			lineCity.appendChild(document.createTextNode(CITIES[counter]));
			lineCity.setAttributeNode(attrForCity);
			city.appendChild(lineCity);

			Element lineStreet = document.createElement("street");
			lineStreet.appendChild(document.createTextNode(STREETS[counter]));
			city.appendChild(lineStreet);

			Element lineNumberOfHouse = document.createElement("house");
			lineNumberOfHouse.appendChild(document.createTextNode(Integer.toString(NUMBEROFHOUSES[counter])));
			city.appendChild(lineNumberOfHouse);
			// -------------------------------
			counter++;
			Element city2 = document.createElement("target");
			cityGlobal.appendChild(city2);

			Attr attr2 = document.createAttribute("id");
			attr2.setValue(Integer.toString(counter + 1));
			city2.setAttributeNode(attr2);

			Attr attrForCity2 = document.createAttribute("size");
			attrForCity2.setValue("big");

			Element lineCity2 = document.createElement("city");
			lineCity2.appendChild(document.createTextNode(CITIES[counter]));
			lineCity2.setAttributeNode(attrForCity2);
			city2.appendChild(lineCity2);

			Element lineStreet2 = document.createElement("street");
			lineStreet2.appendChild(document.createTextNode(STREETS[counter]));
			city2.appendChild(lineStreet2);

			Element lineNumberOfHouse2 = document.createElement("house");
			lineNumberOfHouse2.appendChild(document.createTextNode(Integer.toString(NUMBEROFHOUSES[counter])));
			city2.appendChild(lineNumberOfHouse2);
			// -------------------------------
			counter++;
			Element city3 = document.createElement("target");
			cityGlobal.appendChild(city3);

			Attr attr3 = document.createAttribute("id");
			attr3.setValue(Integer.toString(counter + 1));
			city3.setAttributeNode(attr3);

			Attr attrForCity3 = document.createAttribute("size");
			attrForCity3.setValue("big");

			Element lineCity3 = document.createElement("city");
			lineCity3.appendChild(document.createTextNode(CITIES[counter]));
			lineCity3.setAttributeNode(attrForCity3);
			city3.appendChild(lineCity3);

			Element lineStreet3 = document.createElement("street");
			lineStreet3.appendChild(document.createTextNode(STREETS[counter]));
			city3.appendChild(lineStreet3);

			Element lineNumberOfHouse3 = document.createElement("house");
			lineNumberOfHouse3.appendChild(document.createTextNode(Integer.toString(NUMBEROFHOUSES[counter])));
			city3.appendChild(lineNumberOfHouse3);

			TransformerFactory transformerFactory = TransformerFactory.newInstance();
			Transformer transformer = transformerFactory.newTransformer();
			DOMSource domSource = new DOMSource(document);
			StreamResult streamResult = new StreamResult(new File(PATH));
			transformer.transform(domSource, streamResult);

		} catch (ParserConfigurationException pce) {
			pce.printStackTrace();
		} catch (TransformerException tfe) {
			tfe.printStackTrace();

		}

		SAXParserFactory saxFactory = SAXParserFactory.newInstance();
		try {
			SAXParser saxParser = saxFactory.newSAXParser();

			DefaultHandler handler = new DefaultHandler() {
				boolean name = false;

				@Override
				public void startElement(String uri, String localName, String qName, Attributes attributes)
						throws SAXException {
					if (qName.equalsIgnoreCase("name")) {
						name = true;
					}
				}

				@Override
				public void characters(char ch[], int start, int length) throws SAXException {
					if (name) {
						System.out.println("Name: " + new String(ch, start, length));
						name = false;
					}
				}
			};
			
			saxParser.parse(PATH, handler);
			
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
