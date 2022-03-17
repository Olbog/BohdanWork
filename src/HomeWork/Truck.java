package HomeWork;

class Truck extends Car{


    public Truck(String color, String lenght, int wheels, int maxCount){
        super(color, lenght, wheels,maxCount);
    }


    private String color = "Розовый";
    private String lenght = "9 m.";
    private int wheels = 24;
    private int maxCount = 4;


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



