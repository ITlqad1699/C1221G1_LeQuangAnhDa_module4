package com.codegym.final_exam.model;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "product_type")
public class ProductType {
    @Id
    @Column(name = "product_type_id")
    private Integer  productTypeId;
    @Column(name = "product_type_name")
    private String productTypeName;
    @OneToMany(mappedBy = "productType")
    private List<Product> productList;

    public ProductType() {
    }

    public List<Product> getProductList() {
        return productList;
    }

    public void setProductList(List<Product> productList) {
        this.productList = productList;
    }

    public Integer getProductTypeId() {
        return productTypeId;
    }

    public void setProductTypeId(Integer productTypeId) {
        this.productTypeId = productTypeId;
    }

    public String getProductTypeName() {
        return productTypeName;
    }

    public void setProductTypeName(String productTypeName) {
        this.productTypeName = productTypeName;
    }
}
