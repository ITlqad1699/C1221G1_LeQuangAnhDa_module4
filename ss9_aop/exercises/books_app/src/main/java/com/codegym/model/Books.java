package com.codegym.model;

import javax.persistence.*;
import java.lang.annotation.Target;
import java.util.List;

@Entity
@Table(name = "books")
public class Books {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(name = "book_name")
    private String nameBooks;
    private String price;
    private Integer quantity;
    private String image;

    public Books() {
    }

    @OneToMany(mappedBy = "books")
    private List<BorrowingCode> borrowingCodes;

    public Books(Integer id, String nameBooks, String price, Integer quantity, String image, List<BorrowingCode> borrowingCodes) {
        this.id = id;
        this.nameBooks = nameBooks;
        this.price = price;
        this.quantity = quantity;
        this.image = image;
        this.borrowingCodes = borrowingCodes;
    }


    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNameBooks() {
        return nameBooks;
    }

    public void setNameBooks(String nameBooks) {
        this.nameBooks = nameBooks;
    }

    public List<BorrowingCode> getBorrowingCodes() {
        return borrowingCodes;
    }

    public void setBorrowingCodes(List<BorrowingCode> borrowingCodes) {
        this.borrowingCodes = borrowingCodes;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }
}
