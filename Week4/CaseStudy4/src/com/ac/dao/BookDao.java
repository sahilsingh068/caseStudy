package com.ac.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import com.ac.bean.Book;

public class BookDao {
	public int addBook(Book book) {
		Connection conn=null;
		PreparedStatement pstmt=null;
		try 
		{
			conn=BookDB.getConection();
			String insertStr="insert into book values(?,?,?,?)";
			pstmt=conn.prepareStatement(insertStr);
			pstmt.setInt(1, book.getBookId());
			pstmt.setString(2, book.getBookTitle());
			pstmt.setInt(3, book.getBookPrice());
			pstmt.setString(4, book.getBookGrade());
			int updateCount=pstmt.executeUpdate();
			conn.close();
			return updateCount;
		}
		catch(Exception ex)
		{
			System.out.println(ex.toString());
			return 0;
		}
		
	}
	
	// Search book by ID
	public ArrayList getBookDetailsById(int bookId) throws Exception{
		Connection conn=null;
		PreparedStatement pstmt=null;
		ResultSet rs=null;
		conn=BookDB.getConection();
		String selectStr="select bookTitle,bookPrice from book where bookId=?";
		pstmt=conn.prepareStatement(selectStr);
		pstmt.setInt(1, bookId);
		rs=pstmt.executeQuery();
		
		ArrayList result=new ArrayList();
		if(rs.next()) {
			result.add(rs.getString(1));
			result.add(rs.getString(2));
		}
		else
		{
			result.add("INVALID id");
		}
		return result;
		
		
	}
}
