package com.solvd.homework.dao.jdbsMySQLImpl.classes;

public class ForCarServicesDAO {
    private int id;
    private String status;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "ForCarServicesDAO{" +
                "id=" + id +
                ", status='" + status + '\'' +
                '}';
    }
}
