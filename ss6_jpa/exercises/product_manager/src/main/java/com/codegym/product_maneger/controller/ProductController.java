package com.codegym.product_maneger.controller;

import com.codegym.product_maneger.model.Product;
import com.codegym.product_maneger.service.IProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/product")
public class ProductController {
    @Autowired
    private IProductService iProductService;

    @GetMapping("")
    public String goHomePage(Model model) {
        model.addAttribute("products", this.iProductService.findAll());
        return "index";
    }

    @GetMapping("/create")
    public String goCreateForm(Model model) {
        model.addAttribute("product", new Product());
        return "create";
    }

    @PostMapping("/save")
    public String createProduct(@ModelAttribute Product product) {
        this.iProductService.save(product);
        return "redirect:/product";
    }

    @GetMapping("/edit")
    public String goEditForm(Model model, @RequestParam Integer id){
        model.addAttribute("product", this.iProductService.findById(id));
        return "edit";
    }
    @PostMapping("/update")
    public String update(@ModelAttribute Product product){
        this.iProductService.save(product);
        return "redirect:/product";
    }

    @GetMapping("/delete")
    public String goDeleteForm(@RequestParam int id, Model model) {
        model.addAttribute("product", this.iProductService.findById(id));
        return "delete";
    }

    @PostMapping("/remove")
    public String deleteProduct(@ModelAttribute Product product) {
        this.iProductService.remove(product);
        return "redirect:/product";
    }

    @GetMapping("/view")
    public String view(@RequestParam int id, Model model){
        model.addAttribute("product", this.iProductService.findById(id));
        return "view";
    }
}

