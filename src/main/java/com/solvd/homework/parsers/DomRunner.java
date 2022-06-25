package com.solvd.homework.parsers;

import java. io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import javax. xml. parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax. xml.parsers.ParserConfigurationException;
import org.w3c.dom. Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org. xml.sax. SAXException;

public class DomRunner {
    public static void main(String[] args) throws ParserConfigurationException, SAXException, IOException {
        DocumentBuilderFactory documentBuilderFactory = DocumentBuilderFactory.newInstance();
        DocumentBuilder builder = documentBuilderFactory.newDocumentBuilder();
        Document document = builder.parse(new File(System.getProperty("user.dir") + "/src/main/resources/dom.xml"));

        NodeList nodeList = document.getElementsByTagName("driver");
        int index = nodeList.getLength();
        List<Driver> drivers = new ArrayList<>();

        for (int i = 0; i < index; i ++) {

            Driver driver = new Driver();
            License license = new License();
            Node node = nodeList.item(i);
            Element element = (Element) node;
            driver.setName(element.getElementsByTagName("name").item(0).getTextContent());
            driver.setCity(element.getElementsByTagName("city").item(0).getTextContent());
            driver.setAge(Integer.parseInt(element.getElementsByTagName("age").item(0).getTextContent()));

            Node licenceNod = element.getElementsByTagName("license").item(0);
            Element licenceElement = (Element) licenceNod;
            license.setDate(Integer.parseInt(licenceElement.getElementsByTagName("date").item(0).getTextContent()));
            driver.setLicense(license);
            drivers.add(driver);
        }

        System.out.println(drivers);


    }
}