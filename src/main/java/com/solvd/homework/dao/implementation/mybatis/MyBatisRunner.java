package com.solvd.homework.dao.implementation.mybatis;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.sql.SQLException;

public class MyBatisRunner {
    private static final Logger LOGGER = LogManager.getLogger(MyBatisRunner.class);

    public static void main(String[] args) throws SQLException {
    DriverDAO driverDAO = new DriverDAO();
    driverDAO.getEntityById(1);
    }
}
