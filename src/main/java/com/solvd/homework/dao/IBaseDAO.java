package com.solvd.homework.dao;

import java.sql.SQLException;

public interface IBaseDAO <T> {
    T getEntityById (long id) throws SQLException;
    void saveEntity (T entity) throws SQLException;
    void updateEntity (T entity) throws SQLException;
    void removeEntity (long id) throws SQLException;

}
