package com.solvd.homework.dao.implementation.mybatis;


import com.solvd.homework.dao.interfaces.ICarServicesDAO;
import org.apache.ibatis.session.SqlSession;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.sql.SQLException;

public class CarServicesDAO implements ICarServicesDAO {

    private static final Logger LOGGER = LogManager.getLogger(CarServicesDAO.class);

    @Override
    public Object getEntityById(long id) throws SQLException {
        try (SqlSession sqlSession = MyBatisSetting.getSqlSessionFactory().openSession()){
            ICarServicesDAO carServicesDAO = sqlSession.getMapper(ICarServicesDAO.class);
            LOGGER.info("carServices is here by getEntityById");
            return carServicesDAO.getEntityById(id);
        }
    }

    @Override
    public void saveEntity(Object entity) throws SQLException {
        try (SqlSession sqlSession = MyBatisSetting.getSqlSessionFactory().openSession()){
            ICarServicesDAO carServicesDAO = sqlSession.getMapper(ICarServicesDAO.class);
            sqlSession.insert("saveEntity", entity);
            LOGGER.info("new carServices is here by saveEntity");
            sqlSession.commit();
        }
    }

    @Override
    public void updateEntity(Object entity) throws SQLException {
        try (SqlSession sqlSession = MyBatisSetting.getSqlSessionFactory().openSession()) {
            ICarServicesDAO carServicesDAO = sqlSession.getMapper(ICarServicesDAO.class);
            sqlSession.update("updateEntity", entity);
            LOGGER.info("old carServices has left, but new has come by updateEntity");
            sqlSession.commit();
        }
    }

    @Override
    public void removeEntity(long id) throws SQLException {
        try (SqlSession sqlSession = MyBatisSetting.getSqlSessionFactory().openSession()) {
            ICarServicesDAO carServicesDAO = sqlSession.getMapper(ICarServicesDAO.class);
            LOGGER.info("minus one carServices by removeEntity");
            sqlSession.delete("removeEntity", id);
            sqlSession.commit();
        }
    }

    @Override
    public void getTable() throws SQLException {

    }
}
