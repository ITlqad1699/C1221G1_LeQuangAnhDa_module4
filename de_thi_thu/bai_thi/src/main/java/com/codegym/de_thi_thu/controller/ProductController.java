package com.codegym.de_thi_thu.controller;

import com.codegym.de_thi_thu.dto.OrderDto;
import com.codegym.de_thi_thu.model.Order;
import com.codegym.de_thi_thu.service.IOrderService;
import com.codegym.de_thi_thu.service.IProductService;
import com.codegym.de_thi_thu.service.IProductTupeService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.domain.jaxb.SpringDataJaxb;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.util.Optional;

@Controller
@RequestMapping("/product")
public class ProductController {
    @Autowired
    private IProductService productService;
    @Autowired
    private IProductTupeService productTupeService;
    @Autowired
    private IOrderService orderService;

    @GetMapping
    public String goHomePage(Model model,
                             @RequestParam(defaultValue = "0") Integer page,
                             @RequestParam(defaultValue = "3") Integer pageSize,
                             @RequestParam Optional<String> sort,
                             @RequestParam Optional<String> dir,
                             @RequestParam Optional<String> dateStart,
                             @RequestParam Optional<String> dateEnd) {
        Pageable pageable;
        String dirVal = dir.orElse("");
        String sortVal = sort.orElse("");
        String dateStartKey = dateStart.orElse("");
        String dateEndKey = dateEnd.orElse("");
        if ("".equals(sortVal)) {
            pageable = PageRequest.of(page, pageSize);
            model.addAttribute("order", this.orderService.findAllProduct(pageable, dateStartKey, dateEndKey));
        } else {
            pageSize = Integer.parseInt(sortVal);
            pageable = PageRequest.of(page, pageSize);
            model.addAttribute("order", this.orderService.findAllByToTalMoney(pageable, dateStartKey, dateEndKey));
        }

        return "index";
    }


    @GetMapping("/edit")
    public String update(Model mode,
                         @RequestParam Integer orderId) {
        Order order = this.orderService.findById(orderId);
        OrderDto orderDto = new OrderDto();
        BeanUtils.copyProperties(order, orderDto);
        mode.addAttribute("orderDto", orderDto);
        mode.addAttribute("products", this.productService.findAll());
        mode.addAttribute("productTypeList", this.productTupeService.findAll());
        return "edit";
    }

    @PostMapping("/update")
    public String update(Model model,
                         @ModelAttribute @Validated OrderDto orderDto,
                         BindingResult bindingResult){
        new OrderDto().validate(orderDto, bindingResult);
        if (bindingResult.hasFieldErrors()) {
            model.addAttribute("products", this.productService.findAll());
            model.addAttribute("productTypeList", this.productTupeService.findAll());
            return "edit";
        } else {
            Order order = new Order();
            BeanUtils.copyProperties(orderDto, order);
            this.orderService.save(order);
            return "redirect:/product";
        }
    }
}
