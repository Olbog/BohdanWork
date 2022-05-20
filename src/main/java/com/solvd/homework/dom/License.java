package com.solvd.homework.dom;

public class License {
    private int date;

    public int getDate() {
        return date;
    }

    public void setDate(int date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "License{" +
                "date=" + date +
                '}';
    }
}
