package homeWork;

public class Moto extends Vehicles implements IRidingOnWheel, IExtremeDriving{

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
            oneWheel();
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
    public void oneWheel() {
        System.out.println("You are staying on 1 wheel !");
    }

    @Override
    public void extreme() {
        System.out.println("You did performed a standing ride");
    }

}

