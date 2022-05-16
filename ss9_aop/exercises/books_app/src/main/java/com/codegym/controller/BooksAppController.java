package com.codegym.controller;

import com.codegym.exception.BookRunOut;
import com.codegym.exception.NotFoundBorrowCode;
import com.codegym.model.Books;
import com.codegym.model.BorrowingCode;
import com.codegym.service.IBooksAppService;
import com.codegym.service.IBorrowingCodeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@Controller
public class BooksAppController {
    @Autowired
    IBooksAppService iBooksAppService;

    @Autowired
    IBorrowingCodeService iBorrowingCodeService;
    @GetMapping("/goLibrary")
    public String goLibrary(Model model,
                            @RequestParam(defaultValue = "0") Integer page,
                            @RequestParam(defaultValue = "3") Integer pageSize,
                            @RequestParam Optional<String> sort,
                            @RequestParam Optional<String> dir,
                            @RequestParam Optional<String> bookName){
        Pageable pageable;
        String keywordName = bookName.orElse("");
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
        model.addAttribute("books", this.iBooksAppService.findAllByName(keywordName, pageable));
        model.addAttribute("keywordName", keywordName);
        model.addAttribute("sortVal", sortVal);
        model.addAttribute("dirVal", dirVal);
        return "index";
    }

    @GetMapping("/goborrow")
    public String goBorrowForm(Model model,
                               @RequestParam Integer id){
        model.addAttribute("book",this.iBooksAppService.findById(id));
        return "borrow";
    }

    @PostMapping("/borrow")
    public String borrowBook(@ModelAttribute Books books) throws BookRunOut {
        this.iBooksAppService.borrow(books);
        BorrowingCode borrowingCode = new BorrowingCode();
        borrowingCode.setBooks(books);
        this.iBorrowingCodeService.saveBookCode(borrowingCode);
        return "redirect:/goLibrary";
    }

    @GetMapping("/goGiveBack")
    public String goGiveBack(){
        return "give_back";
    }

    @PostMapping("/giveBack")
    public  String giveBack(@RequestParam Integer bookCode) throws NotFoundBorrowCode{
        Optional<BorrowingCode> borrowingCode = iBorrowingCodeService.findById(bookCode);
        this.iBorrowingCodeService.delete(borrowingCode.get());
        this.iBooksAppService.giveBack(borrowingCode.get().getBooks());
        return "redirect:/goLibrary";
    }

    @ExceptionHandler(NotFoundBorrowCode.class)
    public String showErrorPage(){
        return "error";
    }

    @ExceptionHandler(BookRunOut.class)
    public String showErrorPage2(){
        return "error2";
    }
}
