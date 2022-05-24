package com.solvd.homework.dao.jdbsMySQLImpl;

import com.solvd.homework.connectionPool.BasicConnectionPool;
import com.solvd.homework.dao.IAlcoholTestsDAO;

import java.sql.*;
import java.util.List;

import com.solvd.homework.Driver;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class AlcoholTestsDAO extends BasicConnectionPool implements IAlcoholTestsDAO {

    public static final Logger LOGGER = LogManager.getLogger(AlcoholTestsDAO.class);
    Driver driver = new Driver("man", "Nico", 23, "positive");
    Connection connection = null;
    PreparedStatement preparedStatement = null;
    ResultSet resultSet = null;

//    private static Properties p = new Properties();
//    String url = p.getProperty("database.url");
//    String username = p.getProperty("database.username");
//    String password = p.getProperty("database.password");
//
//    static {
//        try (FileInputStream stream = new FileInputStream("src/main/resourses/database.properties")) {
//            p.load(stream);
//        } catch (IOException e) {
//            LOGGER.info(e);
//        }
//    }


    public AlcoholTestsDAO(String url, String user, String password, List<Connection> pool) {
        super(url, user, password, pool);
    }

    @Override
    public Object getEntityById(long id) throws SQLException {

        try {
            connection = getConnection();
            preparedStatement = connection.prepareStatement("Select * from mydb.alcohol_tests where id = ?");
            preparedStatement.setLong(1, 4);
            preparedStatement.execute();
            resultSet = preparedStatement.getResultSet();
            while (resultSet.next()) {
                driver.setAlcoTests(resultSet.getString("results"));
            }
        } catch (SQLException e) {
            LOGGER.info(e);
        } finally {
            connection.close();
            resultSet.close();
            preparedStatement.close();
        }
        return driver;
    }

    @Override
    public void saveEntity(Object entity) throws SQLException {
        try {
            connection = getConnection();
            PreparedStatement preparedStatement = connection.prepareStatement("Insert into mydb.alcohol_tests  ( results, drivers_id, replacement_driver_id) values (?, ?, ? ) ");
            preparedStatement.setString(1, "Positive");
            preparedStatement.setInt(2, 5);
            preparedStatement.setInt(3, 5);
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            connection.close();
            resultSet.close();
            preparedStatement.close();
        }
    }

    @Override
    public void updateEntity(Object entity) throws SQLException {
        try {
            connection = getConnection();
            PreparedStatement preparedStatement = connection.prepareStatement("update mydb.alcohol_tests set results = ?, drivers_id = ?, replacement_driver_id = ? where id = ? ");
            preparedStatement.setString(1, "So-So");
            preparedStatement.setInt(2, 6);
            preparedStatement.setInt(3, 5);
            preparedStatement.setInt(4, 3);
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            LOGGER.info(e);
        }finally {
            connection.close();
            resultSet.close();
            preparedStatement.close();
        }
    }

    @Override
    public void removeEntity(long id) throws SQLException {
        try {
            connection = getConnection();
            PreparedStatement preparedStatement = connection.prepareStatement("DELETE FROM mydb.alcohol_tests WHERE ID = ? LIMIT 1");
            preparedStatement.setInt(1, 5);
            preparedStatement.execute();
        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            connection.close();
            resultSet.close();
            preparedStatement.close();
        }
    }
}
