package com.codegym.de_thi_thu.rest;

import com.codegym.de_thi_thu.model.Order;
import com.codegym.de_thi_thu.service.IOrderService;
import com.codegym.de_thi_thu.service.IProductService;
import com.codegym.de_thi_thu.service.IProductTupeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/order")
public class ProductRestController {
    @Autowired
    private IProductService productService;
    @Autowired
    private IProductTupeService productTupeService;
    @Autowired
    private IOrderService orderService;
    @GetMapping("/detail")
    public ResponseEntity<Order> getOrder (@RequestParam Integer orderId){
        Order order = this.orderService.findById(orderId);
        if(order == null){
            return  new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        return new ResponseEntity<>(order,HttpStatus.OK);
    }
}
