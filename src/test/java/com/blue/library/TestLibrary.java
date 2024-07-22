package com.blue.library;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;

import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

public class TestLibrary {
	
	@Mock
	private BookRepository repo;
	
	@InjectMocks
	private LibraryService service;
	
	@BeforeEach
	public void setUp() {
		MockitoAnnotations.openMocks(this);
	}
	
	public void testGetBooksByGenre() {
		//Arranging
		List<Book> books = Arrays.asList(new Book("HP", "Fiction"), 
																		new Book("LOTR", "Adventure"));
		
		when(repo.findAll()).thenReturn(books);
		
		assertEquals("Hp", books.get(0).getTitle());
	}
	
	

}
