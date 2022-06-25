package com.solvd.homework.dao.implementation.mybatis;

import com.solvd.homework.dao.interfaces.IDistributorsDAO;
import org.apache.ibatis.session.SqlSession;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.sql.SQLException;

public class DistributorsDAO implements IDistributorsDAO {

    private static final Logger LOGGER = LogManager.getLogger(DistributorsDAO.class);

    @Override
    public Object getEntityById(long id) throws SQLException {
        try (SqlSession sqlSession = MyBatisSetting.getSqlSessionFactory().openSession()){
            IDistributorsDAO distributorsDAO = sqlSession.getMapper(IDistributorsDAO.class);
            LOGGER.info("distributors is here by getEntityById");
            return distributorsDAO.getEntityById(id);
        }
    }

    @Override
    public void saveEntity(Object entity) throws SQLException {
        try (SqlSession sqlSession = MyBatisSetting.getSqlSessionFactory().openSession()){
            IDistributorsDAO distributorsDAO = sqlSession.getMapper(IDistributorsDAO.class);
            sqlSession.insert("saveEntity", entity);
            LOGGER.info("new distributors is here by saveEntity");
            sqlSession.commit();
        }
    }

    @Override
    public void updateEntity(Object entity) throws SQLException {
        try (SqlSession sqlSession = MyBatisSetting.getSqlSessionFactory().openSession()) {
            IDistributorsDAO distributorsDAO = sqlSession.getMapper(IDistributorsDAO.class);
            sqlSession.update("updateEntity", entity);
            LOGGER.info("old distributors has left, but new has come by updateEntity");
            sqlSession.commit();
        }
    }

    @Override
    public void removeEntity(long id) throws SQLException {
        try (SqlSession sqlSession = MyBatisSetting.getSqlSessionFactory().openSession()) {
            IDistributorsDAO distributorsDAO = sqlSession.getMapper(IDistributorsDAO.class);
            LOGGER.info("minus one distributors by removeEntity");
            sqlSession.delete("removeEntity", id);
            sqlSession.commit();
        }
    }

    @Override
    public void getTable() throws SQLException {

    }
}
