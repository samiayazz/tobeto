package com.tobeto.day3.workshops.dataaccess;

import com.tobeto.day3.workshops.entities.Product;

import java.util.List;

public interface ProductDao {

    void add(Product product);

    List<Product> getAll();
}
