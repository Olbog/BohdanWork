package HomeWork;

public class Vehicles {
    public static void main(String[] args) {
        CarBody car1 = new CarBody();
        Driver driver1 = new Driver();
        Passengers passengers1 = new Passengers();
        CarBody.roadA();
        CarBody.roadB();


    }
}
class CarBody{
    private String color;
    private String lenght;
    private int wheels;
    private int maxCount;

    public void setColor(String color){
        this.color = color;
    }
    public String getColor(){
        return color;
    }
     public void setLenght(String lenght){
        this.lenght = lenght;
     }
     public String getLenght(){
        return lenght;
     }
     public void setWheels(int wheels){
        this.wheels = wheels;
     }
     public int getWheels(){
        return wheels;
     }
     public void setMaxCount(int maxCount){
        this.maxCount = maxCount;
     }
     public int getMaxCount(){
        return maxCount;
     }
     public CarBody(String color, String lenght, int wheels, int maxCount){
        this.color = color;
        this.lenght = lenght;
        this.wheels = wheels;
        this.maxCount = maxCount;
     }
     public CarBody(){
         this.color = "red";
         this.lenght = "two and half";
         this.wheels = 10;
         this.maxCount = 50;
     }
     public static void roadA(){
         System.out.println("Вы выехали из точки А");
     }
     public static void roadB(){
         System.out.println("Вы приехали в точку Б");
     }
}

class Passengers{
    private int maxWeight;
    private int count;

    public void setMaxWeight(int maxWeight){
        this.maxWeight = maxWeight;
    }
    public int getMaxWeight(){
        return maxWeight;
    }
    public void setCount(int count){
        this.count = count;
    }
    public int getCount(){
        return count;
    }
    public Passengers(int maxWeight, int count){
        this.maxWeight = maxWeight;
        this.count = count;
    }
    public Passengers(){
        this.maxWeight = 10;
        this.count = 14;
    }
}
class Driver{
    private String woman;
    private String man;

    public Driver(String woman, String man){
        this.woman = woman;
        this.man = man;
    }
    public Driver(){
        this.woman = "Mari";
        this.man = "Tom";
    }

}

// ("green", "two meters", 8, 44)