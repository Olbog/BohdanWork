package HomeWork;

class Sedan extends Car{

    @Override
    public void gas(){
        System.out.println("Седан завелся!");
    }

    public Sedan(String color, String lenght, int wheels, int maxCount){
        super(color, lenght, wheels,maxCount);
    }

    private String color = "Фиолетовый";
    private String lenght = "2.5 m.";
    private int wheels = 4;
    private int maxCount = 5;


    @Override
    public String toString(){
        return (color + "\n" +
                lenght + "\n"+
                wheels + "\n"+
                maxCount + "\n");
    }
}
