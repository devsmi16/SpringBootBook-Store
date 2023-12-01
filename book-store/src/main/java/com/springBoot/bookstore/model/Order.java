package com.springBoot.bookstore.model;

import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Table
@Getter
@Setter
@Data
@Builder
@Entity(name = "book order")
@AllArgsConstructor
@NoArgsConstructor
public class Order {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer ID;

    private String userName;
    private double totalPrice;
}
