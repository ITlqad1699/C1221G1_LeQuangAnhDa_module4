package com.codegym.app_blog.controller;

import com.codegym.app_blog.model.BlogModel;
import com.codegym.app_blog.service.IBlogService;
import com.codegym.app_blog.service.IPostsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@Controller
@RequestMapping("/goBlog")
public class BlogController {

    @Autowired
    IBlogService iBlogService;
    @Autowired
    IPostsService iPostsService;

    @GetMapping("")
    public String goHomePage(Model model,
                             @PageableDefault(value = 3) Pageable pageable,
                             @RequestParam Optional<String> name) {
        model.addAttribute("post", this.iPostsService.findAll());
        String keyword = name.orElse("");
        model.addAttribute("blog",this.iBlogService.findAllByName(keyword,pageable));
        model.addAttribute("keyword",keyword);
        return "index";
    }

    @GetMapping("/view")
    public String goViewPage(Model model, @RequestParam Integer id) {
        model.addAttribute("blog", this.iBlogService.findById(id));
        return "view";
    }

    @GetMapping("/create")
    public String goCreateForm(Model model) {
        model.addAttribute("blog", new BlogModel());
        model.addAttribute("post", this.iPostsService.findAll());
        return "create";
    }

    @PostMapping("/save")
    public String createNewBlog(@ModelAttribute BlogModel blogModel) {
        this.iBlogService.save(blogModel);
        return "redirect:/goBlog";
    }

    @GetMapping("/edit")
    public String goEditForm(Model model, @RequestParam Integer id) {
        model.addAttribute("blog", this.iBlogService.findById(id));
        model.addAttribute("post", this.iPostsService.findAll());
        return "edit";
    }

    @PostMapping("/update")
    public String update(@ModelAttribute BlogModel blogModel) {
        this.iBlogService.save(blogModel);
        return "redirect:/goBlog";
    }

    @PostMapping("/delete")
    public String delete(@RequestParam Integer id) {
        BlogModel blogModel = this.iBlogService.findById(id);
        this.iBlogService.delete(blogModel);
        return "redirect:/goBlog";
    }
}
