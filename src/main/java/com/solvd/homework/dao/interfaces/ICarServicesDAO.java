package com.solvd.homework.dao.interfaces;

import java.sql.SQLException;

public interface ICarServicesDAO extends IBaseDAO {
    void getTable () throws SQLException;
}
