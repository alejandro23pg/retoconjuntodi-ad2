package com.example.retoconjuntodiad2.dao;

import com.example.retoconjuntodiad2.models.Copie;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;

import java.util.List;

public class CopieDAO implements DAO<Copie>{

    private static SessionFactory sessionFactory = null;

    public CopieDAO(SessionFactory sessionFactory){
        this.sessionFactory = sessionFactory;
    }

    @Override
    public List<Copie> findAll() {
        List<Copie> copies;
        try(Session session = sessionFactory.openSession()){
            Query<Copie> query = session.createQuery("from Copie", Copie.class);
            copies = query.list();
        }
        return copies;
    }

    @Override
    public Copie findById(Long id) {
        Copie copie;
        try(Session session = sessionFactory.openSession()){
            copie = session.get(Copie.class, id);
        }
        return copie;
    }

    @Override
    public void save(Copie copie) {
        sessionFactory.inTransaction(session -> session.persist(copie) );
    }

    @Override
    public void update(Copie copie) {
        sessionFactory.inTransaction(session -> session.merge(copie));
    }

    @Override
    public void delete(Copie copie) {
        sessionFactory.inTransaction(session -> session.remove(copie));
    }
}
