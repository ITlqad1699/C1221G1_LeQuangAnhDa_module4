package com.codegym.controller;

import com.codegym.model.Product;
import com.codegym.service.IProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

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
        product.setId((int) (Math.random() * 10000));
        this.iProductService.save(product);
        return "redirect:/product";
    }

    @GetMapping("/edit")
    public String goEditForm(Model model, @RequestParam int id){
        model.addAttribute("product", this.iProductService.findById(id));
        return "edit";
    }
    @PostMapping("/update")
    public String update(@ModelAttribute Product product){
        this.iProductService.update(product.getId(),product);
        return "redirect:/product";
    }

    @GetMapping("/delete")
    public String goDeleteForm(@RequestParam int id, Model model) {
        model.addAttribute("product", this.iProductService.findById(id));
        return "delete";
    }

    @PostMapping("/delete")
    public String deleteProduct(@ModelAttribute Product product, RedirectAttributes redirect) {
        this.iProductService.remove(product.getId());
        return "redirect:/product";
    }

    @GetMapping("/view")
    public String view(@RequestParam int id, Model model){
        model.addAttribute("product", this.iProductService.findById(id));
        return "view";
    }
    @GetMapping("/search")
    public String search(@RequestParam String name, Model model){
        model.addAttribute("products", this.iProductService.search(name));
        return "index";
    }
}

