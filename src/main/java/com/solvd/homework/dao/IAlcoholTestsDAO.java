package com.solvd.homework.dao;

import java.sql.SQLException;

public interface IAlcoholTestsDAO<AlcoholTests> extends IBaseDAO <AlcoholTests>{
    @Override
    AlcoholTests getEntityById(long id) throws SQLException;

    @Override
    void saveEntity(AlcoholTests entity) throws SQLException;

    @Override
    void updateEntity(AlcoholTests entity) throws SQLException;

    @Override
    void removeEntity(long id) throws SQLException;
}
