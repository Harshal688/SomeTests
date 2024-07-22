package com.blue.library;

import java.util.List;
import java.util.stream.Collectors;

public class LibraryService { //Service
	 
	private  BookRepository repo;
	

	public LibraryService(BookRepository repo) {
		this.repo = repo;
	}
	
	public List<Book> getBooksByGenre(String genre) {
		
		return repo.findAll().stream()
						.filter(book -> genre.equalsIgnoreCase(book.getGenre()))
						.collect(Collectors.toList());
	}
	

}
