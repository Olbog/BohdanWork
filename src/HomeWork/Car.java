package HomeWork;

public abstract class Car extends Vehicles {

    private String color; // цвет данного транпорта
    private String lenght; // длина данного транпорта
    private int wheels; // кол-во колес данного транспорта
    private int maxCount; // максимальное кол-во мест для пассажиров в данном транспорте

    public Car(String color, String lenght, int wheels, int maxCount) {
        this.color = color;
        this.lenght = lenght;
        this.wheels = wheels;
        this.maxCount = maxCount;
    }


    public abstract void gas();


    public void brake(){
        System.out.println("Автомобиль тормозит..");
    }

    public void move(){

        Stantions stantions1 = new Stantions();
        stantions1.departureStation();
        System.out.println("Ваше авто: " + "\n" + new Truck("красный", "7 м.", 3, 2));
        Moto moto1 = new Moto("зеленый","1 м.", 2,2);
        System.out.println(moto1);
        System.out.println("Информация о водителях: " + "\n" + new Driver());
        Passengers passengers1 = new Passengers(10, 10);
        System.out.println(passengers1);
        Truck truck1 = new Truck("красный", "7 м.", 0, 2);
        truck1.gas();
        truck1.roadA();
        truck1.roadB();
        stantions1.destionationStation();
        truck1.brake();

    }



    public void setColor(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setLenght(String lenght) {
        this.lenght = lenght;
    }

    public String getLenght() {
        return lenght;
    }

    public void setWheels(int wheels) {
        this.wheels = wheels;
    }

    public int getWheels() {
        return wheels;
    }

    public void setMaxCount(int maxCount) {
        this.maxCount = maxCount;
    }

    public int getMaxCount() {
        return maxCount;
    }


}

