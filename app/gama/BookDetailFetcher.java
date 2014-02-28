package gama;

import java.io.IOException;

import models.Book;

//key: pXQqlS3sAYFEzxBEYnrTUA
//secret: E8uJ38H7nGI9GN3iEho2maMDbY07SQ84TF763qQ6qI

public interface BookDetailFetcher {

	Book fetchBookDetails(String isbn) throws IOException;

}
