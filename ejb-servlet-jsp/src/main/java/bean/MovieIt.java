package bean;

import java.util.List;

import javax.ejb.Local;

import entity.Movie;

@Local
public interface MovieIt {

	public void newMovie(Movie movie);
	
	public void deleteMovie(int id);
	
	public List<Movie> getMovies();
	
	public void updateMovie(Movie movie);
	
	public Movie findMovie(int id);
}
