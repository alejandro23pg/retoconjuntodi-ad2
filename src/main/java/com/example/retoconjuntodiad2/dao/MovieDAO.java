package com.example.retoconjuntodiad2.dao;

import com.example.retoconjuntodiad2.models.Movie;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;

import java.util.List;

public class MovieDAO implements DAO<Movie>{

    private SessionFactory sessionFactory = null;

    public MovieDAO(SessionFactory sessionFactory){
        this.sessionFactory = sessionFactory;
    }

    @Override
    public List<Movie> findAll() {
        List<Movie> movies;
        try(Session session = sessionFactory.openSession()){
            Query<Movie> query = session.createQuery("from Movie ", Movie.class);
            movies = query.list();
        }
        return movies;
    }

    @Override
    public Movie findById(Long id) {
        Movie movie;
        try(Session session = sessionFactory.openSession()){
            movie = session.get(Movie.class, id);
        }
        return movie;
    }

    @Override
    public void save(Movie movie) {
        sessionFactory.inTransaction(session -> session.persist(movie));
    }

    @Override
    public void update(Movie movie) {
        sessionFactory.inTransaction(session -> session.merge(movie));
    }

    @Override
    public void delete(Movie movie) {
        sessionFactory.inTransaction(session -> session.remove(movie));
    }
}
