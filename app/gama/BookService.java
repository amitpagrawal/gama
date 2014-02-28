package gama;

import java.util.List;

import models.Book;

public interface BookService {

	List<Book> getBooksFromWikipedia(String url) throws Exception;

}
