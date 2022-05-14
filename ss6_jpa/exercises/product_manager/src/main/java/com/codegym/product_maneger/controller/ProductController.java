package com.codegym.product_maneger.controller;

import com.codegym.product_maneger.dto.ProductDto;
import com.codegym.product_maneger.model.Product;
import com.codegym.product_maneger.service.IProductService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.web.PageableDefault;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@Controller
@RequestMapping("/product")
public class ProductController {
    @Autowired
    private IProductService iProductService;

    @GetMapping("")
    public String goHomePage(Model model,
                             @RequestParam(defaultValue = "0") Integer page,
                             @RequestParam(defaultValue = "3") Integer pageSize,
                             @RequestParam Optional<String> sort,
                             @RequestParam Optional<String> dir,
                             @RequestParam Optional<String> name) {
        Pageable pageable;
        String keywordName = name.orElse("");
        String dirVal = dir.orElse("");
        String sortVal = sort.orElse("");
        if ("".equals(sortVal)) {
            pageable = PageRequest.of(page, pageSize);
        } else {
            if ("asc".equals(dirVal)) {
                pageable = PageRequest.of(page, pageSize, Sort.by(sortVal).ascending());
            } else {
                pageable = PageRequest.of(page, pageSize, Sort.by(sortVal).descending());
            }
        }
        model.addAttribute("products", this.iProductService.findAllByName(keywordName, pageable));
        model.addAttribute("keywordName", keywordName);
        model.addAttribute("sortVal", sortVal);
        model.addAttribute("dirVal", dirVal);
        return "index";
    }

    @GetMapping("/create")
    public String goCreateForm(Model model) {
        model.addAttribute("productDto", new ProductDto());
        return "create";
    }

    @PostMapping("/save")
    public String createProduct(@ModelAttribute @Validated ProductDto productDto,
                                BindingResult bindingResult) {
        productDto.setProductCodeList(iProductService.getProductCode());
        new ProductDto().validate(productDto, bindingResult);
        if (bindingResult.hasFieldErrors()) {
            return "create";
        } else {
            Product product1 = new Product();
            BeanUtils.copyProperties(productDto, product1);
            this.iProductService.save(product1);
            return "redirect:/product";
        }
    }

    @GetMapping("/edit")
    public String goEditForm(Model model, @RequestParam Integer id) {
        model.addAttribute("product", this.iProductService.findById(id));
        return "edit";
    }

    @PostMapping("/update")
    public String update(@ModelAttribute Product product) {
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
    public String view(@RequestParam int id, Model model) {
        model.addAttribute("product", this.iProductService.findById(id));
        return "view";
    }
}

