package com.solvd.homework.dom;

import com.solvd.homework.dom.Driver;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

import jakarta.xml.bind.JAXBContext;
import jakarta.xml.bind.JAXBException;
import jakarta.xml.bind.Marshaller;

public class JaxbRunner {
    public static void main(String[] args) throws JAXBException, IOException {
//        Driver driver = unmarshal();
//        System.out.println(driver);
        Drivers drivers = unmarshal2();
        System.out.println(drivers);
    }

    public static void marshal() throws JAXBException, IOException {
        Driver driver = new Driver();
        driver.setId(1);
        driver.setName("Artic");
        driver.setCity("Minsk");
        driver.setAge(41);
        License license = new License();
        license.setDate(2027);
        driver.setLicense(license);


        JAXBContext context = JAXBContext.newInstance(Driver.class);
        Marshaller mar = context.createMarshaller();
        mar.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);
        mar.marshal(driver, new File(System.getProperty("user.dir") + "/src/main/resources/driver1.xml"));
    }

    public static Driver unmarshal() throws JAXBException, IOException {
        JAXBContext context = JAXBContext.newInstance(Driver.class);
        return (Driver) context.createUnmarshaller()
                .unmarshal(new FileReader(System.getProperty("user.dir") + "/src/main/resources/driver1.xml"));
    }

    public static Drivers unmarshal2() throws JAXBException, IOException {
        JAXBContext context = JAXBContext.newInstance(Drivers.class);
        return (Drivers) context.createUnmarshaller()
                .unmarshal(new FileReader(System.getProperty("user.dir") + "/src/main/resources/driver1.xml"));
    }
}
