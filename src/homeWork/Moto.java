package homeWork;

public class Moto extends Vehicles implements Engine,LoadCapacity,Doors,Roof,Speed{

    public Moto(String color, String lenght, int wheels, int maxCount){
        super(color, lenght, wheels,maxCount);
    }

    public void move(Stantions departureStantion, Stantions destinationStation,Passengers passengers, Driver driver){
        System.out.println("Your moto: " + "\n" + this);
        System.out.println("Info about drivers: " + "\n" + driver);
        System.out.println(passengers);
        if (passengers.getCount() > 1){
            System.out.println("Sorry, we will not drive, a lot of passengers for MOTO");
        } else {
            System.out.println("your moto will drive from " + departureStantion.getName() + " to " + destinationStation.getName());
            startTime();
            fuelConsuption();
            maxGravity();
            countDoors();
            isRoof();
            maxSpeed();
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
    public void fuelConsuption(){
        System.out.println("Consuption fuel for this moto is 3 l./100 km.");
    }
    @Override
    public void maxGravity(){
        System.out.println("Maximum gravity fot this moto is 0.2 tons");
    }
    @Override
    public void countDoors(){
        System.out.println("This moto hasn't a doors ");
    }
    @Override
    public void isRoof(){
        System.out.println("This moto hasn't a roof");
    }
    @Override
    public void maxSpeed(){
        System.out.println("Maximum speed of this moto is 230 km/hour ");
    }
}

