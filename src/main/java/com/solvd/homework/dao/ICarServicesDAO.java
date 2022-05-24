package com.solvd.homework.dao;

import java.sql.SQLException;

public interface ICarServicesDAO extends IBaseDAO {
    @Override
    Object getEntityById(long id) throws SQLException;

    @Override
    void saveEntity(Object entity) throws SQLException;

    @Override
    void updateEntity(Object entity) throws SQLException;

    @Override
    void removeEntity(long id) throws SQLException;
}
