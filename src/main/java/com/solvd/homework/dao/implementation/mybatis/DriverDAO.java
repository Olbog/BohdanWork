package com.solvd.homework.dao.implementation.mybatis;

import com.solvd.homework.dao.interfaces.IDriverDAO;
import com.solvd.homework.dao.models.Driver;
import org.apache.ibatis.session.SqlSession;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.sql.SQLException;

public class DriverDAO implements IDriverDAO {
    private static final Logger LOGGER = LogManager.getLogger(DriverDAO.class);

    @Override
    public Driver getEntityById(long id) throws SQLException {
        try (SqlSession sqlSession = MyBatisSetting.getSqlSessionFactory().openSession()){
            IDriverDAO driverDAO = sqlSession.getMapper(IDriverDAO.class);
            LOGGER.info("driver is here by getEntityById");
            return driverDAO.getEntityById(id);
        }
    }

    @Override
    public void saveEntity(Driver entity) throws SQLException {
        try (SqlSession sqlSession = MyBatisSetting.getSqlSessionFactory().openSession()){
            IDriverDAO driverDAO = sqlSession.getMapper(IDriverDAO.class);
            sqlSession.insert("saveEntity", entity);
            LOGGER.info("new driver is here by saveEntity");
            sqlSession.commit();
        }

    }

    @Override
    public void updateEntity(Driver entity) throws SQLException {
        try (SqlSession sqlSession = MyBatisSetting.getSqlSessionFactory().openSession()) {
            IDriverDAO driverDAO = sqlSession.getMapper(IDriverDAO.class);
            sqlSession.update("updateEntity", entity);
            LOGGER.info("old driver has left, but new has come by updateEntity");
            sqlSession.commit();
        }

    }

    @Override
    public void removeEntity(long id) throws SQLException {
        try (SqlSession sqlSession = MyBatisSetting.getSqlSessionFactory().openSession()) {
            IDriverDAO driverDAO = sqlSession.getMapper(IDriverDAO.class);
            LOGGER.info("minus one driver by removeEntity");
            sqlSession.delete("removeEntity", id);
            sqlSession.commit();
        }

    }

    @Override
    public void getTable() throws SQLException {

    }
}
