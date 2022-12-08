package com.tribook.demo.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="book")
public class Book {

	// define fields
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	
	@Column(name = "id")
	private int id;
	
	@Column(name="title")
	private String title;
	
	@Column(name="description")
	private String description;
	
	@Column(name="author")
	private String author;
	
	@Column(name="cover")
	private String cover;
	
	@Column(name = "price")
	private float price;
		
	// define constructors
	
	public Book() {
		
	}

	public Book(int id, String title, String description, String author, String cover, float price) {
		this.id = id;
		this.title = title;
		this.description = description;
		this.author = author;
		this.cover = cover;
		this.price = price;
	}

	// define getter/setter

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}
	
	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getCover() {
		return cover;
	}

	public void setCover(String cover) {
		this.cover = cover;
	}

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}

	//define tostring
	@Override
	public String toString() {
		return "Book [id =" + id+ ", title=" + title + ", description=" + description + ", author=" + author + ", cover=" + cover
				+ ", price=" + price + "]";
	}
		
}
