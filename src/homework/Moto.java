package homework;

import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;

public class Moto extends Vehicles implements IRidingOnWheel, IExtremeDriving{

    public Moto(String color, String lenght, int wheels, int maxCount){
        super(color, lenght, wheels,maxCount);
    }
    private static final Logger LOGGER = LogManager.getLogger(Moto.class);

    public void move(Stantions departureStantion, Stantions destinationStation,Passengers passengers, Driver driver){
        LOGGER.info("Your moto: " + "\n" + this);
        LOGGER.info("Info about drivers: " + "\n" + driver);
        LOGGER.info(passengers);
        if (passengers.getCount() > 1){
            LOGGER.info("Sorry, we will not drive, a lot of passengers for MOTO");
        } else {
            LOGGER.info("your moto will drive from " + departureStantion.getName() + " to " + destinationStation.getName());
            startTime();
            rideOnOneWheel();
            extreme();
            gas();
            brake();
        }
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

