package homework;

import java.util.Objects;

public abstract class Car extends Vehicles {

    private boolean carBody;

    public Car(String color, String lenght, int wheels, int maxCount, boolean carBody) {
        super(color, lenght, wheels, maxCount);
        this.carBody = carBody;
    }
    public Car(String color, String lenght, int wheels, int maxCount)  {
        super(color, lenght, wheels, maxCount);
    }


    public boolean isDoors() {
        return carBody;
    }

    public void setDoors(boolean doors) {
        this.carBody = doors;
    }

    public static void main(String[] args) throws TruckExceptions{
    }

    @Override
    public String toString() {
        return "Car{" +
                "carBody=" + carBody +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Car car = (Car) o;
        return carBody == car.carBody;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), carBody);
    }
}

