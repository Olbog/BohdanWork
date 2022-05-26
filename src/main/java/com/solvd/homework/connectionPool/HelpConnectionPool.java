package com.solvd.homework.connectionPool;

public class HelpConnectionPool {
    private ConnectionAllPool connectionPool = ConnectionAllPool.newInstance();

    protected ConnectionAllPool getConnectionPool() {
        return this.connectionPool;
    }
}
