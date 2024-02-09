package com.tobeto.day3.workshops.dataaccess.impl;

import com.tobeto.day3.workshops.dataaccess.ProductDao;
import com.tobeto.day3.workshops.entities.Product;

import java.util.ArrayList;
import java.util.List;

public class ProductDaoImpl implements ProductDao {

    private List<Product> products = new ArrayList<Product>();

    public ProductDaoImpl() {
        products.add(new Product(1, "Bilgisayar"));
        products.add(new Product(2, "Telefon"));
        products.add(new Product(3, "Koltuk"));
    }

    public void add(Product product) {
        products.add(product);
    }

    public List<Product> getAll() {
        return products;
    }
}
