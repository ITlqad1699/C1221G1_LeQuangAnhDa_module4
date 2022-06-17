package com.codegym.final_exam.dto;

import com.codegym.final_exam.model.Product;
import com.codegym.final_exam.model.ProductType;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

import javax.validation.constraints.NotBlank;
import java.time.LocalDate;

public class OrderDto implements Validator {
    private Integer orderId;
    @NotBlank(message = "*chon ngay mua")
    private String purchaseDate;
    private Integer quantity;
    private Product product;

    public OrderDto() {
    }

    public Integer getOrderId() {
        return orderId;
    }

    public void setOrderId(Integer orderId) {
        this.orderId = orderId;
    }

    public String getPurchaseDate() {
        return purchaseDate;
    }

    public void setPurchaseDate(String purchaseDate) {
        this.purchaseDate = purchaseDate;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    @Override
    public boolean supports(Class<?> clazz) {
        return false;
    }

    @Override
    public void validate(Object target, Errors errors) {
        OrderDto orderDto = (OrderDto) target;
        Integer productTypeId = orderDto.getProduct().getProductType().getProductTypeId();

        if (orderDto.getQuantity() == null) {
            errors.rejectValue("quantity", "enter.quantity", "errors");
        } else if (orderDto.getQuantity() < 0) {
            errors.rejectValue("quantity", "integer.invalid", "errors");
        }

        if (!"".equals(orderDto.getPurchaseDate())) {
            LocalDate date = LocalDate.parse(orderDto.getPurchaseDate());
            if ((LocalDate.now().isAfter(date))) {
                errors.rejectValue("purchaseDate", "date.valid", "errors");
            }
        }
    }
}

