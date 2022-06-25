package com.solvd.homework.dao.interfaces;

import com.solvd.homework.dao.models.Driver;

import java.sql.SQLException;

public interface IDriverDAO extends IBaseDAO<Driver> {
    void getTable () throws SQLException;
}
