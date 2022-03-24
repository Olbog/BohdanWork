package homeWork;

class Sedan extends Car implements IMoveGoods, IDoors, IAirConditioningOn, IExtremeDriving{

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
            moveGoods();
            openDoors();
            gas();
            turnConditioningOn();
            extreme();
            brake();
        }
    }
    @Override
    public void gas(){
        System.out.println("Sedan started");
    }

    @Override
    public String toString() {
        return "Sedan{" +
                "color='" + getColor() + '\'' +
                ", lenght='" + getLenght() + '\'' +
                ", wheels=" + getWheels() +
                ", maxCount=" + getMaxCount() +
                '}';
    }

    @Override
    public void moveGoods() {
        System.out.println(HATCH);
    }
    @Override
    public void openDoors() {
        System.out.println("You have 3 open doors in your sedan..");
    }

    @Override
    public void turnConditioningOn() {
        System.out.println("Conditioning is working");
    }
    @Override
    public void extreme() {
        System.out.println("You did the police u-turn");
    }
}
