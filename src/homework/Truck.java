package homework;

class Truck extends Car implements IMoveGoods, IDoors, IAirConditioning {

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
            startTime();
            moveGoods();
            openDoors();
            gas();
            turnConditioningOn();
            brake();
        }
    }
    @Override
    public void gas() {
        System.out.println("Track started!");
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
    public void moveGoods() {
        System.out.println("This type of transport can moves goods before 27 tons");
    }

    @Override
    public void openDoors() {
        System.out.println("You have only 2 open doors in your track..");
    }

    @Override
    public void turnConditioningOn() {
    }

    @Override
    public void turnConditioningOff() {
        System.out.println("Conditioning isnt't working");
    }
}
