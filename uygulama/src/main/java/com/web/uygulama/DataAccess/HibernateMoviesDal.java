package com.web.uygulama.DataAccess;

import java.util.List;

import javax.persistence.EntityManager;

import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.web.uygulama.Entities.Movies;

@Repository //It is a marker for any class that fulfils the role or stereotype of a repository 
public class HibernateMoviesDal implements IMoviesDal{

	private EntityManager entityManager;
	@Autowired
	public HibernateMoviesDal(EntityManager entityManager) {
		super();
		this.entityManager = entityManager;
	}

	@Override
	@Transactional
	public List<Movies> getAll() {
		Session session=entityManager.unwrap(Session.class);
		List<Movies> movie=session.createQuery("from Movies",Movies.class).getResultList();
		return movie;
	}

	@Override
	public void add(Movies movies) {
		Session session=entityManager.unwrap(Session.class);
		session.saveOrUpdate(movies);
	}

	@Override
	public void update(Movies movies) {
		Session session=entityManager.unwrap(Session.class);
		session.saveOrUpdate(movies);
	}

	@Override
	public void delete(Movies movies) {
		Session session=entityManager.unwrap(Session.class);
		Movies movieToDelete=session.get(Movies.class, movies.getId());
		session.delete(movieToDelete);
	}

	@Override
	public Movies getById(int id) {
		Session session=entityManager.unwrap(Session.class);
		Movies city=session.get(Movies.class, id);
		return city;
	}

	@Override
	@Transactional
	public List<Movies> getByName(String name) {
		Session session=entityManager.unwrap(Session.class);
		List<Movies> movie=session.createQuery("from Movies where name='"+name+"'",Movies.class).getResultList();
		return movie;
	}


	@Override
	@Transactional
	public List<Movies> getByPlayer(String player) {
		Session session=entityManager.unwrap(Session.class);
		List<Movies> movie=session.createQuery("from Movies where player='"+player
				+"' OR player2='"+player+"' OR player3='"+player+"'",
				Movies.class).getResultList();
		return movie;
	}

	@Override
	@Transactional
	public List<Movies> getByType(String type) {
		Session session=entityManager.unwrap(Session.class);
		List<Movies> movie=session.createQuery("from Movies where type='"+type+"'",Movies.class).getResultList();
		return movie;
	}


	@Override
	@Transactional
	public List<Movies> getByYear() {
		Session session=entityManager.unwrap(Session.class);
		List<Movies> movie=session.createQuery("from Movies ORDER BY Year ASC",Movies.class).getResultList();
		return movie;
	}

}
