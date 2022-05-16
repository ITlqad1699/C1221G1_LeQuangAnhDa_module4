package com.codegym.model;

import javax.persistence.*;

@Entity
@Table(name = "borrowing_code")
public class BorrowingCode {
    @Id
    @Column(name = "book_code")
    private Integer bookCode;
    @Column(name = "date_start")
    private String dateStart;
    @Column(name = "date_end")
    private String dateEnd;

    @ManyToOne()
    @JoinColumn(name = "book_id", referencedColumnName = "id")
    private Books books;
    public BorrowingCode() {
    }

    public Books getBooks() {
        return books;
    }

    public void setBooks(Books books) {
        this.books = books;
    }

    public String getDateStart() {
        return dateStart;
    }

    public void setDateStart(String dateStart) {
        this.dateStart = dateStart;
    }

    public String getDateEnd() {
        return dateEnd;
    }

    public void setDateEnd(String dateEnd) {
        this.dateEnd = dateEnd;
    }

    public BorrowingCode(Integer bookCode) {
        this.bookCode = bookCode;

    }

    public Integer getBookCode() {
        return bookCode;
    }

    public void setBookCode(Integer bookCode) {
        this.bookCode = bookCode;
    }
}
