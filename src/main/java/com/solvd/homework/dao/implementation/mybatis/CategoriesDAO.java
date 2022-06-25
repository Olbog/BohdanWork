package com.solvd.homework.dao.implementation.mybatis;


import com.solvd.homework.dao.interfaces.ICategoriesDAO;
import org.apache.ibatis.session.SqlSession;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.sql.SQLException;

public class CategoriesDAO implements ICategoriesDAO {

    private static final Logger LOGGER = LogManager.getLogger(CategoriesDAO.class);

    @Override
    public Object getEntityById(long id) throws SQLException {
        try (SqlSession sqlSession = MyBatisSetting.getSqlSessionFactory().openSession()){
            ICategoriesDAO categoriesDAO = sqlSession.getMapper(ICategoriesDAO.class);
            LOGGER.info("categories is here by getEntityById");
            return categoriesDAO.getEntityById(id);
        }
    }

    @Override
    public void saveEntity(Object entity) throws SQLException {
        try (SqlSession sqlSession = MyBatisSetting.getSqlSessionFactory().openSession()){
            ICategoriesDAO categoriesDAO = sqlSession.getMapper(ICategoriesDAO.class);
            sqlSession.insert("saveEntity", entity);
            LOGGER.info("new categories is here by saveEntity");
            sqlSession.commit();
        }
    }

    @Override
    public void updateEntity(Object entity) throws SQLException {
        try (SqlSession sqlSession = MyBatisSetting.getSqlSessionFactory().openSession()) {
            ICategoriesDAO categoriesDAO = sqlSession.getMapper(ICategoriesDAO.class);
            sqlSession.update("updateEntity", entity);
            LOGGER.info("old categories has left, but new has come by updateEntity");
            sqlSession.commit();
        }
    }

    @Override
    public void removeEntity(long id) throws SQLException {
        try (SqlSession sqlSession = MyBatisSetting.getSqlSessionFactory().openSession()) {
            ICategoriesDAO categoriesDAO = sqlSession.getMapper(ICategoriesDAO.class);
            LOGGER.info("minus one categories by removeEntity");
            sqlSession.delete("removeEntity", id);
            sqlSession.commit();
        }
    }

    @Override
    public void getTable() throws SQLException {

    }
}
