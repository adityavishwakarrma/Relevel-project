package com.relevel.bookmyshowclone.persistence;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.relevel.bookmyshowclone.domain.MovieShow;

@Repository
public interface ShowRepo extends JpaRepository<MovieShow, Long> {
	
	public List<MovieShow> findByMovieName(String movieName);
}
