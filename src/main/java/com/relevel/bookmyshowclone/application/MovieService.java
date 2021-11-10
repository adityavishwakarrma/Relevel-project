package com.relevel.bookmyshowclone.application;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.relevel.bookmyshowclone.domain.Movie;
import com.relevel.bookmyshowclone.domain.MovieShow;
import com.relevel.bookmyshowclone.persistence.MovieRepo;
import com.relevel.bookmyshowclone.persistence.ShowRepo;

@Service
public class MovieService {

	@Autowired
	private MovieRepo movieRepo;
	
	@Autowired
	private ShowRepo showRepo;
	
	//method for adding movie
	public Movie addMovie(Movie movie) {
		
		//here I am checking whether movie is already exist with given name or not
		Movie findByMovieName = movieRepo.findByMovieName(movie.getMovieName());
		
		//if movie is already exist then return null
		if(findByMovieName!=null) {
			return null;
		}
		
		//movie does not exist with given name so add it to database
		return movieRepo.save(movie);
	}
	
	//method for removing movie and all of its shows
	public void removeMovie(Long movieId) throws Exception {
		
		//checking whether movie is present or not if not then throw exception
		Movie movie = movieRepo.findById(movieId).get();
		if(movie==null) {
			throw new Exception("No movie was found");
		}
		
		//getting all the Movie shows for the given movie
		List<MovieShow> findByMovieId = showRepo.findByMovieName(movie.getMovieName());
		
		//storing all the showsId for the given movie in showIds list
		List<Long> showIds=new ArrayList<>();
		for(MovieShow ms: findByMovieId) {
			if(ms.getMovieName().equals(movie.getMovieName())) {
				showIds.add(ms.getShowId());
				
			}
			
		}
		
		//deleting movie from movie table
		movieRepo.deleteById(movieId);
		
		//deleting all the shows for the given movie from movie_show
		showRepo.deleteAllById(showIds);
		
	}
	
	
}
