package com.ssh.dao;

import com.ssh.entity.Product;
import org.springframework.orm.hibernate5.support.HibernateDaoSupport;

public class ProductDao extends HibernateDaoSupport {
    /**
     * dao中保存商品方法
     * @param product
     */
    public void save(Product product) {
        System.out.println("dao中save方法实现...");
        this.getHibernateTemplate().save(product);
    }
}
