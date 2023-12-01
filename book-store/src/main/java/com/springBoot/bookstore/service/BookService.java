package com.springBoot.bookstore.service;

import com.springBoot.bookstore.model.Book;
import com.springBoot.bookstore.repository.BookRepository;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class BookService {
    private final BookRepository bookRepository;

    public BookService(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }
    public Optional<Book>  findBookById(Integer bookID){
        return bookRepository.findById(bookID);
    }
}
