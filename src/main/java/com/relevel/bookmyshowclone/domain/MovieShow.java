package com.relevel.bookmyshowclone.domain;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @since Jul 21, 2021 1:39 PM
 */
@Entity
@Table(name="movieShow")
public class MovieShow {
    
	//show Id is auto generated we don't have to pass, and it will be unique
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long showId;
    
   
	private String movieId;
	
	private String movieName;
	
	private String showTime;

	public MovieShow(long showId, String movieId, String movieName, String showTime) {
		super();
		this.showId = showId;
		this.movieId = movieId;
		this.movieName = movieName;
		this.showTime = showTime;
	}

	public MovieShow() {
		super();
		// TODO Auto-generated constructor stub
	}

	public long getShowId() {
		return showId;
	}

	public void setShowId(long showId) {
		this.showId = showId;
	}

	public String getMovieId() {
		return movieId;
	}

	public void setMovieId(String movieId) {
		this.movieId = movieId;
	}

	public String getMovieName() {
		return movieName;
	}

	public void setMovieName(String movieName) {
		this.movieName = movieName;
	}

	public String getShowTime() {
		return showTime;
	}

	public void setShowTime(String showTime) {
		this.showTime = showTime;
	}
	
	

	
}
