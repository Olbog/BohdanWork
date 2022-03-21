package homeWork;

class Truck extends Car implements Engine,LoadCapacity,Doors,Roof,Speed {


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

    @Override
    public void fuelConsuption(){
        System.out.println("Consuption fuel for this track is 27 l./100 km.");
    }
    @Override
    public void maxGravity(){
        System.out.println("Maximum gravity fot this track is 27 tons");
    }
    @Override
    public void countDoors(){
        System.out.println("There are 2 doors in this track ");
    }
    @Override
    public void isRoof(){
        System.out.println("This track has a small roof" + " and " + hatch);
    }
    @Override
    public void maxSpeed(){
        System.out.println("Maximum speed of this track is 110 km/hour ");
    }
}
