package com.relevel.bookmyshowclone.application;

import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.relevel.bookmyshowclone.domain.MovieShow;
import com.relevel.bookmyshowclone.persistence.MovieRepo;
import com.relevel.bookmyshowclone.persistence.ShowRepo;

/**
 * Service class for booking related operations.
 *
 * @since Jul 21, 2021 1:35 PM
 */
@Service
public class BookingService {
	
	@Autowired
	private ShowRepo showRepo;
	
	
	//to add movie show
	public MovieShow addMovieShow(MovieShow movieShow) {
	
		return showRepo.save(movieShow);
		
	}
	
	//delete a show 
	public void deleteMovieShow(Long showId) throws Exception {
		
		//checking whether show is present with given show Id or not if not throw exception else delete
		//from table
		MovieShow movieShow = showRepo.findById(showId).get();
		if(movieShow==null) {
			new Exception("Shows was not found");
		}
		
		showRepo.deleteById(showId);
		
	}

}
