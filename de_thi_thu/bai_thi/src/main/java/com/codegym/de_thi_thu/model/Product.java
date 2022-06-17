package com.codegym.de_thi_thu.model;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "product")
public class Product {
    @Id
    @Column(name = "product_id")
    private Integer productId;
    private String name;
    private Double price;
    private String status;

    @ManyToOne
    @JoinColumn(name = "product_type_id",referencedColumnName = "product_type_id")
    private ProductType productType;

    @OneToMany(mappedBy = "product")
    private List<Order> orderList;

    public Product() {
    }

    public Integer getProductId() {
        return productId;
    }

    public void setProductId(Integer productId) {
        this.productId = productId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public ProductType getProductType() {
        return productType;
    }

    public void setProductType(ProductType productType) {
        this.productType = productType;
    }

    public List<Order> getOrderList() {
        return orderList;
    }

    public void setOrderList(List<Order> orderList) {
        this.orderList = orderList;
    }
}
