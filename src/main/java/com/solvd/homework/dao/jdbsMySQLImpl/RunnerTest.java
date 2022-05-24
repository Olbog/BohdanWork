package com.solvd.homework.dao.jdbsMySQLImpl;

import com.solvd.homework.Driver;
import java.sql.*;
import java.util.Properties;

public class RunnerTest {

    private static Properties p = new Properties();
    static String url = p.getProperty("database.url");
    static String username = p.getProperty("database.username");
    static String password = p.getProperty("database.password");

    public static void main(String[] args) throws SQLException {
        removeEntity();
    }

    private static void insertAlcohol_tests() throws SQLException {
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/mysql", "root", "aNNa360104a");
        PreparedStatement preparedStatement = con.prepareStatement("Insert into mydb.alcohol_tests  ( results, drivers_id, replacement_driver_id) values (?, ?, ? ) ");
        preparedStatement.setString(1, "Positive");
        preparedStatement.setInt(2, 5);
        preparedStatement.setInt(3, 5);
        preparedStatement.executeUpdate();
    }

    private static Driver getEntityById(long id) throws SQLException {
        Driver driver = new Driver("man", "Nico", 23,"positive");
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
        } catch (SQLException e){
            e.printStackTrace();
        }finally {
            connection.close();
            resultSet.close();
            preparedStatement.close();
        } return driver;
    }

    private static void updateEntity() throws SQLException {
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/mysql", "root", "aNNa360104a");
        PreparedStatement preparedStatement = con.prepareStatement("update mydb.licenses  set number = ?, exp_data = ?, driver_id = ? where id = ? ");
        preparedStatement.setString(1, "111111");
        preparedStatement.setString(2, "2029");
        preparedStatement.setInt(3, 5);
        preparedStatement.setInt(4, 3);
        preparedStatement.executeUpdate();
    }

    private static void removeEntity() throws SQLException {
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/mysql", "root", "aNNa360104a");
        PreparedStatement preparedStatement = con.prepareStatement("DELETE FROM mydb.car_services WHERE ID = ? LIMIT 1");
        preparedStatement.setInt(1, 6);
        preparedStatement.execute();
    }

}
