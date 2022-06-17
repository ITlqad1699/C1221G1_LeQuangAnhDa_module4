package com.codegym.de_thi_thu.dto;

import com.codegym.de_thi_thu.model.Product;
import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

import javax.validation.constraints.NotBlank;
import java.time.LocalDate;

public class OrderDto implements Validator {
    private Integer orderId;
    @NotBlank(message = "*choose purchase date")
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
        if (orderDto.getQuantity() == null) {
            errors.rejectValue("quantity", "enter.quantity", "errors");
        } else if (orderDto.getQuantity() < 0) {
            errors.rejectValue("quantity", "integer.invalid", "errors");
        }

        if(!"".equals(orderDto.getPurchaseDate())){
            LocalDate date = LocalDate.parse(orderDto.getPurchaseDate());
            if((LocalDate.now().isBefore(date))){
                errors.rejectValue("purchaseDate","date.valid","errors");
            }
        }
    }
}

