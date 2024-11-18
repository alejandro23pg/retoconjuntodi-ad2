package com.example.retoconjuntodiad2.dao;

import com.example.retoconjuntodiad2.models.User;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;

import java.util.List;

public class UserDAO implements DAO<User>{

    private static SessionFactory sessionFactory = null;
    public UserDAO (SessionFactory sessionFactory){
        this.sessionFactory = sessionFactory;
    }

    @Override
    public List<User> findAll() {
        List<User> usuarios;
        try(Session session = sessionFactory.openSession()){
            Query<User> query = session.createQuery("select u from User u", User.class);
            usuarios = query.list();
        }
        return usuarios;
    }

    @Override
    public User findById(Long id) {
        User usuario;
        try (Session session = sessionFactory.openSession()){
            usuario = session.get(User.class, id);
        }
        return usuario;
    }

    @Override
    public void save(User user) {
        sessionFactory.inTransaction(session -> session.persist(user));
    }

    @Override
    public void update(User user) {
        sessionFactory.inTransaction(session -> session.merge(user));
    }

    @Override
    public void delete(User user) {
        sessionFactory.inTransaction(session -> session.remove(user));
    }
}
