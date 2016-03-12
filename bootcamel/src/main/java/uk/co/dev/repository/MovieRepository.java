package uk.co.dev.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import uk.co.dev.domain.Movie;

@Repository
public interface MovieRepository extends JpaRepository<Movie, String> {
	public List<Movie> findByMoviename(String moviename);
}
