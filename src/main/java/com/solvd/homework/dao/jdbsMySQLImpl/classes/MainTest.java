package com.solvd.homework.dao.jdbsMySQLImpl.classes;

import com.solvd.homework.dao.jdbsMySQLImpl.Tester;

import java.sql.SQLException;

public class MainTest extends Tester {
    public static void main(String[] args) throws SQLException {
        Tester runnerTest = new Tester();
        System.out.println(runnerTest.getEntityById(3));
    }
}
