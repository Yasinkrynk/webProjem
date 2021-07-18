package com.web.uygulama.Business;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.web.uygulama.DataAccess.IMoviesDal;
import com.web.uygulama.Entities.Movies;
@Service
public class MoviesManager implements IMoviesService{
	
	private IMoviesDal moviesDal;
	@Autowired
	public MoviesManager(IMoviesDal moviesDal) {
		super();
		this.moviesDal = moviesDal;
	}

	@Override
	@Transactional
	public List<Movies> getAll() {
		return this.moviesDal.getAll();
	}

	@Override
	@Transactional
	public void add(Movies movies) {
		this.moviesDal.add(movies);
	}

	@Override
	@Transactional
	public void update(Movies movies) {
		this.moviesDal.update(movies);
		
	}

	@Override
	@Transactional
	public void delete(Movies movies) {
		this.moviesDal.delete(movies);
	}

	@Override
	@Transactional
	public Movies getById(int id) {
		return this.moviesDal.getById(id);
	}

	@Override
	@Transactional
	public List<Movies> getByName(String name) {
		return this.moviesDal.getByName(name);
	}


	@Override
	@Transactional
	public List<Movies> getByPlayer(String player) {
		return this.moviesDal.getByPlayer(player);
	}

	@Override
	@Transactional
	public List<Movies> getByType(String type) {
		return this.moviesDal.getByType(type);
	}

	@Override
	@Transactional
	public List<Movies> getByYear() {
		return this.moviesDal.getByYear();
	}
	
}
