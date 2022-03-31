package homework;

import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

class Passengers extends Runner {
    private int maxWeight; // maximum weight of passengers in tons
    private int count; // number of actual passengers



    public Passengers(int maxWeight, int count) {
        this.maxWeight = maxWeight;
        this.count = count;
    }
    private static final Logger LOGGER = LogManager.getLogger(Passengers.class);

    public static void partsForPassengers(){
        LinkedList<Passengers> parts = new LinkedList<>();

        Passengers part1 = new Passengers(1,3);
        Passengers part2 = new Passengers(1,1);
        Passengers part3 = new Passengers(1,5);

        parts.add(part1);
        parts.add(part2);
        parts.add(part3);

        LOGGER.info(parts.get(0));
        LOGGER.info(parts.get(1));
        LOGGER.info(parts.get(2));
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




