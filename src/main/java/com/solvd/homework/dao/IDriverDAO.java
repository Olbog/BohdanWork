package com.solvd.homework.dao;

import java.sql.SQLException;

public interface IDriverDAO extends IBaseDAO {
    void getTable () throws SQLException;
}
