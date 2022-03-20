package homeWork;


class Passengers extends Runner {
    private int maxWeight; // maximum weight of passengers in tons
    private int count; // number of actual passengers



    public Passengers(int maxWeight, int count) {
        this.maxWeight = maxWeight;
        this.count = count;
    }



    public void setMaxWeight(int maxWeight) {
        this.maxWeight = maxWeight;
    }

    public int getMaxWeight() {
        return maxWeight;
    }

    public int setCount(int count) {
        this.count = count;
        return count;
    }

        public int getCount () {
            return count;
        }


    @Override
    public String toString() {
        return "Passengers{" +
                "maxWeight=" + maxWeight +
                ", count=" + count +
                '}';
    }
}




