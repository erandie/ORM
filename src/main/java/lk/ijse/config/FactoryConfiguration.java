package lk.ijse.config;

import lk.ijse.entity.Student;
import lk.ijse.entity.Teachers;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class FactoryConfiguration {
    private static FactoryConfiguration factoryConfiguration;

    private SessionFactory sessionFactory;

    private FactoryConfiguration(){
        Configuration configuration = new Configuration().configure().addAnnotatedClass(Student.class);
        Configuration configurations = new Configuration().configure().addAnnotatedClass(Teachers.class);
        sessionFactory = configuration.buildSessionFactory();
        sessionFactory = configurations.buildSessionFactory();
    }

    public static FactoryConfiguration getInstance(){
        return (factoryConfiguration==null)?factoryConfiguration=
                new FactoryConfiguration():factoryConfiguration;
    }

    public Session getSession(){
        return sessionFactory.openSession();
    }
}
