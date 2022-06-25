package com.solvd.homework.parsers;

import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlType;

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

