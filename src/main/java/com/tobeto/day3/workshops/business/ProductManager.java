package com.tobeto.day3.workshops.business;

import com.tobeto.day3.workshops.dataaccess.ProductDao;
import com.tobeto.day3.workshops.dataaccess.impl.ProductDaoImpl;
import com.tobeto.day3.workshops.entities.Product;

import java.util.List;

public class ProductManager {

    private ProductDao productDao;

    public ProductManager() {
        productDao = new ProductDaoImpl();
    }

    public void add(Product product) {
        // business logic
        productDao.add(product);
    }

    public List<Product> getAll() {
        // business logic
        return productDao.getAll();
    }
}
