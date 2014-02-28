package gama;

import static org.junit.Assert.*;

import java.util.List;

import models.Book;

import org.junit.Test;

public class BookServiceTest {

	@Test
	public void BookService() throws Exception {
		BookService bookService = new BookServiceImpl();
		String url = "http://en.wikipedia.org/wiki/java_(programming_language)";
		List<Book> bookList = bookService.getBooksFromWikipedia(url);
		
		assertSame(bookList.get(0).getTitle(),"Gamification by Design: Implementing Game Mechanics in Web and Mobile Apps");
	}

}
