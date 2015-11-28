package bean;

import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.PersistenceUnit;
import javax.persistence.Query;

import entity.Movie;

@Stateless
public class MovieBean implements MovieIt {

	@PersistenceContext(unitName="movie-unit")
	private EntityManager em;
	
	public void newMovie(Movie movie) {
		em.persist(movie);
	}

	public void deleteMovie(int id) {
		Movie movie=findMovie(id);
		em.remove(movie);
	}

	public List<Movie> getMovies() {
		System.out.println("ok");
		Query query=em.createQuery("SELECT m FROM Movie m");
		return query.getResultList();
	}

	public void updateMovie(Movie movie) {
		em.merge(movie);
	}

	public Movie findMovie(int id) {
		return em.find(Movie.class, id);
	}

}
