package uk.co.dev.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Movie {

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

	private long id;
	private String moviename;
	private String rating;

	@Id
	@GeneratedValue
	public long getId() {
		return id;
	}

	public void setId(long id) {
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
