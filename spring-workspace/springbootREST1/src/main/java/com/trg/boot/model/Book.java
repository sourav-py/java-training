package com.trg.boot.model;

public class Book {
	
	int bookId;
	String name;
	Author auth;
	
	public Book() {
		
	}
	
	public Book(int bookId, String name, Author auth) {
		super();
		this.bookId = bookId;
		this.name = name;
		this.auth = auth;
	}

	public int getBookId() {
		return bookId;
	}

	public void setBookId(int bookId) {
		this.bookId = bookId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Author getAuth() {
		return auth;
	}

	public void setAuth(Author auth) {
		this.auth = auth;
	}

	@Override
	public String toString() {
		return "Book [bookId=" + bookId + ", name=" + name + ", auth=" + auth + "]";
	}
	
	
	
	
}
