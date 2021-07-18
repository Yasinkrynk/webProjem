package com.web.uygulama.DataAccess;

import java.util.List;

import com.web.uygulama.Entities.Movies;

public interface IMoviesDal {
	List<Movies> getAll();
	void add(Movies movies);
	void update(Movies movies);
	void delete(Movies movies);
	Movies getById(int id);
	List<Movies> getByName(String name);
	List<Movies> getByPlayer(String player);
	List<Movies> getByType(String type);
	List<Movies> getByYear();
}
