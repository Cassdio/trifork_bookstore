package com.tribook.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.tribook.demo.DAO.BookRepository;
import com.tribook.demo.entity.Book;

@Service
public class BookServiceImpl implements BookService {

	private BookRepository bookRepository;
	
	@Autowired
	public BookServiceImpl(BookRepository theBookRepository) {
		bookRepository = theBookRepository;
	}
	
	@Override
	public List<Book> findAll() {
		return bookRepository.findAll();
	}

	@Override
	public Book findById(int theId) {
		Optional<Book> result = bookRepository.findById(theId);
		Book theBook = null;
		if(result.isPresent()) {
			theBook = result.get();
		}
		else {
			// can't find the book
			throw new RuntimeException("Didn't find the book: " + theId );
		}
		return theBook;
	}

	@Override
	public List<Book> findByTitle(String thetitle) {
		
		List<Book> result = bookRepository.findByTitle(thetitle);
		if(!result.isEmpty()) {
			return result;
		}
		else {
			// can't find the book
			throw new RuntimeException("Didn't find the book: " + thetitle );
		}
	}

	@Override
	public void save(Book theBook) {
		bookRepository.save(theBook);
	}

	@Override
	@Transactional
	public void deleteById(int theId) {
		bookRepository.deleteById(+theId);
	}

	

}