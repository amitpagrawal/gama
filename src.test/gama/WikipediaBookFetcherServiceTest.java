package gama;

import static org.junit.Assert.assertEquals;

import java.io.IOException;
import java.util.List;

import org.junit.Test;

public class WikipediaBookFetcherServiceTest {

	@Test
	public void bookFetcherTest() throws IOException{
		
		String url = "http://en.wikipedia.org/wiki/Gamification";
		
		BookISBNFetcherService bookFetcherService = new WikipediaBookFetcherServiceImpl();
		List<String> bookList = bookFetcherService.fetchBooksISBN(url);
		
		String isbn  = bookList.get(0);
		assertEquals(isbn,"1449315399");
		
		System.out.println(bookList);
	
	}
	

	
}
