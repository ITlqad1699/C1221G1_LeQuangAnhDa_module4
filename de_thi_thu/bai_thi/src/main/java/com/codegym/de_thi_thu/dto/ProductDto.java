package com.codegym.de_thi_thu.dto;

import com.codegym.de_thi_thu.model.Order;
import com.codegym.de_thi_thu.model.ProductType;

import java.util.List;

public class ProductDto {

    private Integer productId;
    private String name;
    private String price;
    private String status;
    private ProductType productType;
    private List<Order> orderList;
    public ProductDto() {
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

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
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
