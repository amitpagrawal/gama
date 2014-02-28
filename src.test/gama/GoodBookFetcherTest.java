package gama;

import static org.junit.Assert.*;

import java.io.IOException;

import models.Book;

import org.junit.Test;

public class GoodBookFetcherTest {
	
	@Test
	public  void GoodBookFetcherTest() throws IOException{
		
		BookDetailFetcher bookDetailsFetcher = new GoodBookDetailsFetcher();
		Book book = bookDetailsFetcher.fetchBookDetails("1449315399");
		assertEquals(book.getTitle(),"Gamification by Design: Implementing Game Mechanics in Web and Mobile Apps");
	}

}
