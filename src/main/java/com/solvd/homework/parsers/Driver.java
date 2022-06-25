package com.solvd.homework.parsers;

import jakarta.xml.bind.annotation.*;

@XmlRootElement(name = "driver")
@XmlType(propOrder = {"id","name", "age", "city", "license"})
public class Driver {

    private int id;
    private String name;
    private int age;
    private String city;
    private License license;

    public String getName() {
        return name;
    }
    @XmlElement
    public void setName(String name) {
        this.name = name;
    }

    public String getCity() {
        return city;
    }

    @XmlElement
    public void setCity(String city) {
        this.city = city;
    }

    public int getAge() {
        return age;
    }

    @XmlElement
    public void setAge(int age) {
        this.age = age;
    }

    public License getLicense() {
        return license;
    }

    @XmlElement
    public void setLicense(License license) {
        this.license = license;
    }

    public int getId() {
        return id;
    }

    @XmlElement
    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Driver{" +
                "id='" + id + '\'' +
                "name='" + name + '\'' +
                ", city='" + city + '\'' +
                ", age=" + age +
                ", license=" + license +
                '}';
    }
}
