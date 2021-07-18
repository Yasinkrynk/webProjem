package com.web.uygulama.restApi;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.web.uygulama.Business.IMoviesService;
import com.web.uygulama.Entities.Movies;

@RestController
@RequestMapping("/uygulama")
public class MoviesController {
	private IMoviesService moviesService;
	
	@Autowired
	public MoviesController(IMoviesService moviesService) {
		super();
		this.moviesService = moviesService;
	}
	
	@GetMapping("/movies")
	public List<Movies> get(){
		return moviesService.getAll();
	}
	
	@PostMapping("/add")
	public void add(@RequestBody Movies movies) {
		this.moviesService.add(movies);
	}
	@PostMapping("/update")
	public void update(@RequestBody Movies movies) {
		this.moviesService.update(movies);
	}
	@PostMapping("/delete")
	public void delete(@RequestBody Movies movies) {
		this.moviesService.delete(movies);
	}
	
	@GetMapping("/movies/{id}")
	public Movies getById(@PathVariable int id){
		return moviesService.getById(id);
	}
	@GetMapping("/movies/searchname/{name}")
	public List<Movies> get2(@PathVariable String name){
		return moviesService.getByName(name);
	}
	@GetMapping("/movies/searchplayer/{player}")
	public List<Movies> get3(@PathVariable String player){
		return moviesService.getByPlayer(player);
	}
	@GetMapping("/movies/searchtype/{type}")
	public List<Movies> get4(@PathVariable String type){
		return moviesService.getByType(type);
	}
	@GetMapping("/movies/order")
	public List<Movies> get5(){
		return moviesService.getByYear();
	}
}
