package com.solvd.homework.dao.models;

public class Distributors {
    private int id;
    private int Replacement_drivers_id;
    private int Park_Cars_id;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getReplacement_drivers_id() {
        return Replacement_drivers_id;
    }

    public void setReplacement_drivers_id(int replacement_drivers_id) {
        Replacement_drivers_id = replacement_drivers_id;
    }

    public int getPark_Cars_id() {
        return Park_Cars_id;
    }

    public void setPark_Cars_id(int park_Cars_id) {
        Park_Cars_id = park_Cars_id;
    }

    @Override
    public String toString() {
        return "ForDistributorsDAO{" +
                "id=" + id +
                ", Replacement_drivers_id=" + Replacement_drivers_id +
                ", Park_Cars_id=" + Park_Cars_id +
                '}';
    }
}
