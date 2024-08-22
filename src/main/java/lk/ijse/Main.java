package lk.ijse;

import lk.ijse.config.FactoryConfiguration;
import lk.ijse.embed.FullName;
import lk.ijse.entity.Student;
import lk.ijse.entity.Teachers;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class Main {
    public static void main(String[] args) {
        Session session = FactoryConfiguration.getInstance().getSession();

        FullName fullName1 = new FullName("Hansi", "Erandi");
        FullName fullName2 = new FullName("Erandi", "Gamage");

        Student student = new Student();
        student.setId(4);
        student.setName(fullName1);
        student.setAddress("Kandy");

//        Teachers teachers = new Teachers();
//        teachers.setId(2);
//        teachers.setName(fullName2);
//        teachers.setAddress("Kandy");

        Transaction transaction = session.beginTransaction();
        session.save(student);
//        session.update(student);
//        session.delete("1", student);
//        Student student1 = session.get(Student.class,1);
//        System.out.println(student1.toString());

//        session.save(teachers);
//        session.update(teachers);
//          session.delete("2", teachers);
//        Teachers teachers1 = session.get(Teachers.class,1);
//        System.out.println(teachers1.toString());
//
        transaction.commit();
        session.close();

    }
}