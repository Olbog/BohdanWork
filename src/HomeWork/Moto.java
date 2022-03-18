package HomeWork;

public class Moto extends Car{

    @Override
    public void gas(){
        System.out.println("Мотоцикл завелся!");
    }

    public Moto(String color, String lenght, int wheels, int maxCount){
        super(color, lenght, wheels,maxCount);
    }

    private String color = "Желтый";
    private String lenght = "1.5 m.";
    private int wheels = 2;
    private int maxCount = 2;


    @Override
    public String toString(){
        return ("мотоцикл: " + "\n" + color + "\n" +
                lenght + "\n"+
                wheels + "\n"+
                maxCount + "\n");
    }
}

