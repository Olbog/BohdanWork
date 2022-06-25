package com.solvd.homework.dao.models;

import com.solvd.homework.dao.implementation.jdbs.Tester;

import java.sql.SQLException;

public class MainTest extends Tester {
    public static void main(String[] args) throws SQLException {
        Tester runnerTest = new Tester();
        System.out.println(runnerTest.getEntityById(3));
    }
}
