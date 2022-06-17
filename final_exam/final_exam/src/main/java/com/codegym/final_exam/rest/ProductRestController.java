package com.codegym.final_exam.rest;


import com.codegym.final_exam.service.IOrderService;
import com.codegym.final_exam.service.IProductService;
import com.codegym.final_exam.service.IProductTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/ajax-edit")
public class ProductRestController {
    @Autowired
    private IProductService productService;
    @Autowired
    private IProductTypeService productTupeService;
    @Autowired
    private IOrderService orderService;


}
