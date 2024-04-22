package io.nishant.jee.firstmavenproject;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Student stud=new Student();
        stud.setRoll(2);
        stud.setName("Kaushal");
        stud.setMarks(90);
        
        Configuration config= new Configuration().configure().addAnnotatedClass(Student.class);
        SessionFactory sf = config.buildSessionFactory();
        Session session = sf.openSession();
        Transaction tx = session.beginTransaction();
        
        session.save(stud);
        
        tx.commit();
        
    }
}
