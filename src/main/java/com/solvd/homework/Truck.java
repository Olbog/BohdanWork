package com.solvd.homework;

import com.solvd.homework.funcInterface.DescriptionLength;
import com.solvd.homework.funcInterface.DescriptionWheels;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import java.util.HashMap;
import java.util.Map;

class Truck extends Car implements IMoveGoods, IDoors, IAirConditioning {

    private static final Logger LOGGER = LogManager.getLogger(Maps.class);

    public Truck(String color, String lenght, int wheels, int maxCount) {
        super(color, lenght, wheels, maxCount);
    }

    public void move(Stantions departureStantion, Stantions destinationStation, Passengers passengers, Driver driver)
    throws TruckExceptions {
        LOGGER.info("Your auto: " + "\n" + this);
        if (driver.getAge() < 23) {
            try {
                driver.setAge(25);
            } catch (AgeException e) {
                LOGGER.error("You don't have enough experience");
            }
        } else {
            LOGGER.info("Info about drivers: " + "\n" + driver);
        }

        LOGGER.info(passengers);
        try {
            if (passengers.getCount() > 2) {
                throw new TruckExceptions("This truck can not take so many passengers ");

            } else {
                LOGGER.info("your track will drive from " + departureStantion.getName() + " to " + destinationStation.getName());
                startTime();
                moveGoods();
                openDoors();
                gas();
                turnConditioningOn();
                brake();
            }

            Map<Truck, Integer> mapTruck = new HashMap<>();
            mapTruck.put(new Truck("red", "4.5 m.", 18, 3), 9);
            mapTruck.put(new Truck("black", "5.2 m.", 24, 4), 11);
            mapTruck.put(new Truck("orange", "4,9 m.", 24, 5), 7);

            LOGGER.info(mapTruck);
        } catch (TruckExceptions e) {
            LOGGER.error(" Nobody is going, sorry! ", e);
        }
    }
    static void lambdaLeght(){
        Truck sedMers = new Truck("green", "12 m.", 24, 2);
        Truck sedVolvo = new Truck("red", "11.1 m.", 20, 2);
        Truck sedVaz = new Truck("orange", "13.1 m.", 18, 1);
        DescriptionLength descriptionLeght = (x, y, z) -> {
            String one = x;
            String two = y;
            String three = z;
            return x + z + y;
        };
        LOGGER.info(descriptionLeght.descLength(sedMers.getLenght(),sedVolvo.getLenght(), sedVaz.getLenght()));

    }
        static void lambdaWheels(){
            Truck sedMan = new Truck("brown", "9.6 m.", 24, 2);
            Sedan sedIveco = new Sedan("orange", "9.9 m.", 24, 3);
            DescriptionWheels descriptionWheels = (x, y) -> x * y;
            LOGGER.info("All wheels: " + descriptionWheels.wheelsCount(sedMan.getWheels(), sedIveco.getWheels()));
        }

    @Override
    public void gas() {
        LOGGER.info("Track started!");
    }

    @Override
    public String toString() {
        return "Truck{" +
                "color='" + getColor() + '\'' +
                ", lenght='" + getLenght() + '\'' +
                ", wheels=" + getWheels() +
                ", maxCount=" + getMaxCount() +
                '}';
    }

    @Override
    public void moveGoods() {
        LOGGER.info("This type of transport can moves goods before 27 tons");
    }

    @Override
    public void openDoors() {
        LOGGER.info("You have only 2 open doors in your track..");
    }

    @Override
    public void turnConditioningOn() {
    }

    @Override
    public void turnConditioningOff() {
        LOGGER.info("Conditioning isnt't working");
    }
}
