package gama;

import java.io.IOException;

import models.Book;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;

public class GoodBookDetailsFetcher implements BookDetailFetcher {

	@Override
	public Book fetchBookDetails(String isbn) throws IOException {
		
			String url ="https://www.goodreads.com/search.xml?key=pXQqlS3sAYFEzxBEYnrTUA&q="+isbn;
			Document doc = Jsoup.connect(url).timeout(6000).get();
		
		  
		  Book book = new Book();
		  book.setId(isbn);
		  book.setTitle(doc.select("title").text());
		  book.setBigImage(doc.select("image_url").text());
		  book.setSmallImage(doc.select("small_image_url").text());
		  book.setAuthorName(doc.select("name").text());
		  book.setLink(" https://www.goodreads.com/book/isbn/"+isbn.replace("-", ""));
		  try{
			  book.setRating(new Double(doc.select("average_rating").text()));
		  }catch(NumberFormatException numberFormatException){
			  
		  }
		  
		  
		  return book;
	}

}
