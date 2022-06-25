package com.solvd.homework.dao.implementation.mybatis;

import com.solvd.homework.dao.interfaces.IAlcoholTestsDAO;
import org.apache.ibatis.session.SqlSession;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.sql.SQLException;

public class AlcoholTestsDAO implements IAlcoholTestsDAO {
    private static final Logger LOGGER = LogManager.getLogger(AlcoholTestsDAO.class);



    @Override
    public Object getEntityById(long id) throws SQLException {
        try (SqlSession sqlSession = MyBatisSetting.getSqlSessionFactory().openSession()){
            IAlcoholTestsDAO alcoholTestsDAO = sqlSession.getMapper(IAlcoholTestsDAO.class);
            LOGGER.info("alcoholTests is here by getEntityById");
            return alcoholTestsDAO.getEntityById(id);
        }
    }

    @Override
    public void saveEntity(Object entity) throws SQLException {
        try (SqlSession sqlSession = MyBatisSetting.getSqlSessionFactory().openSession()){
            IAlcoholTestsDAO alcoholTestsDAO = sqlSession.getMapper(IAlcoholTestsDAO.class);
            sqlSession.insert("saveEntity", entity);
            LOGGER.info("new alcoholTests is here by saveEntity");
            sqlSession.commit();
        }
    }

    @Override
    public void updateEntity(Object entity) throws SQLException {
        try (SqlSession sqlSession = MyBatisSetting.getSqlSessionFactory().openSession()) {
            IAlcoholTestsDAO alcoholTestsDAO = sqlSession.getMapper(IAlcoholTestsDAO.class);
            sqlSession.update("updateEntity", entity);
            LOGGER.info("old alcoholTests has left, but new has come by updateEntity");
            sqlSession.commit();
        }
    }

    @Override
    public void removeEntity(long id) throws SQLException {
        try (SqlSession sqlSession = MyBatisSetting.getSqlSessionFactory().openSession()) {
            IAlcoholTestsDAO alcoholTestsDAO = sqlSession.getMapper(IAlcoholTestsDAO.class);
            LOGGER.info("minus one alcoholTests by removeEntity");
            sqlSession.delete("removeEntity", id);
            sqlSession.commit();
        }

    }

    @Override
    public void getTable() throws SQLException {

    }
}
