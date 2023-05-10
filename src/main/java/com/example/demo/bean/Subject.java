package com.example.demo.bean;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="Subject")
public class Subject {

	@Id
	private int BookCode;
	public Subject(int bookCode, String bookName, String author, String date) {
		super();
		this.BookCode = bookCode;
		this.BookName = bookName;
		this.Author = author;
		this.Date = date;
	}
	public Subject() {
		
	}
	private String BookName;
	private String Author;
	private String Date;
	public int getBookCode() {
		return BookCode;
	}
	public void setBookCode(int bookCode) {
		this.BookCode = bookCode;
	}
	public String getBookName() {
		return BookName;
	}
	public void setBookName(String bookName) {
		this.BookName = bookName;
	}
	public String getAuthor() {
		return Author;
	}
	public void setAuthor(String author) {
		this.Author = author;
	}
	public String getDate() {
		return Date;
	}
	public void setDate(String date) {
		this.Date = date;
	}
}
