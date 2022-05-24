package com.solvd.homework.dao.jdbsMySQLImpl;

import com.solvd.homework.Driver;
import com.solvd.homework.connectionPool.BasicConnectionPool;
import com.solvd.homework.dao.IDistributorsDAO;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

public class DistributorsDAO extends BasicConnectionPool implements IDistributorsDAO {
    public DistributorsDAO(String url, String user, String password, List<Connection> pool) {
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
            preparedStatement = connection.prepareStatement("Select * from mydb.distributors where id = ?");
            preparedStatement.setLong(1, 3);
            preparedStatement.execute();
            resultSet = preparedStatement.getResultSet();
            while (resultSet.next()) {
                driver.setAlcoTests(resultSet.getString("results"));
                System.out.println(resultSet.getString("results"));
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
            PreparedStatement preparedStatement = connection.prepareStatement("Insert into mydb.distributors  ( Replacement_drivers_id, Park_Cars_id) values (?, ? ) ");
            preparedStatement.setInt(1, 2);
            preparedStatement.setInt(2, 4);
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void updateEntity(Object entity) {
        try {
            connection = getConnection();
            PreparedStatement preparedStatement = connection.prepareStatement("update mydb.distributors set Replacement_drivers_id = ? , Park_Cars_id = ? where id = ? ");
            preparedStatement.setInt(1, 4);
            preparedStatement.setInt(2, 4);
            preparedStatement.setInt(3, 2);
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void removeEntity(long id) {
        try {
            connection = getConnection();
            PreparedStatement preparedStatement = connection.prepareStatement("DELETE FROM mydb.distributors WHERE ID = ? LIMIT 1");
            preparedStatement.setInt(1, 3);
            preparedStatement.execute();
        } catch (SQLException e) {
            e.printStackTrace();

        }
    }
}
