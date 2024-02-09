package com.tobeto.day3.workshops.dataaccess.impl;

import com.tobeto.day3.workshops.dataaccess.CategoryDao;
import com.tobeto.day3.workshops.entities.Category;

import java.util.ArrayList;
import java.util.List;

public class CategoryDaoImpl implements CategoryDao {

    private List<Category> categories = new ArrayList<Category>();

    public CategoryDaoImpl() {
        categories.add(new Category(1, "Bilgisayar"));
        categories.add(new Category(2, "Telefon"));
        categories.add(new Category(3, "Mobilya"));
    }

    public void add(Category category) {
        categories.add(category);
    }

    public List<Category> getAll() {
        return categories;
    }
}
