package com.ac.bean;

public class Book {
	private int bookId;
	private String bookTitle;
	private int bookPrice;
	private String bookGrade;
	public int getBookId() {
		return bookId;
	}
	// Getting and Setting values for book
	public void setBookId(int bookId) {
		this.bookId = bookId;
	}
	public String getBookTitle() {
		return bookTitle;
	}
	public void setBookTitle(String bookTitle) {
		this.bookTitle = bookTitle;
	}
	public int getBookPrice() {
		return bookPrice;
	}
	public void setBookPrice(int bookPrice) {
		this.bookPrice = bookPrice;
	}
	public String getBookGrade() {
		return bookGrade;
	}
	public void setBookGrade(String productGrade) {
		this.bookGrade = productGrade;
	}
	

}
