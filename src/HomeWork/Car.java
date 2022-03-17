package HomeWork;

class Car {

    public class Engine {
        private String go;
        private String stopIt;

        public Engine() {
            this.go = go;
            this.stopIt = stopIt;

        }

        public void start() {
            System.out.println(go + "Двигатель работает!");
        }


        public void stop() {
            System.out.println(stopIt + "Двигатель остановлен");
        }


        @Override
        public String toString() {
            return (go + " Двигатель работает!");
        }

    }


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

    public Car() {
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

    public void roadA() {
        System.out.println("Вы выехали из точки А");
    }

    public void roadB() {
        System.out.println("Вы приехали в точку Б");

    }


    @Override
    public String toString() {
        return (color + "\n"
                + lenght + "\n"
                + wheels + " wheels" + "\n"
                + maxCount + " maximum number of passengers" + "\n");
    }
}




