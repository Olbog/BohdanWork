package com.solvd.homework.dao.implementation.jdbs;

import com.solvd.homework.connectionPool.HelpConnectionPool;
import com.solvd.homework.dao.interfaces.ICarServicesDAO;
import com.solvd.homework.dao.models.CarServices;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class CarServicesDAO extends HelpConnectionPool implements ICarServicesDAO {

    public static final Logger LOGGER = LogManager.getLogger(CarServicesDAO.class);
    private CarServices carServices = new CarServices();
    static Connection connection = null;
    static PreparedStatement preparedStatement = null;
    static ResultSet resultSet = null;

    @Override
    public Object getEntityById(long id) throws SQLException {
        try{
        connection = getConnectionPool().makeConnection();
        preparedStatement = connection.prepareStatement("SELECT * from car_services WHERE id = ?");
        preparedStatement.setLong(1, id);
        preparedStatement.execute();
        resultSet = preparedStatement.getResultSet();
        while (resultSet.next()) {
            carServices.setId(resultSet.getInt("id"));
            carServices.setStatus(resultSet.getString("status"));
            LOGGER.info("All right with GET_Entity_By_Id for car_services");
            LOGGER.info(carServices);
        }
    } catch(SQLException e){
        LOGGER.info(e);
    } finally{
        getConnectionPool().returnConnection(connection);
        try {
            if (preparedStatement != null) preparedStatement.close();
            if (resultSet != null) resultSet.close();
        } catch (SQLException e) {
            LOGGER.info(e);
        }
    } return carServices;
}

    @Override
    public void saveEntity(Object entity) throws SQLException {
        try {
            connection = getConnectionPool().makeConnection();
            preparedStatement = connection.prepareStatement("INSERT into car_services ( status) values (?) ");
            preparedStatement.setString(1,"Done!");
            LOGGER.info("All right with SAVE_Entity for car_services");
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
            preparedStatement = connection.prepareStatement("UPDATE car_services set status = ? where id = ? ");
            preparedStatement.setString(1, "in progress");
            preparedStatement.setInt(2, 6);
            preparedStatement.executeUpdate();
            LOGGER.info("All right with UPDATE_Entity for car_services");
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
            preparedStatement = connection.prepareStatement("DELETE FROM car_services WHERE id = ? LIMIT 1");
            preparedStatement.setInt(1, 3);
            preparedStatement.executeUpdate();
            LOGGER.info("All right with REMOVE_Entity for car_services");
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
        try{
            connection = getConnectionPool().makeConnection();
            preparedStatement = connection.prepareStatement("SELECT * from car_services ");
            preparedStatement.execute();
            resultSet = preparedStatement.getResultSet();
            while (resultSet.next()) {
                carServices.setId(resultSet.getInt("id"));
                carServices.setStatus(resultSet.getString("status"));
                LOGGER.info("All right with GET_Table for car_services");
                LOGGER.info(carServices);
            }
        } catch(SQLException e){
            LOGGER.info(e);
        } finally{
            getConnectionPool().returnConnection(connection);
            try {
                if (preparedStatement != null) preparedStatement.close();
                if (resultSet != null) resultSet.close();
            } catch (SQLException e) {
                LOGGER.info(e);
            }
        }

    }
}
