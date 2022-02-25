package com.ac.service;

import com.ac.bean.Book;
import com.ac.dao.BookDao;

public class BookService {
	public int bookService(int bookId,String bookTitle,int bookPrice) {
		String bookGrade="";
		if(bookPrice<=500) {
			bookGrade="C";
		}
		else if(bookPrice<=400) {
			bookGrade="B";
		}
		else {
			bookGrade="A";
		}
		BookDao bDao=new BookDao();
		Book book=new Book();
		book.setBookId(bookId);
		book.setBookTitle(bookTitle);
		book.setBookGrade(bookGrade);
		book.setBookPrice(bookPrice);
		int updateResult=0;
		try
		{
			updateResult=bDao.addBook(book);
			return updateResult;
		}
		catch(Exception ex) 
		{
			System.out.println(ex.toString());
			return 0;
		}
		
	}

}
