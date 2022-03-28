package homework;

import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;
import java.util.ArrayList;
import java.util.List;


public class Runner {
    public static void main(String[] args) throws AgeException, StationException {
        Stantions departureStantion = new Stantions("Minsk");
        Stantions destinationStation = new Stantions("Brest");
        Passengers passengers = new Passengers(10, 4);
        Driver driver = new Driver("woman", "Kate", 18);


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

        IMoveGoods truck = new Truck("blue", "6 m.",18, 4 );
        IMoveGoods sedan2 = new Sedan("Green","2.3 m.", 4, 5 );
        start(sedan2);

        List<Passengers> parts = new ArrayList<>();

        Passengers part1 = new Passengers(1,3);
        Passengers part2 = new Passengers(1,1);
        Passengers part3 = new Passengers(1,5);

        parts.add(part1);
        parts.add(part2);
        parts.add(part3);

        Passengers passengers1FromCollection = parts.get(0);
        Passengers passengers2FromCollection = parts.get(1);
        Passengers passengers3FromCollection = parts.get(2);
        System.out.println(passengers1FromCollection);
        System.out.println(passengers2FromCollection);
        System.out.println(passengers3FromCollection);

        List<String> stations = new ArrayList<>();
        stations.add("Minsk");
        stations.add("Brest");
        stations.add("Vitebsk");



    }
    private static final Logger LOGGER = LogManager.getLogger(Runner.class);

    public static void start (Vehicles vehicles) throws AgeException, StationException {
        Stantions departureStantion = new Stantions("");
        try {
            LOGGER.info(departureStantion.setName("Orsha"));
        } catch (StationException ex){
            LOGGER.error(ex.getMessage(), ex);
            departureStantion.setName("Minsk");
        }
        Stantions destinationStation = new Stantions("Brest");
        Passengers passengers = new Passengers(10, 1);
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
    public static void start (IMoveGoods IMoveGoods){
        IMoveGoods.moveGoods();

    }
}
