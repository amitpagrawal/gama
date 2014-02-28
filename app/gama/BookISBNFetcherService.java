package gama;

import java.io.IOException;
import java.util.List;

public interface BookISBNFetcherService {

	List<String> fetchBooksISBN(String url) throws IOException;

}
