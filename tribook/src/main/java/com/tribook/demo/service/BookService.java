package com.tribook.demo.service;

import java.util.List;

import com.tribook.demo.entity.Book;


public interface BookService {
public List<Book> findAll();
	
	public void save(Book theBook);
	
	public Book findById(int theId);
	
	public List<Book> findByTitle(String theTitle); 
	
	public void deleteById(int theId);
}
