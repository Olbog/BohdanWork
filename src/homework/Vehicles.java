package homework;

import java.util.Objects;
import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;

public abstract class Vehicles {

    private String color; // color this vehicles
    private String lenght; // lenght this vehicles
    private int wheels; // count of lenght this vehicles
    private int maxCount; // maximum number of seats for passengers

    public Vehicles (String color, String lenght, int wheels, int maxCount) {
        this.color = color;
        this.lenght = lenght;
        this.wheels = wheels;
        this.maxCount = maxCount;
    }
    private static final Logger LOGGER = LogManager.getLogger(Vehicles.class);



    public abstract void gas();


    public void brake(){
        System.out.println("Auto is stopping");
    }

    public abstract void move(Stantions departureStantion, Stantions destinationStation,Passengers passengers, Driver driver);

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getLenght() {
        return lenght;
    }

    public void setLenght(String lenght) {
        this.lenght = lenght;
    }

    public int getWheels() {
        return wheels;
    }

    public void setWheels(int wheels) {
        this.wheels = wheels;
    }

    public int getMaxCount() {
        return maxCount;
    }

    public void setMaxCount(int maxCount) {
        this.maxCount = maxCount;
    }
    public final void startTime(){
        System.out.println("The start time of the trip is at 8 p.m. for all vehicles");
    }

    @Override
    public String toString() {
        return "Vehicles{" +
                "color='" + color + '\'' +
                ", lenght='" + lenght + '\'' +
                ", wheels=" + wheels +
                ", maxCount=" + maxCount +
                '}';

    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Vehicles vehicles = (Vehicles) o;
        return wheels == vehicles.wheels && maxCount == vehicles.maxCount && color.equals(vehicles.color) && lenght.equals(vehicles.lenght);
    }

    @Override
    public int hashCode() {
        return Objects.hash(color, lenght, wheels, maxCount);
    }


}
