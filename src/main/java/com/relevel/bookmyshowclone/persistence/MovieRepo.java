package com.relevel.bookmyshowclone.persistence;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.relevel.bookmyshowclone.domain.Movie;

@Repository
public interface MovieRepo extends JpaRepository<Movie, Long> {
	
	//here we defining called findByMovieName which takes movieName as argument and returns Movie object
	public Movie findByMovieName(String movieName);
}
