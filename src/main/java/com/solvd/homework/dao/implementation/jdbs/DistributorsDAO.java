package com.solvd.homework.dao.implementation.jdbs;

import com.solvd.homework.connectionPool.HelpConnectionPool;
import com.solvd.homework.dao.interfaces.IDistributorsDAO;
import com.solvd.homework.dao.models.Distributors;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DistributorsDAO extends HelpConnectionPool implements IDistributorsDAO {

    public static final Logger LOGGER = LogManager.getLogger(AlcoholTestsDAO.class);
    private Distributors distributors = new Distributors();
    static Connection connection = null;
    static PreparedStatement preparedStatement = null;
    static ResultSet resultSet = null;

    @Override
    public Object getEntityById(long id) throws SQLException {
        try {
            connection = getConnectionPool().makeConnection();
            preparedStatement = connection.prepareStatement("SELECT * from distributors WHERE id = ?");
            preparedStatement.setLong(1, id);
            preparedStatement.execute();
            resultSet = preparedStatement.getResultSet();
            while (resultSet.next()) {
                distributors.setId(resultSet.getInt("id"));
                distributors.setPark_Cars_id(resultSet.getInt("Park_Cars_id"));
                distributors.setReplacement_drivers_id(resultSet.getInt("Replacement_drivers_id"));
                LOGGER.info("All right with GET_Entity_By_Id for distributors");
                LOGGER.info(distributors);
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
        } return distributors;
    }

    @Override
    public void saveEntity(Object entity) throws SQLException {
        try {
            connection = getConnectionPool().makeConnection();
            preparedStatement = connection.prepareStatement("INSERT into distributors ( Replacement_drivers_id, Park_Cars_id) values (?, ? ) ");
            preparedStatement.setInt(1, 2);
            preparedStatement.setInt(2, 4);
            LOGGER.info("All right with SAVE_Entity for distributors");
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
            preparedStatement = connection.prepareStatement("UPDATE distributors set Replacement_drivers_id = ? , Park_Cars_id = ? where id = ? ");
            preparedStatement.setInt(1, 4);
            preparedStatement.setInt(2, 4);
            preparedStatement.setInt(3, 2);
            preparedStatement.executeUpdate();
            LOGGER.info("All right with UPDATE_Entity for distributors");
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
            preparedStatement = connection.prepareStatement("DELETE FROM distributors WHERE id = ? LIMIT 1");
            preparedStatement.setInt(1, 3);
            preparedStatement.executeUpdate();
            LOGGER.info("All right with REMOVE_Entity for distributors");
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
    public void getTable() throws SQLException {
        try {
            connection = getConnectionPool().makeConnection();
            preparedStatement = connection.prepareStatement("SELECT * from distributors");
            preparedStatement.execute();
            resultSet = preparedStatement.getResultSet();
            while (resultSet.next()) {
                distributors.setId(resultSet.getInt("id"));
                distributors.setPark_Cars_id(resultSet.getInt("Park_Cars_id"));
                distributors.setReplacement_drivers_id(resultSet.getInt("Replacement_drivers_id"));
                LOGGER.info("All right with GET_Table for distributors");
                LOGGER.info(distributors);
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
}
