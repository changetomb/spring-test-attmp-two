package com.example.springtestattmptwo.dao;

import com.example.springtestattmptwo.model.Person;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.logging.Logger;

@Service
public class PersonService {


    @Autowired
    private SessionFactory sessionFactory;


    public void save(Person person) {
        try (Session session = getSession()) {

            session.save(person);
        }
    }

    public List<Person> findAll() {
        List<Person> from_person_;
        try (Session session = getSession();) {
            from_person_ = session.createQuery("from Person ").getResultList();
        }
        return from_person_;
    }

    public void delete(Person person) {
        try (Session session = getSession();) {

            session.getTransaction().begin();
            session.delete(person);
            session.getTransaction().commit();

        }
    }


    public Person getPerson(int id) {
        return getSession().find(Person.class, id);
    }



    public void updatePerson(Person person) {

        try (Session session = getSession();) {

            session.getTransaction().begin();
            session.update(person);
            session.getTransaction().commit();

        }
    }


    public Session getSession() {
        Session session;

        try {
            session = sessionFactory.getCurrentSession();
        } catch (HibernateException e) {
            session = sessionFactory.openSession();
        }
        if (session != null)
            return session;
        else
            return sessionFactory.openSession();
    }
}

