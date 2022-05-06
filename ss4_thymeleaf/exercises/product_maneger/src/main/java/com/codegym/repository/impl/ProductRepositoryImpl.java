package com.codegym.repository.impl;

import com.codegym.model.Product;
import com.codegym.repository.IProductRepository;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Repository
public class ProductRepositoryImpl implements IProductRepository {
    private static Map<Integer, Product> productMap;
    static {
        productMap = new HashMap<>();
        productMap.put(1,new Product(1,"beer","240","có thêm khuyến mãi","tiger"));
        productMap.put(2,new Product(2,"beer","250","có thêm khuyến mãi","larue"));
        productMap.put(3,new Product(3,"xe","10000","có thêm khuyến mãi","tiger"));
        productMap.put(4,new Product(4,"beer","10000","có thêm khuyến mãi","tiger"));
        productMap.put(5,new Product(5,"phone","10000","có thêm khuyến mãi","tiger"));
        productMap.put(6,new Product(6,"car","10000","có thêm khuyến mãi","tiger"));
    }
    @Override
    public List<Product> findAll() {
        return new ArrayList<>(productMap.values());
    }

    @Override
    public void save(Product product) {
        productMap.put(product.getId(),product);
    }

    @Override
    public Product findById(int id) {
        return productMap.get(id);
    }

    @Override
    public void remove(int id) {
        productMap.remove(id);
    }

    @Override
    public void update(int id, Product product) {
        productMap.put(id,product);
    }

    @Override
    public List<Product> search(String name) {
        List<Product> listSearch = new ArrayList<>();
        for (Map.Entry<Integer, Product> entry : productMap.entrySet()) {
           if(entry.getValue().getName().contains(name)){
               listSearch.add(entry.getValue());
           }
        }
        return listSearch;
    }
}
