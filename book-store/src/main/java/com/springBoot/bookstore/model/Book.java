package com.springBoot.bookstore.model;


import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Builder;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Table // veritabanı tablosu olduğunu belirtiyoruz.
@Data // lombok olduğunu belirtiyoruz
@Getter
@Setter
@Builder
public class Book  {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer ID;

    private String name;
    private String author;
    private double price;
    private Integer stock;

}
