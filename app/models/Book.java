package models;

import javax.persistence.Entity;
import javax.persistence.Id;

import play.db.ebean.Model;

@Entity
public class Book extends Model{
	@Id
	private Long bookId;
	
	private Long topicId;
	
	
	public Long getBookId() {
		return bookId;
	}

	public void setBookId(Long bookId) {
		this.bookId = bookId;
	}

	private String id;
	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getSmallImage() {
		return smallImage;
	}

	public void setSmallImage(String smallImage) {
		this.smallImage = smallImage;
	}

	public String getBigImage() {
		return bigImage;
	}

	public void setBigImage(String bigImage) {
		this.bigImage = bigImage;
	}

	public String getLink() {
		return link;
	}

	public void setLink(String link) {
		this.link = link;
	}

	public double getRating() {
		return rating;
	}

	public void setRating(double rating) {
		this.rating = rating;
	}

	private String title;
	private String smallImage;
	private String bigImage;
	private String link;
	private double rating;
	private String authorName;
	
	public String getAuthorName(){
		return authorName;
	}
	
	public String getId() {
		return id;
	}

	public void setId(String iSBN) {
		id = iSBN;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "[ISBN:"+id+"]";
	}

	public void setAuthorName(String authorName) {
		this.authorName = authorName;
		
	}

	public Long getTopicId() {
		return topicId;
	}

	public void setTopicId(Long topicId) {
		this.topicId = topicId;
	}
}
