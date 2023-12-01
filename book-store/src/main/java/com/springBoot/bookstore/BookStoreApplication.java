package com.springBoot.bookstore;

import com.springBoot.bookstore.model.Book;
import com.springBoot.bookstore.repository.BookRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Arrays;

@SpringBootApplication
public class BookStoreApplication implements CommandLineRunner {
	private final BookRepository bookRepository;
	public BookStoreApplication(BookRepository bookRepository) {
		this.bookRepository = bookRepository;
	}

	public static void main(String[] args) {
		SpringApplication.run(BookStoreApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		  Book book1 = Book.builder()
				  .name("Fahrenheit 451")
				  .author("Ray Bradbury")
				  .price(70)
				  .stock(15)
				  .build();

		Book book2 = Book.builder()
				.name("Kozmos")
				.author("Carl Sagan")
				.price(66)
				.stock(100)
				.build();

		Book book3 = Book.builder()
				.name("Frankestein")
				.author("Mary Shelly")
				.price(40)
				.stock(20)
				.build();

		bookRepository.saveAll(Arrays.asList(book1, book2, book3));

	}
}
