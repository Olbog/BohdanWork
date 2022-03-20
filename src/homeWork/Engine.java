package homeWork;

public class Engine {
    private String go;
    private String stopIt;

    public Engine(String go, String stopIt) {
        this.go = go;
        this.stopIt = stopIt;
    }

    public String getGo() {
        return go;
    }

    public void setGo(String go) {
        this.go = go;
    }

    public String getStopIt() {
        return stopIt;
    }

    public void setStopIt(String stopIt) {
        this.stopIt = stopIt;
    }

    public void stop() {
        System.out.println(stopIt + "Engine stopped");
    }


    @Override
    public String toString() {
        return (go + " Engine is working!");
    }

}
