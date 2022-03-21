package homeWork;

public abstract class Car extends Vehicles {

    private boolean carBody;

    public Car(String color, String lenght, int wheels, int maxCount, boolean carBody) {
        super(color, lenght, wheels, maxCount);
        this.carBody = carBody;
    }
    public Car(String color, String lenght, int wheels, int maxCount) {
        super(color, lenght, wheels, maxCount);
    }


    public boolean isDoors() {
        return carBody;
    }

    public void setDoors(boolean doors) {
        this.carBody = doors;
    }

}

