package org.example;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Main {
    public static void main(String[] args) {
        Animal animal = new Animal();

        animal.setAge(2);
        animal.setName("Cat");
        animal.setTail(true);

        SessionFactory factory = new Configuration().configure().buildSessionFactory();
        Session session = factory.openSession();
        session.beginTransaction();
        session.persist(animal);
        session.getTransaction().commit();
        session.close();

    }
}