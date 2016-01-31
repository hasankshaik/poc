package uk.co.dev.response;

public class MovieVO {
	private String id;
	private String moviename;
	private String rating;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public MovieVO(String id, String moviename, String rating) {
		super();
		this.id = id;
		this.moviename = moviename;
		this.rating = rating;
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
