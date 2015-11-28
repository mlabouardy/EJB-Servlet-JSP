package servlet;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.ejb.EJB;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import bean.MovieBean;
import bean.MovieIt;
import entity.Movie;

@WebServlet("/moviefun/*")
public class HomeServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	@EJB
	private MovieIt movieBean;
       
    public HomeServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("ok "+movieBean);
		List<Movie> movies=movieBean.getMovies();
		/*List<Movie> movies=new ArrayList<>();
		Movie m1=new Movie();
		m1.setId(1);
		m1.setTitle("The Dark Knight");
		m1.setDirector("Director");
		m1.setYear(2014);
		m1.setRating(4);
		m1.setGenre("Action");
		movies.add(m1);
		request.setAttribute("movies", movies);*/
		request.getRequestDispatcher("WEB-INF/home.jsp").forward(request, response);
		
	}
	

}
