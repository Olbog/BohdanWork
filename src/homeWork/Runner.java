package homeWork;

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
        System.out.println(moto.hashCode());
        System.out.println(moto2.hashCode());
        System.out.println(moto.equals(moto2));

        IMoveGoods truck = new Truck("blue", "6 m.",18, 4 );
        IMoveGoods sedan2 = new Sedan("Green","2.3 m.", 4, 5 );
        start(sedan2);
    }

    public static void start (Vehicles vehicles) throws AgeException, StationException {
        Stantions departureStantion = new Stantions("");
        try {
            departureStantion.setName("Orsha");
        } catch (StationException ex){
            System.err.println(ex.getMessage());
            departureStantion.setName("Minsk");
        }
        Stantions destinationStation = new Stantions("Brest");
        Passengers passengers = new Passengers(10, 1);
        Driver driver = new Driver("woman", "Kate", 17);
        try {
            driver.setAge(17);
        } catch (AgeException e){
            e.printStackTrace();
            driver.setAge(18);
        }


        vehicles.move(departureStantion, destinationStation, passengers, driver);
    }
    public static void start (IMoveGoods IMoveGoods){
        IMoveGoods.moveGoods();

    }
}
