package com.solvd.homework;

import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;


public class Runner {
    public static void main(String[] args) throws AgeException, StationException, MotoExceptions, TruckExceptions {


        Vehicles moto = new Moto("red", "1 m.",2, 1 );
        Vehicles moto2 = new Moto("red", "1 m.",2, 1 );
        Vehicles track = new Truck("blue", "6 m.",18, 4 );
        Vehicles sedan = new Sedan("Green","2.3 m.", 4, 5 );
        Maps.loading();
        start(moto);
        start(sedan);
        start(track);
        LOGGER.info(moto.hashCode());
        LOGGER.info(moto2.hashCode());
        LOGGER.info(moto.equals(moto2));

        IMoveGoods truck = new Truck("blue", "6 m.",18, 2 );
        IMoveGoods sedan2 = new Sedan("Green","2.3 m.", 4, 5 );
        start(sedan2);




    }
    private static final Logger LOGGER = LogManager.getLogger(Runner.class);

    public static void start (Vehicles vehicles) throws AgeException, StationException, MotoExceptions, TruckExceptions {
        Stantions departureStantion = new Stantions("");
        try {
            LOGGER.info(departureStantion.setName("Orsha"));
        } catch (StationException ex){
            LOGGER.error(ex.getMessage(), ex);
            departureStantion.setName("Minsk");
        }
        Stantions destinationStation = new Stantions("Brest");
        Passengers passengers = new Passengers(10, 3);
        Driver driver = new Driver("woman", "Kate", 17);
        try {
            driver.setAge(17);
        } catch (AgeException e){
            e.printStackTrace();
            LOGGER.error("Error Age");
            driver.setAge(18);
        }


        vehicles.move(departureStantion, destinationStation, passengers, driver);
    }
    public static void start (IMoveGoods iMoveGoods){
        iMoveGoods.moveGoods();

    }
}
