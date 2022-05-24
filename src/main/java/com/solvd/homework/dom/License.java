package com.solvd.homework.dom;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;

@XmlType(propOrder = {"date"})
public class License {
    private int date;

    public int getDate() {
        return date;
    }

    @XmlElement
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
