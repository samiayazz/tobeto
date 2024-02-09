package com.tobeto.day3.homeworks.video3.business;

import com.tobeto.day3.homeworks.video3.core.logging.Logger;
import com.tobeto.day3.homeworks.video3.dataaccess.ProductDao;
import com.tobeto.day3.homeworks.video3.entities.Product;

public class ProductManager {

    private ProductDao productDao;
    private Logger[] loggers;

    public ProductManager(ProductDao productDao, Logger[] loggers) {
        this.productDao = productDao;
        this.loggers = loggers;
    }

    public void add(Product product) throws Exception {
        if (product.getUnitPrice() < 10) {
            throw new Exception("Ürün fiyatı 10'dan küçü olamaz.");
        }
        productDao.add(product);

        for (Logger logger : loggers) { // [Database, Mail]
            logger.log(product.getName());
        }
    }
}
