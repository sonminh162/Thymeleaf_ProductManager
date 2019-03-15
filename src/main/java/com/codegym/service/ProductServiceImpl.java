package com.codegym.service;

import com.codegym.model.Product;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ProductServiceImpl implements ProductService {
    private static Map<Integer,Product> products;

    static {
        products = new HashMap<>();
        products.put(1,new Product(1,"none","Fan",1000,"samsung"));
        products.put(2,new Product(2,"none","Laptop",1000,"apple"));
        products.put(3,new Product(3,"none","Chair",1000,"uma"));
        products.put(4,new Product(4,"none","Table",1000,"lixil"));
    }
    @Override
    public List<Product> findAll() {
        return new ArrayList<>(products.values());
    }

    @Override
    public void save(Product product) {
        products.put(product.getId(),product);
    }

    @Override
    public Product findById(int id) {
        return products.get(id);
    }

    @Override
    public void update(int id, Product product) {
        products.put(id,product);
    }

    @Override
    public void remove(int id) {
        products.remove(id);
    }
}
