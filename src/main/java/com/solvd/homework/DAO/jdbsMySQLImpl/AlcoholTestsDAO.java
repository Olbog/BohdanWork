package com.solvd.homework.DAO.jdbsMySQLImpl;

import com.solvd.homework.DAO.IAlcoholTestsDAO;

import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Properties;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class AlcoholTestsDAO implements IAlcoholTestsDAO {


    public static final Logger LOGGER = LogManager.getLogger(AlcoholTestsDAO.class);
    private static Properties p = new Properties();

    String url = p.getProperty("database.url");
    String username = p.getProperty("database.username");
    String password = p.getProperty("database.password");

    static {
        try (FileInputStream stream = new FileInputStream("src/main/resourses/database.properties")){
            p.load(stream);
        } catch (IOException e){
            LOGGER.info(e);
        }
    }


    @Override
    public Object getEntityById(long id) throws SQLException {
        Connection con = DriverManager.getConnection(url, username, password);
        PreparedStatement preparedStatement = con.prepareStatement("Insert into Alcohol_Tests  ( results, drivers_id, replacement_driver_id) values (?, ?, ? ) ");
        preparedStatement.setString(1, "Positive");
        preparedStatement.setInt(2, 5);
        preparedStatement.setInt(3, 5);
        preparedStatement.executeUpdate();
        return null;
    }

    @Override
    public void saveEntity(Object entity) {

    }

    @Override
    public void updateEntity(Object entity) {

    }

    @Override
    public void removeEntity(long id) {

    }
}
