package uk.co.dev.parentalcontrol;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import uk.co.dev.domain.Movie;
import uk.co.dev.parentalcontrol.api.IMovieService;
import uk.co.dev.repository.MovieRepository;

@Service
public class MovieService implements IMovieService {
	@Autowired
	private MovieRepository movieRepository;



	@Override
	public void saveMovie(Movie movie) {
		movieRepository.save(movie);
	}

	@Override
	public Movie getMovie(Long movie) {
		return movieRepository.getOne(movie);
	}

	@Override
	public void updateMovie(Movie movie) {
		if (getMovie(movie.getId()) == null) {
			throw new RuntimeException("Cannot update");
		}
		movieRepository.save(movie);
	}

	@Override
	public void deleteMovie(Long movie) {
		if (getMovie(movie) == null) {
			throw new RuntimeException("Cannot delete");
		}
		movieRepository.delete(movie);
	}
}
