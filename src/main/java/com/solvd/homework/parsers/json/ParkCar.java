package com.solvd.homework.parsers.json;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlType;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

@XmlRootElement(name = "ParkCar")
@XmlType(propOrder = {"id", "brand", "model", "drivers"})
@JsonPropertyOrder({"id", "brand", "model", "drivers"})
public class ParkCar {

    @JsonProperty
    private int id;
    @JsonProperty
    private String brand;
    @JsonProperty
    private String model;
    @JsonProperty
    private List<Driver> drivers = new ArrayList<>();


    @Override
    public String toString() {
        return "ParkCar{" +
                "id=" + id +
                ", brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", drivers=" + drivers +
                '}';
    }

    public ParkCar() {
    }

    public int getId() {
        return id;
    }

    @XmlAttribute
    public void setId(int id) {
        this.id = id;
    }

    public String getBrand() {
        return brand;
    }

    @XmlElement
    public void setBrand(String name) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    @XmlElement
    public void setModel(String model) {
        this.model = model;
    }

    public List<Driver> getDrivers() {
        return drivers;
    }

    @XmlElement
    public void setDrivers(List<Driver> drivers) {
        this.drivers = drivers;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof ParkCar)) return false;
        ParkCar that = (ParkCar) o;
        return id == that.id && Objects.equals(brand, that.brand) && Objects.equals(model, that.model) && Objects.equals(drivers, that.drivers);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, brand, model, drivers);
    }
}
