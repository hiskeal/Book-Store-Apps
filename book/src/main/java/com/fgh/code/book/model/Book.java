package com.fgh.code.book.model;

import javax.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Table(name = ("bookstore"))
public class Book {
  //  private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private long bookId;

    @Column(name="author")
    private String author;

    @Column(name="language")
    private String language;

    @Column(name="list_price")
    private double listPrice;

    @Column(name="number_of_pages")
    private int numberOfPages;

    @Column(name="our_price")
    private double ourPrice;

    @Column(name="title")
    private String title;
}
