package com.tobeto.day3.workshops;

import com.tobeto.day3.workshops.business.CategoryManager;
import com.tobeto.day3.workshops.entities.Category;

class Main {

    public static void main(String[] args) {
        CategoryManager categoryManager = new CategoryManager();

        Category categoryToAdd = new Category(4, "Araba");

        categoryManager.add(categoryToAdd);

        for (Category category : categoryManager.getAll()) {
            System.out.println(category.getName());
        }
    }
}
