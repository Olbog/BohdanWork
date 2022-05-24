package com.solvd.homework.dao.jdbsMySQLImpl;

import com.solvd.homework.Driver;
import com.solvd.homework.connectionPool.BasicConnectionPool;
import com.solvd.homework.dao.IDriverDAO;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

public class DriverDAO extends BasicConnectionPool implements IDriverDAO {
    public DriverDAO(String url, String user, String password, List<Connection> pool) {
        super(url, user, password, pool);
    }

    public static final Logger LOGGER = LogManager.getLogger(AlcoholTestsDAO.class);
    Driver driver = new Driver("man", "Nico", 23, "positive");
    Connection connection = null;
    PreparedStatement preparedStatement = null;
    ResultSet resultSet = null;

    @Override
    public Object getEntityById(long id) throws SQLException {

        try {
            connection = getConnection();
            preparedStatement = connection.prepareStatement("Select * from mydb.drivers where id = ?");
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
    public void saveEntity(Object entity) {
        try {
            connection = getConnection();
            PreparedStatement preparedStatement = connection.prepareStatement("Insert into mydb.drivers  ( name, 'e-mail', age) values (?, ?, ? ) ");
            preparedStatement.setString(1, "Alex");
            preparedStatement.setString(2, "alex@mail.com");
            preparedStatement.setInt(3, 32);
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void updateEntity(Object entity) {
        try {
            connection = getConnection();
            PreparedStatement preparedStatement = connection.prepareStatement("update mydb.drivers set name = ?, 'e-mail' = ?, age = ? where id = ? ");
            preparedStatement.setString(1, "Petya");
            preparedStatement.setString(2, "petya@mail.com");
            preparedStatement.setInt(3, 44);
            preparedStatement.setInt(4, 7);
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void removeEntity(long id) {
        try {
            connection = getConnection();
            PreparedStatement preparedStatement = connection.prepareStatement("DELETE FROM mydb.drivers WHERE ID = ? LIMIT 1");
            preparedStatement.setInt(1, 8);
            preparedStatement.execute();
        } catch (SQLException e) {
            e.printStackTrace();

        }
    }
}
