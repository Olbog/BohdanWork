package com.solvd.homework.parsers.json;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

//@JsonIgnoreProperties(ignoreUnknown = true)
public class Driver {
    @JsonProperty
    private CarDriver carDriver;

    public CarDriver getCarDriver(){
        return carDriver;
    }
    public void setCarDriver(CarDriver carDriver){
        this.carDriver = carDriver;
    }
    @Override
    public String toString() {
        return "Driver{" +
                carDriver +
                '}';
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Driver)) return false;
        Driver driver = (Driver) o;
        return Objects.equals(carDriver,driver.carDriver);
    }

    @Override
    public int hashCode() {
        return Objects.hash(carDriver);
    }
}
