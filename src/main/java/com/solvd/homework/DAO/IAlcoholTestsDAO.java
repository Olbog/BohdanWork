package com.solvd.homework.DAO;

import java.sql.SQLException;

public interface IAlcoholTestsDAO<AlcoholTests> extends IBaseDAO <AlcoholTests>{
    @Override
    AlcoholTests getEntityById(long id) throws SQLException;

    @Override
    void saveEntity(AlcoholTests entity);

    @Override
    void updateEntity(AlcoholTests entity);

    @Override
    void removeEntity(long id);
}
