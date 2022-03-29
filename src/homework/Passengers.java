package homework;

import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;
import java.util.ArrayList;
import java.util.List;

class Passengers extends Runner {
    private int maxWeight; // maximum weight of passengers in tons
    private int count; // number of actual passengers



    public Passengers(int maxWeight, int count) {
        this.maxWeight = maxWeight;
        this.count = count;
    }
    private static final Logger LOGGER = LogManager.getLogger(Passengers.class);
    public static void partsForPessengers(){
        List<Passengers> parts = new ArrayList<>();

        Passengers part1 = new Passengers(1,3);
        Passengers part2 = new Passengers(1,1);
        Passengers part3 = new Passengers(1,5);

        parts.add(part1);
        parts.add(part2);
        parts.add(part3);

        Passengers passengers1FromCollection = parts.get(0);
        Passengers passengers2FromCollection = parts.get(1);
        Passengers passengers3FromCollection = parts.get(2);
        LOGGER.info(passengers1FromCollection);
        LOGGER.info(passengers2FromCollection);
        LOGGER.info(passengers3FromCollection);
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




