package HomeWork;

public class Vehicles {
    public static void main(String[] args) {
        CarBody.roadA();
        System.out.println("Ваше авто: " + "\n" + new CarBody());
        System.out.println("Информация о пассажирах: " + "\n" + new Passengers());
        System.out.println("Информация о водителях: " + "\n" + new Driver());
        CarBody.roadB();


    }
}

class CarBody {
    private String color; // цвет данного транпорта
    private String lenght; // длина данного транпорта
    private int wheels; // кол-во колес данного транспорта
    private int maxCount; // максимальное кол-во мест для пассажиров в данном транспорте

    public CarBody(String color, String lenght, int wheels, int maxCount) {
        this.color = color;
        this.lenght = lenght;
        this.wheels = wheels;
        this.maxCount = maxCount;
    }

    public CarBody() {
        this.color = "red";
        this.lenght = "two and half meters";
        this.wheels = 10;
        this.maxCount = 50;
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

    public static void roadA() {
        System.out.println("Вы выехали из точки А");
    }

    public static void roadB() {
        System.out.println("Вы приехали в точку Б");
    }

    @Override
    public String toString(){
        return (color+ "\n"
        + lenght + "\n"
        + wheels + " wheels" + "\n"
        + maxCount + " maximum number of passengers" + "\n");
    }
}

class Passengers {
    private int maxWeight; // максимальный вес пассажиров в тоннах
    private int count; // количество фактических пассажиров

    public Passengers(int maxWeight, int count) {
        this.maxWeight = maxWeight;
        this.count = count;
    }

    public Passengers() {
        this.maxWeight = 10;
        this.count = 14;
    }

    public void setMaxWeight(int maxWeight) {
        this.maxWeight = maxWeight;
    }

    public int getMaxWeight() {
        return maxWeight;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public int getCount() {
        return count;
    }

    @Override
    public String toString(){
        return (maxWeight + " maximum load" + "\n"
                + count + " passengers in the car now" + "\n");
    }

}

class Driver {
    private String woman;
    private String man;

    public Driver(String woman, String man) {
        this.woman = woman;
        this.man = man;
    }

    public Driver() {
        this.woman = "Mari";
        this.man = "Tom";
    }

    public void setWoman(String woman) {
        this.woman = woman;
    }

    public String getWoman() {
        return woman;
    }

    public void setMan(String man) {
        this.man = man;
    }

    public String getMan() {
        return man;
    }

    @Override
    public String toString(){
        return (woman + "\n"
                + man + "\n");
    }

}
