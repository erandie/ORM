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

//        //save student
//        FullName fullName = new FullName("sd", "fds");
//        Student student = new Student();
//        student.setId(4);
//        student.setName(fullName);
//        student.setAddress("sa");
//        //open transaction
//        Transaction transaction = session.beginTransaction();
//        session.save(student);
//        transaction.commit();
//        session.close();

//        //Update student
//        FullName fullName = new FullName("Hansi", "Erandi");
//        Student student = new Student();
//        student.setId(1);
//        student.setName(fullName);
//        student.setAddress("Kandy");
//        //open transaction
//        Transaction transaction = session.beginTransaction();
//        session.update(student);
//        transaction.commit();
//        session.close();

//        //Delete student
//        Student student = new Student();
//        student.setId(4);
//        //open transaction
//        Transaction transaction = session.beginTransaction();
//        session.delete(student);
//        transaction.commit();
//        session.close();

        //get Student
//        Student student = session.get(Student.class, 01);
//        Transaction transaction = session.beginTransaction();
//        transaction.commit();
//        session.close();
//
//        // Display the retrieved student's details
//        if (student != null) {
//            System.out.println("Student ID: " + student.getId());
//            System.out.println("Student Name: " + student.getName());
//            System.out.println("Student Address: " + student.getAddress());
//        } else {
//            System.out.println("Student not found");
//        }

//        //save teachers
//        FullName fullName = new FullName("sd", "fds");
//        Teachers teachers = new Teachers();
//        teachers.setId(3);
//        teachers.setName(fullName);
//        teachers.setAddress("sa");
//        //open transaction
//        Transaction transaction = session.beginTransaction();
//        session.save(teachers);
//        transaction.commit();
//        session.close();

//        //Update teachers
//        FullName fullName = new FullName("sd", "fds");
//        Teachers teachers = new Teachers();
//        teachers.setId(1);
//        teachers.setName(fullName);
//        teachers.setAddress("sa");
//        //open transaction
//        Transaction transaction = session.beginTransaction();
//        session.update(teachers);
//        transaction.commit();
//        session.close();

//        //delete teachers
//        Teachers teachers = new Teachers();
//        teachers.setId(1);
//        //open transaction
//        Transaction transaction = session.beginTransaction();
//        session.delete(teachers);
//        transaction.commit();
//        session.close();
//   }
//        //get Teachers
        Teachers teachers = session.get(Teachers.class, 01);
        Transaction transaction = session.beginTransaction();
        transaction.commit();
        session.close();

        // Display the retrieved student's details
        if (teachers != null) {
            System.out.println("Teachers ID: " + teachers.getId());
            System.out.println("Teachers Name: " + teachers.getName());
            System.out.println("Teachers Address: " + teachers.getAddress());
        } else {
            System.out.println("Teacher not found");
        }
    }
}

