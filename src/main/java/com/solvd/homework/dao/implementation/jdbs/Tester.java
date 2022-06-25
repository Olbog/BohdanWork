package com.solvd.homework.dao.implementation.jdbs;

import com.solvd.homework.connectionPool.HelpConnectionPool;
import com.solvd.homework.dao.interfaces.IBaseDAO;
import com.solvd.homework.dao.models.ForRunnerTest;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.sql.*;

public class Tester extends HelpConnectionPool implements IBaseDAO {

    public static final Logger LOGGER = LogManager.getLogger(Tester.class);
    private ForRunnerTest r = new ForRunnerTest();
    static Connection connection = null;
    static PreparedStatement preparedStatement = null;
    static ResultSet resultSet = null;



    @Override
    public Object getEntityById(long id) throws SQLException {
        try {
            connection = getConnectionPool().makeConnection();
            preparedStatement = connection.prepareStatement("SELECT * from drivers WHERE id = ? ");
            preparedStatement.setLong(1, id);
            preparedStatement.execute();
            resultSet = preparedStatement.getResultSet();
            while (resultSet.next()) {
                r.setId(resultSet.getInt("id"));
                r.setAge(resultSet.getInt("age"));
                r.setName(resultSet.getString("name"));
                r.setEmail(resultSet.getString("e-mail"));
                LOGGER.info("All right with GET_Entity_By_Id for driver");
                LOGGER.info(r);
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
        return r;
    }

    @Override
    public void saveEntity(Object entity) throws SQLException {
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
    public void updateEntity(Object entity) throws SQLException {
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

    @Override
    public void removeEntity(long id) throws SQLException {
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
}


