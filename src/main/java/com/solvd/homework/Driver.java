package com.solvd.homework;

public class Driver {
    private String gender;
    private String name;
    private int age;
    private String alcoTests;

    public Driver(String gender, String name, int age, String alcoTests) {
        this.gender = gender;
        this.name = name;
        this.age = age;
        this.alcoTests = alcoTests;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAlcoTests() {
        return alcoTests;
    }

    public void setAlcoTests(String gender) {
        this.alcoTests = alcoTests;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age)throws AgeException {
        if (age < 18) {
            throw new AgeException("You're too young for this transport");
        } else {
            this.age = age;
        }
    }

    @Override
    public String toString() {
        return "Driver{" +
                "gender='" + gender + '\'' +
                ", name='" + name + '\'' +
                ", alcoTests='" + alcoTests + '\'' +
                ", age=" + age +
                '}';
    }
}
