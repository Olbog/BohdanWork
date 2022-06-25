package com.solvd.homework.dao.implementation.jdbs;

import com.solvd.homework.connectionPool.HelpConnectionPool;
import com.solvd.homework.dao.interfaces.IDriverDAO;
import com.solvd.homework.dao.models.Driver;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DriverDAO extends HelpConnectionPool implements IDriverDAO {
    public static final Logger LOGGER = LogManager.getLogger(DriverDAO.class);
    private Driver forDriverDAO = new Driver();
    static Connection connection = null;
    static PreparedStatement preparedStatement = null;
    static ResultSet resultSet = null;

    @Override
    public Driver getEntityById(long id) throws SQLException {
        try {
            connection = getConnectionPool().makeConnection();
            preparedStatement = connection.prepareStatement("SELECT * from drivers WHERE id = ? ");
            preparedStatement.setLong(1, id);
            preparedStatement.execute();
            resultSet = preparedStatement.getResultSet();
            while (resultSet.next()) {
                forDriverDAO.setId(resultSet.getInt("id"));
                forDriverDAO.setAge(resultSet.getInt("age"));
                forDriverDAO.setName(resultSet.getString("name"));
                forDriverDAO.setEmail(resultSet.getString("e-mail"));
                LOGGER.info("All right with GET_Entity_By_Id for driver");
                LOGGER.info(forDriverDAO);
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
        return forDriverDAO;
    }

    @Override
    public void saveEntity(Driver entity) throws SQLException {
        try {
            connection = getConnectionPool().makeConnection();
            preparedStatement = connection.prepareStatement("INSERT into drivers (name, `e-mail`, age ) " +
                    "values ( ?,?,?)");
            preparedStatement.setString(1, "Olya");
            preparedStatement.setString(2, "Olya@mail.com");
            preparedStatement.setInt(3, 32);
            LOGGER.info("All right with SAVE_Entity for driver");
            preparedStatement.executeUpdate();
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
    public void updateEntity(Driver entity) throws SQLException {
        try {
            connection = getConnectionPool().makeConnection();
            preparedStatement = connection.prepareStatement("UPDATE drivers set name = ?, `e-mail` = ?, age = ? WHERE id = ?");
            preparedStatement.setString(1, "Ilya");
            preparedStatement.setString(2, "Ilya@mail.com");
            preparedStatement.setInt(3, 19);
            preparedStatement.setInt(4, 3);
            preparedStatement.executeUpdate();
            LOGGER.info("All right with UPDATE_Entity for driver");
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

//    @Override
//    public void saveEntity(Object entity) {
//        try {
//            connection = getConnectionPool().makeConnection();
//            preparedStatement = connection.prepareStatement("INSERT into drivers (name, `e-mail`, age ) " +
//                    "values ( ?,?,?)");
//            preparedStatement.setString(1, "Olya");
//            preparedStatement.setString(2, "Olya@mail.com");
//            preparedStatement.setInt(3, 32);
//            LOGGER.info("All right with SAVE_Entity for driver");
//            preparedStatement.executeUpdate();
//        } catch (SQLException e){
//            LOGGER.info(e);
//        } finally {
//            getConnectionPool().returnConnection(connection);
//            try {
//                if (preparedStatement != null) preparedStatement.close();
//            } catch (SQLException e){
//                LOGGER.info(e);
//            }
//        }
//
//    }

//    @Override
//    public void updateEntity(Object entity) {
//        try {
//            connection = getConnectionPool().makeConnection();
//            preparedStatement = connection.prepareStatement("UPDATE drivers set name = ?, `e-mail` = ?, age = ? WHERE id = ?");
//            preparedStatement.setString(1, "Ilya");
//            preparedStatement.setString(2, "Ilya@mail.com");
//            preparedStatement.setInt(3, 19);
//            preparedStatement.setInt(4, 3);
//            preparedStatement.executeUpdate();
//            LOGGER.info("All right with UPDATE_Entity for driver");
//        } catch (SQLException e){
//            LOGGER.info(e);
//        } finally {
//            getConnectionPool().returnConnection(connection);
//            try {
//                if (preparedStatement != null) preparedStatement.close();
//            } catch (SQLException e){
//                LOGGER.info(e);
//            }
//        }
//
//    }

    @Override
    public void removeEntity(long id) {
        try {
            connection = getConnectionPool().makeConnection();
            preparedStatement = connection.prepareStatement("DELETE FROM drivers WHERE id = ? LIMIT 1");
            preparedStatement.setInt(1, 3);
            preparedStatement.executeUpdate();
            LOGGER.info("All right with REMOVE_Entity for driver");
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
            preparedStatement = connection.prepareStatement("SELECT * from drivers");
            preparedStatement.execute();
            resultSet = preparedStatement.getResultSet();
            while (resultSet.next()) {
                forDriverDAO.setId(resultSet.getInt("id"));
                forDriverDAO.setAge(resultSet.getInt("age"));
                forDriverDAO.setName(resultSet.getString("name"));
                forDriverDAO.setEmail(resultSet.getString("e-mail"));
                LOGGER.info("All right with GET_Table for driver");
                LOGGER.info(forDriverDAO);
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
