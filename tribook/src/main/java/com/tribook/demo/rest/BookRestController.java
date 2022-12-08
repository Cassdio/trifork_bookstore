package com.tribook.demo.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tribook.demo.entity.Book;
import com.tribook.demo.service.BookService;



@RestController
@RequestMapping("/api")
public class BookRestController {

	private BookService bookService;
	
	@Autowired
	public BookRestController(BookService theBookService) {
		bookService = theBookService;
	}
	
	// expose "/books" and return list of books
	@GetMapping("/books")
	public List<Book> findAll() {
		return bookService.findAll();
	}

	// add mapping for GET /books/id/{bookId}
	@GetMapping("/books/id/{bookId}")
	public Book getBookById(@PathVariable int bookId) {
		
		Book theBook = bookService.findById(bookId);
		if (theBook == null) {
			throw new RuntimeException("Book title not found - " + bookId);
		}
		return theBook;
	}
	
	// add mapping for GET /books/title/{bookTitle}
	@GetMapping("/books/title/{bookTitle}")
	public List<Book> getbookByTitle(@PathVariable String bookTitle) {
		
		List<Book> result = bookService.findByTitle(bookTitle);
		if (result.isEmpty()) {
			throw new RuntimeException("Book title not found - " + bookTitle);
		}
		return result;
	}
	
	// add mapping for POST /books - add new book
	@PostMapping("/books")
	public Book addbook(@RequestBody Book theBook) {
		// in case an id is passed ... set id to 0
		// force a save of new item ... rather than update
		theBook.setId(0);
		bookService.save(theBook);
		return theBook;
	}
	
	// add mapping for PUT /books - update existing book
	@PutMapping("/books")
	public Book updateBook(@RequestBody Book theBook) {
		bookService.save(theBook);
		return theBook;
	}
	
	// add mapping for DELETE /books/{bookId} - delete book
	@DeleteMapping("/books/{bookId}")
	public String deleteBook(@PathVariable int bookId) {
	Book tempBook = bookService.findById(bookId);
	
	// throw exception if null
		if (tempBook == null) {
			throw new RuntimeException("Book title not found - " + bookId);
		}
	bookService.deleteById(bookId);
		return "Deleted book title - " + bookId;
	}
	
}
