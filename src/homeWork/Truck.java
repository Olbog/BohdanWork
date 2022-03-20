package homeWork;

class Truck extends Car {


    public Truck(String color, String lenght, int wheels, int maxCount) {
        super(color, lenght, wheels, maxCount);
    }

    public void move(Stantions departureStantion, Stantions destinationStation, Passengers passengers, Driver driver) {
        System.out.println("Your auto: " + "\n" + this);
        System.out.println("Info about drivers: " + "\n" + driver);
        System.out.println(passengers);
        if (passengers.getCount() > 2) {
            System.out.println("Sorry, we will not drive, a lot of passengers for TRACK");
        } else {
            System.out.println("your track will drive from " + departureStantion.getName() + " to " + destinationStation.getName());
            gas();
            brake();
        }
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
    public void gas() {
        System.out.println("Track started!");
    }
}
