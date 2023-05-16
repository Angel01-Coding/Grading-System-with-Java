package services;

import entity.Student;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

import java.util.List;

public class StudentService {
    private final SessionFactory sessionFactory;

    public StudentService() {
        try {
            StandardServiceRegistry standardRegistry
                    = new StandardServiceRegistryBuilder()
                    .configure()
                    .build();

            Metadata metadata = new MetadataSources(standardRegistry)
                    .getMetadataBuilder()
                    .build();

            sessionFactory = metadata.getSessionFactoryBuilder().build();

        } catch (Throwable ex) {
            throw new ExceptionInInitializerError(ex);
        }
    }

    public List<Student> getAllStudents() {

        Session session = sessionFactory.openSession();
        List<Student> result = session.createQuery("select u from Student u", Student.class).list();
        return result;
    }

    public Student searchStudentById(int studentId){

        Session session = sessionFactory.openSession();
        Student student = session.createQuery("select u from Student u where u.id=:studentId",
                Student.class).setParameter("studentId", studentId)
                .getSingleResult();
        return student;
    }
}

