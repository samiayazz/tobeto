package com.tobeto.day3.workshops.business;

import com.tobeto.day3.workshops.dataaccess.CategoryDao;
import com.tobeto.day3.workshops.dataaccess.impl.CategoryDaoImpl;
import com.tobeto.day3.workshops.entities.Category;

import java.util.List;

public class CategoryManager {

    private CategoryDao categoryDao;

    public CategoryManager() {
        categoryDao = new CategoryDaoImpl();
    }

    public void add(Category category) {
        // business logic
        categoryDao.add(category);
    }

    public List<Category> getAll() {
        // business logic
        return categoryDao.getAll();
    }
}
