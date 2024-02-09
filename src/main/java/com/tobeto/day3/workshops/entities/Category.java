package com.tobeto.day3.workshops.entities;

public class Category {

    private int id;
    private String name;

    public Category() {

    }

    public Category(int id) {
        setId(id);
    }

    public Category(int id, String name) {
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
