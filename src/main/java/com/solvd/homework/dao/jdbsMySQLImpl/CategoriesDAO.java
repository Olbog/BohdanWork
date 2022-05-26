package com.solvd.homework.dao.jdbsMySQLImpl;

import com.solvd.homework.Driver;

import com.solvd.homework.connectionPool.HelpConnectionPool;
import com.solvd.homework.dao.ICategoriesDAO;
import com.solvd.homework.dao.jdbsMySQLImpl.classes.ForAlcoholTestsDAO;
import com.solvd.homework.dao.jdbsMySQLImpl.classes.ForCategoriesDAO;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

public class CategoriesDAO extends HelpConnectionPool implements ICategoriesDAO {

    public static final Logger LOGGER = LogManager.getLogger(CategoriesDAO.class);
    private ForCategoriesDAO forCategoriesDAO = new ForCategoriesDAO();
    static Connection connection = null;
    static PreparedStatement preparedStatement = null;
    static ResultSet resultSet = null;


    @Override
    public Object getEntityById(long id) throws SQLException {
        try {
            connection = getConnectionPool().makeConnection();
            preparedStatement = connection.prepareStatement("SELECT * from categories WHERE id = ?");
            preparedStatement.setLong(1, id);
            preparedStatement.execute();
            resultSet = preparedStatement.getResultSet();
            while (resultSet.next()) {
                forCategoriesDAO.setId(resultSet.getInt("id"));
                forCategoriesDAO.setCategory(resultSet.getString("category"));
                forCategoriesDAO.setLicense_id(resultSet.getInt("license_id"));
                LOGGER.info("All right with GET_Entity_By_Id for categories");
                LOGGER.info(forCategoriesDAO);
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
        } return forCategoriesDAO;
    }

    @Override
    public void saveEntity(Object entity) throws SQLException {
        try {
            connection = getConnectionPool().makeConnection();
            preparedStatement = connection.prepareStatement("INSERT into categories ( category, license_id) values (?,?) ");
           preparedStatement.setString(1,"D");
            preparedStatement.setInt(1,4);
            LOGGER.info("All right with SAVE_Entity for categories");
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
            preparedStatement = connection.prepareStatement("UPDATE categories set category = ?, license_id = ? where id = ? ");
            preparedStatement.setString(1,"C");
            preparedStatement.setInt(2,5);
            preparedStatement.setInt(3, 3);
            preparedStatement.executeUpdate();
            LOGGER.info("All right with UPDATE_Entity for categories");
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
            preparedStatement = connection.prepareStatement("DELETE FROM categories WHERE id = ? LIMIT 1");
            preparedStatement.setInt(1, 3);
            preparedStatement.executeUpdate();
            LOGGER.info("All right with REMOVE_Entity for categories");
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
            preparedStatement = connection.prepareStatement("SELECT * from categories ");
            preparedStatement.execute();
            resultSet = preparedStatement.getResultSet();
            while (resultSet.next()) {
                forCategoriesDAO.setId(resultSet.getInt("id"));
                forCategoriesDAO.setCategory(resultSet.getString("category"));
                forCategoriesDAO.setLicense_id(resultSet.getInt("license_id"));
                LOGGER.info("All right with GET_Table for categories");
                LOGGER.info(forCategoriesDAO);
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

