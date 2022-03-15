package HomeWork;

public class Vehicles {
    public static void main(String[] args) {
        Car.roadA();
        System.out.println("Ваше авто: " + "\n" + new Car());
        System.out.println("Информация о пассажирах: " + "\n" + new Passengers());
        System.out.println("Информация о водителях: " + "\n" + new Driver());
        Car.roadB();
    }
}

