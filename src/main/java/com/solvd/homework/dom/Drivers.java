package com.solvd.homework.dom;

import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlType;

import javax.xml.bind.annotation.XmlElement;
import java.util.List;


@XmlRootElement(name = "drivers")
@XmlType(propOrder = {"driver"})

public class Drivers {
    private List<Driver> driver;

    public List<Driver> getDrivers() {
        return driver;
    }
    @XmlElement
    public void setDrivers(List<Driver> drivers) {
        this.driver = drivers;
    }

    @Override
    public String toString() {
        return "Drivers{" +
                "drivers=" + driver +
                '}';
    }
}

