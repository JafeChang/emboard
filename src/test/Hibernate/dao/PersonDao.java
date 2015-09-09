package test.Hibernate.dao;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.junit.Test;

import test.Hibernate.SessionFactory.SessionFactory;
import test.Hibernate.model.Person;

public class PersonDao {
    @Test
    public void add(){
        Session session = SessionFactory.getSession();
        Transaction tr = session.beginTransaction();
        //----------------------------------------------
        
        Person p = new Person();
        p.setName("test");
        p.getAddress().add("firstAddr");
        p.getAddress().add("secondAddr");
        p.getAddress().add("thirdAddr");
        p.getAddress().add("fourthAddr");        
        session.save(p);
        
        //----------------------------------------------
        tr.commit();
        SessionFactory.closeSession();
        
    }
    
    @Test
    public void get(){
        Session session = SessionFactory.getSession();
        Transaction tr = session.beginTransaction();
        //----------------------------------------------
        
        Person p = (Person)session.get(Person.class, 2);
        System.out.println(p);
        
        //----------------------------------------------
        tr.commit();
        SessionFactory.closeSession();
    }
}