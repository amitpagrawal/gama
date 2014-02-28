package gama;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class WikipediaBookFetcherServiceImpl implements
		BookISBNFetcherService {

	@Override
	public List<String> fetchBooksISBN(String url) throws IOException {

		List<String> bookList = new ArrayList<String>();
		 Document doc = Jsoup.connect(url).timeout(6000).get();
	     Elements links = doc.select("a[href]");
	     
	     for(Element link : links){
	    	 if(link.attr("href").startsWith("/wiki/Special:BookSources")){
	    		 bookList.add(link.text());
	    	 }
	     }
	       
		return bookList;
	}

}
