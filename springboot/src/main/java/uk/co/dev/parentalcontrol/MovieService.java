package uk.co.dev.parentalcontrol;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import uk.co.dev.constants.ParentalControlLevel;
import uk.co.dev.domain.Movie;
import uk.co.dev.exceptions.TechnicalFailureException;
import uk.co.dev.exceptions.TitleNotFoundException;
import uk.co.dev.repository.MovieRepository;

@Service
public class MovieService implements IMovieService {
	@Autowired
	private MovieRepository movieRepository;

	@Override
	public String getParentalControlLevel(String name)
			throws TitleNotFoundException, TechnicalFailureException {
		movieRepository.findAll().stream().forEach(System.out::println);
		return movieRepository.findByMoviename(name).stream().findFirst().get().getRating();

	}

	@Override
	public void saveMovie(Movie movie) {
		movieRepository.save(movie);
	}

}
