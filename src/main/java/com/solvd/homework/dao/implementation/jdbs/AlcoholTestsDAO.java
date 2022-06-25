package com.solvd.homework.dao.implementation.jdbs;

import com.solvd.homework.connectionPool.HelpConnectionPool;
import com.solvd.homework.dao.interfaces.IAlcoholTestsDAO;

import java.sql.*;

import com.solvd.homework.dao.models.AlcoholTests;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class AlcoholTestsDAO extends HelpConnectionPool implements IAlcoholTestsDAO {

    public static final Logger LOGGER = LogManager.getLogger(AlcoholTestsDAO.class);
    private AlcoholTests alcoholTests = new AlcoholTests();
    static Connection connection = null;
    static PreparedStatement preparedStatement = null;
    static ResultSet resultSet = null;


    @Override
    public void getTable() throws SQLException {
        try {
            connection = getConnectionPool().makeConnection();
            preparedStatement = connection.prepareStatement("SELECT * from alcohol_tests");
            preparedStatement.execute();
            resultSet = preparedStatement.getResultSet();
            while (resultSet.next()) {
                alcoholTests.setId(resultSet.getInt("id"));
                alcoholTests.setResults(resultSet.getString("results"));
                alcoholTests.setDrivers_id(resultSet.getInt("drivers_id"));
                alcoholTests.setReplacement_driver_id(resultSet.getInt("replacement_driver_id"));
                LOGGER.info("All right with GET_Table for alcohol_tests");
                LOGGER.info(alcoholTests);
            }
        } catch (SQLException e) {
            LOGGER.info(e);
        } finally {
            getConnectionPool().returnConnection(connection);
            try {
                if (preparedStatement != null) preparedStatement.close();
                if (resultSet != null) resultSet.close();
            } catch (SQLException e){
                LOGGER.info(e);
            }
        }
    }


    @Override
    public Object getEntityById(long id) throws SQLException {
        try {
            connection = getConnectionPool().makeConnection();
            preparedStatement = connection.prepareStatement("SELECT * from alcohol_tests WHERE id = ?");
            preparedStatement.setLong(1, id);
            preparedStatement.execute();
            resultSet = preparedStatement.getResultSet();
            while (resultSet.next()) {
                alcoholTests.setId(resultSet.getInt("id"));
                alcoholTests.setResults(resultSet.getString("results"));
                alcoholTests.setDrivers_id(resultSet.getInt("drivers_id"));
                alcoholTests.setReplacement_driver_id(resultSet.getInt("replacement_driver_id"));
                LOGGER.info("All right with GET_Entity_By_Id for alcohol_tests");
                LOGGER.info(alcoholTests);
            }
        } catch (SQLException e) {
            LOGGER.info(e);
        } finally {
            getConnectionPool().returnConnection(connection);
            try {
                if (preparedStatement != null) preparedStatement.close();
                if (resultSet != null) resultSet.close();
            } catch (SQLException e){
                LOGGER.info(e);
            }
        } return alcoholTests;
    }

    @Override
    public void saveEntity(Object entity) throws SQLException {
        try {
            connection = getConnectionPool().makeConnection();
            preparedStatement = connection.prepareStatement("INSERT into alcohol_tests (results, drivers_id, replacement_driver_id) values (?, ?, ? ) ");
            preparedStatement.setString(1, "Positive");
            preparedStatement.setInt(2, 5);
            preparedStatement.setInt(3, 5);
            LOGGER.info("All right with SAVE_Entity for alcohol_tests");
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            LOGGER.info(e);
        } finally {
            getConnectionPool().returnConnection(connection);
            try {
                if (preparedStatement != null) preparedStatement.close();
            } catch (SQLException e) {
                LOGGER.info(e);
            }
        }
    }

    @Override
    public void updateEntity(Object entity) throws SQLException {
        try {
            connection = getConnectionPool().makeConnection();
            preparedStatement = connection.prepareStatement("UPDATE alcohol_tests set results = ?, drivers_id = ?, replacement_driver_id = ? where id = ? ");
            preparedStatement.setString(1, "So-So");
            preparedStatement.setInt(2, 6);
            preparedStatement.setInt(3, 5);
            preparedStatement.setInt(4, 3);
            preparedStatement.executeUpdate();
            LOGGER.info("All right with UPDATE_Entity for alcohol_tests");
        } catch (SQLException e){
            LOGGER.info(e);
        } finally {
            getConnectionPool().returnConnection(connection);
            try {
                if (preparedStatement != null) preparedStatement.close();
            } catch (SQLException e){
                LOGGER.info(e);
            }
        }

    }

    @Override
    public void removeEntity(long id) throws SQLException {
        try {
            connection = getConnectionPool().makeConnection();
            preparedStatement = connection.prepareStatement("DELETE FROM alcohol_tests WHERE id = ? LIMIT 1");
            preparedStatement.setInt(1, 3);
            preparedStatement.executeUpdate();
            LOGGER.info("All right with REMOVE_Entity for alcohol_tests");
        } catch (SQLException e){
            LOGGER.info(e);
        } finally {
            getConnectionPool().returnConnection(connection);
            try {
                if (preparedStatement != null) preparedStatement.close();
            } catch (SQLException e){
                LOGGER.info(e);
            }
        }
    }
}
