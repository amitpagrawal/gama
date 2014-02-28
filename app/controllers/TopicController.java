package controllers;

import gama.BookService;
import gama.BookServiceImpl;

import java.util.Iterator;
import java.util.List;

import models.Book;
import models.Topic;
import play.data.Form;
import play.mvc.Controller;
import play.mvc.Result;
import views.html.topicView;
import dao.BookDAO;
import views.html.topicDetails;

 
public class TopicController extends Controller {


	 public static Result index() {
		 
		 	List<Topic> topicList = Topic.all();
		 	
		 	//Book.get
		 	return ok(topicView.render(topicList));
	    }
	 
	 public static Result details(Long topicId) {
		 
		 	Topic topic = Topic.getById(topicId);
		 	List<Book> bookList = new BookDAO().getBooksByTopicId(topicId);
		 	
		 	//Book.get
		 	return ok(topicDetails.render(bookList,topic));
	    }
	 

	 public static Result delete(){
		 
		Long id = Long.parseLong(request().getQueryString("id"));
		Topic.delete(id);
		 List<Topic> topicList = Topic.all();
		 return ok(topicView.render(topicList));
	 }
	 
	 public static Result addTopic(){
		 
		 
		 Topic topicObj = Form.form(Topic.class).bindFromRequest().get();
		 
		 topicObj.save();
		 
		 try{
		 
		 if(topicObj.getUrl().contains("wikipedia.org/wiki")){
			 
			 	BookService bookService = new BookServiceImpl();
				List<Book> bookList = bookService.getBooksFromWikipedia(topicObj.getUrl());
				
				for (Iterator iterator = bookList.iterator(); iterator
						.hasNext();) {
					Book book = (Book) iterator.next();
					book.setTopicId(topicObj.getId());
					book.save();
					
				}
			
		 }
		 }
		 catch(Exception ex){
			 return internalServerError();
		 }
		 List<Topic> topicList = Topic.all();
		 return ok(topicView.render(topicList));
	 }
	 
	 
	

}
