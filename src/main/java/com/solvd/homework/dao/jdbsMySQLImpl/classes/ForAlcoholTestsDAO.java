package com.solvd.homework.dao.jdbsMySQLImpl.classes;

public class ForAlcoholTestsDAO {
    private int id;
    private String results;
    private int drivers_id;
    private int replacement_driver_id;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getResults() {
        return results;
    }

    public void setResults(String results) {
        this.results = results;
    }

    public int getDrivers_id() {
        return drivers_id;
    }

    public void setDrivers_id(int drivers_id) {
        this.drivers_id = drivers_id;
    }

    public int getReplacement_driver_id() {
        return replacement_driver_id;
    }

    public void setReplacement_driver_id(int replacement_driver_id) {
        this.replacement_driver_id = replacement_driver_id;
    }

    @Override
    public String toString() {
        return "ForAlcoholTestsDAO{" +
                "id=" + id +
                ", results='" + results + '\'' +
                ", drivers_id=" + drivers_id +
                ", replacement_driver_id=" + replacement_driver_id +
                '}';
    }
}
