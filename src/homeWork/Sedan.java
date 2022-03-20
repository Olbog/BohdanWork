package homeWork;

class Sedan extends Car{

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
}
