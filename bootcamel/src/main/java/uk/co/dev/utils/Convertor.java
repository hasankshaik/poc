package uk.co.dev.utils;

import uk.co.dev.domain.Movie;
import uk.co.dev.response.MovieVO;

public class Convertor {
	public static MovieVO getMovieVo(Movie mov) {
		return new MovieVO(mov.getId(), mov.getMoviename(), mov.getRating());
	}
}
