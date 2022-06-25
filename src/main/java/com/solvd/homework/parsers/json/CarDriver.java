package com.solvd.homework.parsers.json;

import jakarta.xml.bind.annotation.XmlType;

import java.text.SimpleDateFormat;
import java.util.Objects;

@XmlType(propOrder = {"name", "surname", "birthday"})
public class CarDriver {
    private static final SimpleDateFormat formatter = new SimpleDateFormat("dd/mm/yyyy");
    private String name;
    private String surname;
    private String birthday;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    @Override
    public String toString() {
        return "CarDriver{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", birthday=" + formatter.format(birthday) +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof CarDriver)) return false;
        CarDriver carDriver = (CarDriver) o;
        return Objects.equals(name, carDriver.name) && Objects.equals(surname, carDriver.surname) && Objects.equals(birthday, carDriver.birthday);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, surname, birthday);
    }

}
