package homeWork;

public abstract class Car extends Vehicles {

    private boolean doors;

    public Car(String color, String lenght, int wheels, int maxCount, boolean doors) {
        super(color, lenght, wheels, maxCount);
        this.doors = doors;
    }
    public Car(String color, String lenght, int wheels, int maxCount) {
        super(color, lenght, wheels, maxCount);
    }


    public boolean isDoors() {
        return doors;
    }

    public void setDoors(boolean doors) {
        this.doors = doors;
    }

}

