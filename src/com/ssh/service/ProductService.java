package com.ssh.service;

import com.ssh.dao.ProductDao;
import com.ssh.entity.Product;
import org.springframework.transaction.annotation.Transactional;

@Transactional
public class ProductService {
    /**
     * service层注入dao类
     */
    private ProductDao productDao;

    public void setProductDao(ProductDao productDao) {
        this.productDao = productDao;
    }

    /**
     * service中保存商品方法
     * @param product
     */
    public void save(Product product) {
        System.out.println("Service中save方法执行了");
        productDao.save(product);
    }
}
