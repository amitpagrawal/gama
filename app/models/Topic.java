package models;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;

import com.avaje.ebean.Ebean;

import play.db.ebean.Model;

@Entity
public class Topic extends Model{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	
	@Id
	private Long id;
	
	 public static Finder<Long,Topic> find = new Finder(
			    Long.class, Topic.class
			  );
	
	private String name;
	private String description;
	private String url;
	
	public static void delete(Long id){
		
		find.ref(id).delete();
	}
	
	public static List<Topic> all() {
		 
		return find.all();
	}
	
	public static Topic getById(Long id) {
		 
		return  Ebean.find(Topic.class, id); 
	}
	
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
}
