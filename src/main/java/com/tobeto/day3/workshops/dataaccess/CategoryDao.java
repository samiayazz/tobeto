package com.tobeto.day3.workshops.dataaccess;

import com.tobeto.day3.workshops.entities.Category;

import java.util.List;

public interface CategoryDao {

    void add(Category category);

    List<Category> getAll();
}
