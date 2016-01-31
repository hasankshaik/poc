package uk.co.dev.domain;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import uk.co.dev.response.MovieVO;

@Entity
public class Movie implements Serializable{

	public Movie(String moviename, String rating) {
		super();
		this.moviename = moviename;
		this.rating = rating;
	}

	public Movie() {
		super();
	}

	@Override
	public String toString() {
		return "Movie [id=" + id + ", name=" + moviename + ", rating=" + rating
				+ "]";
	}

	private String id;
	private String moviename;
	private String rating;

	@Id
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}


	public String getMoviename() {
		return moviename;
	}

	public void setMoviename(String moviename) {
		this.moviename = moviename;
	}

	public String getRating() {
		return rating;
	}

	public void setRating(String rating) {
		this.rating = rating;
	}
	

}
