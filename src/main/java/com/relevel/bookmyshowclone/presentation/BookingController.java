package com.relevel.bookmyshowclone.presentation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.relevel.bookmyshowclone.application.BookingService;
import com.relevel.bookmyshowclone.application.MovieService;
import com.relevel.bookmyshowclone.domain.Movie;
import com.relevel.bookmyshowclone.domain.MovieShow;



/**
 * Controller class to implement REST end points.
 *
 * @since Jul 21, 2021 1:37 PM
 */
@RestController
@RequestMapping("/")
public class BookingController {
	
	@Autowired
	private BookingService bookingServie;
	
	@Autowired
	private MovieService movieService;

	
    public void registerUser() {
        //Add implementation
    }
    
    public void updateUser() {
        //Add implementation
    }
    
    @PostMapping("/addMovie")
    public ResponseEntity<String> addMovie(@RequestBody Movie movie) {
        //Add implementation
    	Movie addMovie = movieService.addMovie(movie);
    	if(addMovie!=null) {
    		return new ResponseEntity<String>("Movie added successfully", HttpStatus.OK);
    	}else {
    		return new ResponseEntity<String>("Movie with given name already exist", HttpStatus.BAD_REQUEST);
    	}
    	
    	
    }
    
    
    @PostMapping("/addMovieShow")
    public ResponseEntity<String> addMovieShow(@RequestBody MovieShow movieShow) {
        //Add implementation
    	
    	MovieShow addMovieShow = bookingServie.addMovieShow(movieShow);
    	if(addMovieShow!=null) {
    		return new ResponseEntity<String>("Show added successfully", HttpStatus.OK);
    	}else {
    		return new ResponseEntity<String>("something went wrong", HttpStatus.INTERNAL_SERVER_ERROR);
    	}    	
    }
    
    
    
    @DeleteMapping("/removeMovie/{movieId}")
    public ResponseEntity<String> removeMovie(@PathVariable Long movieId) {
        //Add implementation
    	try {
			movieService.removeMovie(movieId);
			return new ResponseEntity<>("Movie and all of its shows deleted successfully", HttpStatus.OK);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			return new ResponseEntity<>("No movie was found", HttpStatus.NOT_FOUND);
		}
    	
    }
    
    
    @DeleteMapping("/removeShow/{showId}")
    public ResponseEntity<String> removeShow(@PathVariable Long showId) {
        //Add implementation
    	try {
			bookingServie.deleteMovieShow(showId);
			return new ResponseEntity<String>("Show deleted successfully", HttpStatus.OK);
		} catch (Exception e) {
			// TODO Auto-generated catch block
//			e.printStackTrace();
			return new ResponseEntity<String>("Show was not found", HttpStatus.NOT_FOUND);
		}
    	
    }
    
    public void removeAllShowsForMovie() {
        //Add implementation
    }
    
    public void bookShow() {
        //Add implementation
    }
    
    public void cancelShowBooking() {
        //Add implementation
    }
    
    public void getAvailableSeats() {
        //Add implementation
    }
    
    public void getAvailabilityForMovie() {
        //Add implementation
    }
    
}
