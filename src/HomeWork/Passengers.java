package HomeWork;

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
    public String toString() {
        return (maxWeight + " maximum load" + "\n"
                + count + " passengers in the car now" + "\n");
    }
}
