package com.solvd.homework.dao;

import com.solvd.homework.dao.jdbsMySQLImpl.classes.ForDriverDAO;

import java.sql.SQLException;

public interface IDriverDAO extends IBaseDAO<ForDriverDAO> {
    void getTable () throws SQLException;
}
