package com.springBoot.bookstore.service;


import com.springBoot.bookstore.model.Book;
import com.springBoot.bookstore.model.Order;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.logging.Logger;

@Service
public class OrderService{


    private final Logger logger = (Logger) LoggerFactory.getLogger(OrderService.class);
    private final BookService bookService;
    private final com.springBoot.bookstore.repository.orderRepository orderRepository;
    public OrderService(BookService bookService, com.springBoot.bookstore.repository.orderRepository orderRepository) {
        this.bookService = bookService;
        this.orderRepository = orderRepository;
    }
    public Order putAnOrder(List<Integer> bookIdList, String username){
          Double totalPrice = bookIdList.stream()
                  .map(bookService::findBookById)
                  .map(optionalBook -> optionalBook.map(Book::getPrice).orElse(0.0))
                  .reduce(0.0, Double::sum);

          Order order =Order.builder()
                  .totalPrice(totalPrice)
                  .userName(username)
                  .build();
          return orderRepository.save(order);
    }
}
