package HomeWork;

class Truck extends Car{


    public Truck(String color, String lenght, int wheels, int maxCount){
        super(color, lenght, wheels,maxCount);
    }

    private String color = getColor();
    private String lenght = getLenght();
    private int wheels = getWheels();
    private int maxCount = getMaxCount();


    @Override
    public String toString(){
        return ("грузовик: " + "\n" + color + "\n" +
                lenght + "\n"+
                wheels + "\n"+
                maxCount + "\n");
    }

    public void roadA() {
        System.out.println("Грузовик выехал из точки А");
    }

    public void roadB() {
        System.out.println("Грузовик приехал в точку Б");

    }

    @Override
    public void gas(){
        System.out.println("Грузовик завелся!");
    }

}
