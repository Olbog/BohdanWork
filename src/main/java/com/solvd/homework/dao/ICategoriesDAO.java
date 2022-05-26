package com.solvd.homework.dao;

import java.sql.SQLException;

public interface ICategoriesDAO extends IBaseDAO {
    void getTable () throws SQLException;
}
