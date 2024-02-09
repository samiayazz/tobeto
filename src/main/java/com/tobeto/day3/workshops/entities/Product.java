package com.tobeto.day3.workshops.entities;

public class Product {

    private int id;
    private String name;

    public Product() {

    }

    public Product(int id) {
        setId(id);
    }

    public Product(int id, String name) {
        this(id);
        setName(name);
    }

    public int getId() {
        return id;
    }

    private void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
