package com.solvd.homework.DAO;

import java.sql.SQLException;

public interface IBaseDAO <T> {
    T getEntityById (long id) throws SQLException;
    void saveEntity (T entity);
    void updateEntity (T entity);
    void removeEntity (long id);

}
