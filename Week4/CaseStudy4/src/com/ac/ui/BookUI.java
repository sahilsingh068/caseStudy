package com.ac.ui;

import java.util.Scanner;

import com.ac.service.BookService;

public class BookUI {
	public static void main(String[] args) throws Exception {
		int bookId=0;
		int bookPrice=0;
		String bookTitle="";
		Scanner sc=new Scanner(System.in);
		// end user giving book details
		System.out.println("Enter Book Id");
		bookId=sc.nextInt();
		System.out.println("Enter Book Title");
		bookTitle=sc.next();
		System.out.println("Enter Book Price");
		bookPrice=sc.nextInt();
		BookService bookService=new BookService();
		int updateCount=bookService.bookService(bookId,bookTitle,bookPrice);
		System.out.println("inserted " +updateCount+" book successfully");
	}

}
