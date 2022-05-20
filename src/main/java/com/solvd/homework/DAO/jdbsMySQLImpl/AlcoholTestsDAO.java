package com.solvd.homework.DAO.jdbsMySQLImpl;

import com.solvd.homework.DAO.IAlcoholTestsDAO;

import java.io.FileInputStream;
import java.io.IOException;
import java.sql.*;
import java.util.Properties;

import com.solvd.homework.Driver;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class AlcoholTestsDAO implements IAlcoholTestsDAO {

    public static final Logger LOGGER = LogManager.getLogger(AlcoholTestsDAO.class);

    private static Properties p = new Properties();
    String url = p.getProperty("database.url");
    String username = p.getProperty("database.username");
    String password = p.getProperty("database.password");

    static {
        try (FileInputStream stream = new FileInputStream("src/main/resourses/database.properties")) {
            p.load(stream);
        } catch (IOException e) {
            LOGGER.info(e);
        }
    }

    @Override
    public Object getEntityById(long id) throws SQLException {
        Driver driver = new Driver("man", "Nico", 23, "positive");
        Connection connection = null;
        PreparedStatement preparedStatement = null;
        ResultSet resultSet = null;
        try {
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/mysql", "root", "aNNa360104a");
            preparedStatement = connection.prepareStatement("Select * from mydb.alcohol_tests where id = ?");
            preparedStatement.setLong(1, id);
            preparedStatement.execute();
            resultSet = preparedStatement.getResultSet();
            while (resultSet.next()) {
                driver.setAlcoTests(resultSet.getString("results"));
                System.out.println(resultSet.getString("results"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            connection.close();
            resultSet.close();
            preparedStatement.close();
        }
        return driver;
    }

    @Override
    public void saveEntity(Object entity) {
        try {
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/mysql", "root", "aNNa360104a");
            PreparedStatement preparedStatement = con.prepareStatement("Insert into mydb.alcohol_tests  ( results, drivers_id, replacement_driver_id) values (?, ?, ? ) ");
            preparedStatement.setString(1, "Positive");
            preparedStatement.setInt(2, 5);
            preparedStatement.setInt(3, 5);
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void updateEntity(Object entity) {
        try {
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/mysql", "root", "aNNa360104a");
            PreparedStatement preparedStatement = con.prepareStatement("update mydb.alcohol_tests set results = ?, drivers_id = ?, replacement_driver_id = ? where id = ? ");
            preparedStatement.setString(1, "So - So");
            preparedStatement.setInt(2, 6);
            preparedStatement.setInt(3, 5);
            preparedStatement.setInt(4, 3);
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void removeEntity(long id) {
        try {
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/mysql", "root", "aNNa360104a");
            PreparedStatement preparedStatement = con.prepareStatement("DELETE FROM mydb.alcohol_tests WHERE ID = ? LIMIT 1");
            preparedStatement.setInt(1, 5);
            preparedStatement.execute();
        } catch (SQLException e) {
            e.printStackTrace();

        }
    }
}
