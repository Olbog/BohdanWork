package com.solvd.homework.dom;

import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlType;

import javax.xml.bind.annotation.XmlElement;
import java.util.List;


@XmlRootElement(name = "drivers")
@XmlType(propOrder = {"driver"})

public class Drivers {
    private List<Driver> driver;

    public List<Driver> getDriver() {
        return driver;
    }

    public void setDriver(List<Driver> driver) {
        this.driver = driver;
    }

    @Override
    public String toString() {
        return "Drivers{" +
                "drivers=" + driver +
                '}';
    }
}

