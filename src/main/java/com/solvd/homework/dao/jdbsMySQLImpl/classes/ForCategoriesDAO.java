package com.solvd.homework.dao.jdbsMySQLImpl.classes;

public class ForCategoriesDAO {
    private int id;
    private String category;
    private int license_id;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public int getLicense_id() {
        return license_id;
    }

    public void setLicense_id(int license_id) {
        this.license_id = license_id;
    }

    @Override
    public String toString() {
        return "ForCategoriesDAO{" +
                "id=" + id +
                ", category='" + category + '\'' +
                ", license_id=" + license_id +
                '}';
    }
}
