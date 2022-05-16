package com.codegym.product_maneger.dto;

import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

import javax.validation.constraints.NotBlank;
import java.util.List;

public class ProductDto implements Validator {
    private Integer id;
    @NotBlank(message = "*not null")
    private String productCode;
    @NotBlank(message = "*not null")
    private String name;
    private String price;
    @NotBlank(message = "*not null")
    private String description;
    @NotBlank(message = "*not null")
    private String producer;
    private List<String> productCodeList;

    public List<String> getProductCodeList() {
        return productCodeList;
    }

    public void setProductCodeList(List<String> productCodeList) {
        this.productCodeList = productCodeList;
    }

    public ProductDto() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getProductCode() {
        return productCode;
    }

    public void setProductCode(String productCode) {
        this.productCode = productCode;
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

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getProducer() {
        return producer;
    }

    public void setProducer(String producer) {
        this.producer = producer;
    }

    @Override
    public boolean supports(Class<?> clazz) {
        return false;
    }

    @Override
    public void validate(Object target, Errors errors) {
        ProductDto productDto = (ProductDto) target;
        String priceValid = productDto.getPrice();

        if (productDto.getProductCodeList().contains(productDto.getProductCode())) {
            errors.rejectValue("productCode", "product-code.duplicate", "errors");
        }
//        if (!priceValid.matches("(^SP-\\d{4}$)")) {
//            errors.rejectValue("productCode", "product-code.format", "errors");
//        }
        if ("".equals(priceValid)) {
            ValidationUtils.rejectIfEmpty(errors, "price", "price.empty", "errors");
        } else {
            if (!priceValid.matches("(^$|[0-9]*$)")) {
                errors.rejectValue("price", "price.matches", "errors");
            }
        }
    }
}
//else{
//        errors.rejectValue("price", "price.positive", "errors");
//        }
