package com.solvd.homework;

import com.solvd.homework.FuncInterface.DescriptionColor;
import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;

import java.util.HashMap;
import java.util.Map;

class Sedan extends Car implements IMoveGoods, IDoors, IAirConditioning, IExtremeDriving{

    private static final Logger LOGGER = LogManager.getLogger(Sedan.class);


    public Sedan(String color, String lenght, int wheels, int maxCount){
        super(color, lenght, wheels,maxCount);
    }

    public void move(Stantions departureStantion, Stantions destinationStation,Passengers passengers, Driver driver) {
        LOGGER.info("Your auto: " + "\n" + this);
        LOGGER.info("Info about drivers: " + "\n" + driver);
        LOGGER.info(passengers);
        if (passengers.getCount() > 4) {
            LOGGER.info("Sorry, we will not drive, a lot of passengers for SEDAN");
        } else {
            LOGGER.info("your auto will drive from " + departureStantion.getName() + " to " + destinationStation.getName());
            startTime();
            moveGoods();
            openDoors();
            gas();
            turnConditioningOn();
            extreme();
            brake();

        }

        Map<Sedan, Integer> map = new HashMap<>();
        map.put(new Sedan("red", "2,1 m.", 4, 5), 3);
        map.put(new Sedan("green", "2 m.", 4, 2), 5);
        map.put(new Sedan("blue", "1,9 m.", 4, 4), 1);
        LOGGER.info(map);
        }

    static void lambdaDescription(){
        Sedan sedMers = new Sedan("green", "2 m.", 4, 4);
        Sedan sedVolvo = new Sedan("red", "1.85 m.", 4, 4);
        DescriptionColor carDesc = (x, y) -> {
        String green = x;
        String blue = y;
        return " form " + x + " to " + y;
        };
        LOGGER.info(carDesc.descriptionValue(sedMers.getColor(), sedMers.getLenght()));
        LOGGER.info(carDesc.descriptionValue(sedVolvo.getColor(), sedVolvo.getLenght()));

    }

    @Override
    public void gas(){
        LOGGER.info("Sedan started");
    }

    @Override
    public String toString() {
        return "Sedan{" +
                "color='" + getColor() + '\'' +
                ", lenght='" + getLenght() + '\'' +
                ", wheels=" + getWheels() +
                ", maxCount=" + getMaxCount() +
                '}';
    }

    @Override
    public void moveGoods() {
        LOGGER.info(HATCH);
    }
    @Override
    public void openDoors() {
        LOGGER.info("You have 3 open doors in your sedan..");
    }

    @Override
    public void turnConditioningOn() {
        LOGGER.info("Conditioning is working");
    }

    @Override
    public void turnConditioningOff() {
    }

    @Override
    public void extreme() {
        LOGGER.info("You did the police u-turn");
    }
}
