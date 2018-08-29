package com.ssh.action;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import com.ssh.entity.Product;
import com.ssh.service.ProductService;

public class ProductAction extends ActionSupport implements ModelDriven<Product> {

    private Product product = new Product();
    @Override
    public Product getModel() {
        return product;
    }

    /**
     * Action注入service类
     */
    private ProductService productService;

    public void setProductService(ProductService productService) {
        this.productService = productService;
    }

    /**
     * 保存商品方法
     */
    public String save(){
        System.out.println("Action中的save方法实现了...");
        productService.save(product);
        return null;
    }
}
