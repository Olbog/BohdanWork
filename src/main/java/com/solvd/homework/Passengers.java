package com.solvd.homework;

import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;

import java.util.LinkedList;

class Passengers extends Runner {
    private static final Logger LOGGER = LogManager.getLogger(Passengers.class);

    private int maxWeight; // maximum weight of passengers in tons
    private int count; // number of actual passengers

    public Passengers(int maxWeight, int count) {
        this.maxWeight = maxWeight;
        this.count = count;
    }

    public static void partsForPassengers(){
        LinkedList<Passengers> parts = new LinkedList<>();

        Passengers part1 = new Passengers(1,3);
        Passengers part2 = new Passengers(1,1);
        Passengers part3 = new Passengers(1,5);

        parts.add(part1);
        parts.add(part2);
        parts.add(part3);
        parts.stream().forEach(LOGGER::info);

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




