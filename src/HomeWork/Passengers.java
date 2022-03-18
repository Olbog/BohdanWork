package HomeWork;


class Passengers extends Vehicles {
    private int maxWeight; // максимальный вес пассажиров в тоннах
    private int count; // количество фактических пассажиров



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
        public String toString () {
            return (this.maxWeight + " maximum load" + "\n"
                    + this.count + " passengers in the car now" + "\n");
        }
    }




