package com.tobeto.day3.homeworks.video3.dataaccess;

import com.tobeto.day3.homeworks.video3.entities.Product;

public class JdbcProductDao implements ProductDao {

    public void add(Product product) {
        // Buraya sadece, veritabanı erişim kodları yazılır.
        System.out.println("JDBC ile veritabanına eklendi.");
    }
}
