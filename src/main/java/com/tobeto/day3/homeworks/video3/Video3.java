package com.tobeto.day3.homeworks.video3;

import com.tobeto.day3.homeworks.video3.business.ProductManager;
import com.tobeto.day3.homeworks.video3.core.logging.DatabaseLogger;
import com.tobeto.day3.homeworks.video3.core.logging.FileLogger;
import com.tobeto.day3.homeworks.video3.core.logging.Logger;
import com.tobeto.day3.homeworks.video3.dataaccess.HibernateProductDao;
import com.tobeto.day3.homeworks.video3.entities.Product;

class Video3 {
    public static void main(String[] args) throws Exception {
        Product product1 = new Product(1, "Iphone Xr", 9000);

        Logger[] loggers = {new DatabaseLogger(), new FileLogger()};

        ProductManager productManager = new ProductManager(new HibernateProductDao(), loggers);
        productManager.add(product1);
    }
}
