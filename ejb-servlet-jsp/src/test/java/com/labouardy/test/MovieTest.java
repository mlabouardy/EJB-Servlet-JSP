package com.labouardy.test;

import javax.ejb.embeddable.EJBContainer;
import javax.naming.NamingException;

import org.junit.Before;
import org.junit.Test;

import bean.MovieBean;
import entity.Movie;

public class MovieTest {

	@Before
	public void setUp(){
		
	}
	
	@Test
	public void testEJB() throws NamingException{
		MovieBean movieBean=(MovieBean)EJBContainer.createEJBContainer().getContext().lookup("java:global/tomee-project/MovieBean");
		Movie movie=new Movie();
		movie.setId(1);
		movie.setTitle("ok");
		movieBean.newMovie(movie);
		Movie tmp=movieBean.findMovie(1);
		System.out.println(tmp);
	}
}
