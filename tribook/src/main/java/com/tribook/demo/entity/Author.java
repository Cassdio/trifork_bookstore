package com.tribook.demo.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="Author")
public class Author {

	// define fields
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	
	@Column(name = "id")
	private int id;
	
	@Column(name="pseudonym")
	private String pseudonym;
	
	public Author() {
		
	}

	public Author(int id, String pseudonym) {
		super();
		this.id = id;
		this.pseudonym = pseudonym;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getPseudonym() {
		return pseudonym;
	}

	public void setPseudonym(String pseudonym) {
		this.pseudonym = pseudonym;
	}

	@Override
	public String toString() {
		return "Author [id=" + id + ", pseudonym=" + pseudonym + "]";
	}
	
	

}
