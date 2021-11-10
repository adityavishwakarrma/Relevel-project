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
@Table(name="movie")
public class Movie {
    
		//movie id is auto generated we don't have to pass movieId in movie object
		@Id
		@GeneratedValue(strategy = GenerationType.AUTO)
		private Long MovieId;
		
		private String movieName;
		
		
		private String description;
		
		private String castOfMovie;

		public Movie(Long movieId, String movieName, String description, String castOfMovie) {
			super();
			MovieId = movieId;
			this.movieName = movieName;
			this.description = description;
			this.castOfMovie = castOfMovie;
		}

		public Movie() {
			super();
			// TODO Auto-generated constructor stub
		}

		public Long getMovieId() {
			return MovieId;
		}

		public void setMovieId(Long movieId) {
			MovieId = movieId;
		}

		public String getMovieName() {
			return movieName;
		}

		public void setMovieName(String movieName) {
			this.movieName = movieName;
		}

		public String getDescription() {
			return description;
		}

		public void setDescription(String description) {
			this.description = description;
		}

		public String getCastOfMovie() {
			return castOfMovie;
		}

		public void setCastOfMovie(String castOfMovie) {
			this.castOfMovie = castOfMovie;
		}
		
		
		 
}
