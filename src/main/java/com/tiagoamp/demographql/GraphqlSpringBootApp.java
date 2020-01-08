package com.tiagoamp.demographql;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class GraphqlSpringBootApp {

	public static void main(String[] args) {
		SpringApplication.run(GraphqlSpringBootApp.class, args);
	}
	
	
//	@Bean
//	public CommandLineRunner demo(AuthorRepository authorRepository, BookRepository bookRepository) {
//		return (args) -> {
//			Author author = new Author("Herbert", "Schildt");
//			authorRepository.save(author);
//
//			bookRepository.save(new Book("Java: A Beginner's Guide, Sixth Edition", "0071809252", 728, author));
//		};
//	}
}
