package com.springBoot.bookstore.repository;


import com.springBoot.bookstore.model.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface orderRepository extends JpaRepository<Order, Integer>{
  
}
