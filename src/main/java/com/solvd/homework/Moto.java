package com.solvd.homework;

import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;

import java.util.*;

public class Moto extends Vehicles implements IRidingOnWheel, IExtremeDriving{

    public Moto(String color, String lenght, int wheels, int maxCount){
        super(color, lenght, wheels,maxCount);
    }
    private static final Logger LOGGER = LogManager.getLogger(Moto.class);

    public void move(Stantions departureStantion, Stantions destinationStation,Passengers passengers, Driver driver)
    throws MotoExceptions{
        LOGGER.info("Your moto: " + "\n" + this);
        LOGGER.info("Info about drivers: " + "\n" + driver);
        LOGGER.info(passengers);
        try {
            if (passengers.getCount() > 1) {
                throw new MotoExceptions("Sorry, we will not drive, a lot of passengers for MOTO");
            } else {
                LOGGER.info("your moto will drive from " + departureStantion.getName() + " to " + destinationStation.getName());
                startTime();
                rideOnOneWheel();
                extreme();
                gas();
                brake();
            }
        } catch (MotoExceptions e){
            LOGGER.error("Unknown error in moto class");
        }

        Set<Moto> motos = new LinkedHashSet<>() {
        };

        Moto moto1 = new Moto("red", "1.5 m.", 2, 3);
        Moto moto2 = new Moto("green", "1.3 m.", 2, 2);
        Moto moto3 = new Moto("braun", "1.2 m.", 2, 1);
        Moto moto4 = new Moto("braun", "1.2 m.", 2, 1);


        motos.add(moto1);
        motos.add(moto2);
        motos.add(moto3);
        motos.add(moto4);

        LOGGER.info(motos);

        //Moto moto1FromCollection = motos.get(0);
        //Moto moto2FromCollection = motos.get(1);
        //Moto moto3FromCollection = motos.get(2);
        //LOGGER.info(moto1FromCollection);
        //LOGGER.info(moto2FromCollection);
        //LOGGER.info(moto3FromCollection);
    }
    @Override
    public void gas(){
        System.out.println("Moto started!");
    }

    @Override
    public String toString() {
        return "Moto{" +
                "color='" + getColor() + '\'' +
                ", lenght='" + getLenght() + '\'' +
                ", wheels=" + getWheels() +
                ", maxCount=" + getMaxCount() +
                '}';
    }

    @Override
    public void rideOnOneWheel() {
        System.out.println("You are staying on 1 wheel !");
    }

    @Override
    public void extreme() {
        System.out.println("You did performed a standing ride");
    }

}

