package HomeWork;

public class Engine {
    private String go;
    private String stopIt;

    public Engine() {
        this.go = go;
        this.stopIt = stopIt;
    }


    public void stop() {
        System.out.println(stopIt + "Двигатель остановлен");
    }


    @Override
    public String toString() {
        return (go + " Двигатель работает!");
    }

}
