package com.solvd.homework.connectionPool;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ConnectionAllPool {
    private static final Logger LOGGER = LogManager.getLogger(ConnectionAllPool.class);
    private static ConnectionAllPool connectionPool;
    private int conAmount = 0;
    private int maxAmount = 10;
    private static final List<Connection> connectionList = Collections.synchronizedList(new ArrayList<>());

    private ConnectionAllPool() {
    }

    public static synchronized ConnectionAllPool newInstance() {
        if (connectionPool == null) {
            LOGGER.info("the Connection Pool exists");
            connectionPool = new ConnectionAllPool();
        }
        return connectionPool;
    }

    public synchronized Connection makeConnection() {
        if (!connectionList.isEmpty()) {
            return connectionList.remove(0);
        } else if (conAmount < maxAmount) {
            try {
                conAmount++;
                return DriverManager.getConnection("jdbc:mysql://localhost:3306/mydb", "root", "aNNa360104a");
            } catch (SQLException throwable) {
                conAmount--;
                LOGGER.info(throwable);
            }
        }
        return null;
    }

    public synchronized void returnConnection(Connection connection) {
        if (connection != null) connectionList.add(connection);
        LOGGER.info("The connection in the pool again");
    }
}

//    private static Properties p = new Properties();
//    static String url = p.getProperty("database.url");
//    static String username = p.getProperty("database.username");
//    static String password = p.getProperty("database.password");
