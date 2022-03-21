package homeWork;

class Sedan extends Car implements Engine,LoadCapacity,Doors,Roof,Speed{

    public Sedan(String color, String lenght, int wheels, int maxCount){
        super(color, lenght, wheels,maxCount);
    }

    public void move(Stantions departureStantion, Stantions destinationStation,Passengers passengers, Driver driver){
        System.out.println("Your auto: " + "\n" + this);
        System.out.println("Info about drivers: " + "\n" + driver);
        System.out.println(passengers);
        if (passengers.getCount() > 4){
            System.out.println("Sorry, we will not drive, a lot of passengers for SEDAN");
        } else {
            System.out.println("your auto will drive from " + departureStantion.getName() + " to " + destinationStation.getName());
            startTime();
            maxGravity();
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
        System.out.println("Sedan started");
    }


    @Override
    public String toString(){
        return (getColor() + "\n" +
                getLenght() + "\n"+
                getWheels() + "\n"+
                getMaxCount() + "\n");
    }

    @Override
    public void fuelConsuption(){
        System.out.println("Consuption fuel for this sedan is 8 l./100 km.");
    }
    @Override
    public void maxGravity(){
        System.out.println("Maximum gravity fot this sedan is 1.5 tons");
    }
    @Override
    public void countDoors(){
        System.out.println("There are 4 doors in this sedan ");
    }
    @Override
    public void isRoof(){
        System.out.println("This sedan has a big roof" + " and " + hatch);
    }
    @Override
    public void maxSpeed(){
        System.out.println("Maximum speed of this sedan is 170 km/hour ");
    }
}
