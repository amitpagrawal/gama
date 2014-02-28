package dao;

import java.util.List;

import models.Book;

import com.avaje.ebean.Ebean;

public class BookDAO {

	 
	 public static List<Book> getBooksByTopicId(Long topicId) {
		 
		 List<Book> list = Ebean.find(Book.class)  
				    .where()  
				      .eq("topicId", topicId)  
				    .findList();
		 
		 return list;
		}

}
