package homeWork;

public class Runner {
    public static void main(String[] args) {
        Stantions departureStantion = new Stantions("Minsk");
        Stantions destinationStation = new Stantions("Brest");
        Passengers passengers = new Passengers(10, 4);
        Driver driver = new Driver("woman", "Kate", 29);


        Vehicles moto = new Moto("red", "1 m.",2, 1 );
        Vehicles track = new Truck("blue", "6 m.",18, 4 );
        start(moto);
        start(track);
    }
    public static void start (Vehicles vehicles){
        Stantions departureStantion = new Stantions("Minsk");
        Stantions destinationStation = new Stantions("Brest");
        Passengers passengers = new Passengers(10, 2);
        Driver driver = new Driver("woman", "Kate", 29);
        vehicles.move(departureStantion, destinationStation, passengers, driver);
    }
}
