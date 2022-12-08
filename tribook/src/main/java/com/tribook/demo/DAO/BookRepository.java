package com.tribook.demo.DAO;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tribook.demo.entity.Book;


public interface BookRepository extends JpaRepository<Book, Integer> {
	
	List<Book> findByTitle(String title);
	
	void deleteByTitle(String title);
	
}
