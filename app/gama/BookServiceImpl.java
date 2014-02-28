package gama;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import models.Book;

public class BookServiceImpl implements BookService {

	@Override
	public List<Book> getBooksFromWikipedia(String url) throws Exception {
		BookISBNFetcherService isbnFetcher = new WikipediaBookFetcherServiceImpl();
		List<String> fetchBooksISBN = isbnFetcher.fetchBooksISBN(url);
		
		BookDetailFetcher bookDetailsFetcher = new GoodBookDetailsFetcher();
		List<Book> bookList = new ArrayList<Book>();
		for (Iterator iterator = fetchBooksISBN.iterator(); iterator.hasNext();) {
			String isbn = (String) iterator.next();
			Book book = bookDetailsFetcher.fetchBookDetails(isbn);
			bookList.add(book);
		}
		
		
		return bookList;
	}

}
