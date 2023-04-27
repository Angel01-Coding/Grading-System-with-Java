import entity.Student;
import entity.Teacher;
import entity.*;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class mappingTest {

    private SessionFactory sessionFactory;

    @BeforeEach
    protected void setUp() throws Exception {

        try {
            if (sessionFactory == null) {
                StandardServiceRegistry standardRegistry
                        = new StandardServiceRegistryBuilder()
                        .configure()
                        .build();

                Metadata metadata = new MetadataSources(standardRegistry)
                        .getMetadataBuilder()
                        .build();

                sessionFactory = metadata.getSessionFactoryBuilder().build();
            }
        } catch (Throwable ex) {
            throw new ExceptionInInitializerError(ex);
        }
    }

    @AfterEach
    protected void tearDown() throws Exception {
        if ( sessionFactory != null ) {
            sessionFactory.close();
        }
    }

    @Test
    void firstTestForMappingObjectTeacher() {

        Teacher teacher = new Teacher("Angel"
                , "Ivelinov"
                , "Grigorov"
                , "testEmail24@gmail.com"
                , "testPassword24"
                , "Professor"
                , 5);

        try (Session session = sessionFactory.openSession()) {
            session.beginTransaction();

            session.persist(teacher);
            assertNotNull(session.get(Teacher.class, teacher.getId()));
            session.getTransaction().rollback();


        } catch (HibernateException e) {
            throw new RuntimeException(e);
        }
    }

    @Test
    void secondTestForMappingStudent(){

        Student student = new Student("Petar"
                , "Evelinov"
                , "Atanasov"
                , "testEmail@gmail88.com"
                ,"testPassword2357"
                , "206213998"
                , 1
                , 5.65
                , 1);

        try (Session session = sessionFactory.openSession()) {
            session.beginTransaction();

            session.persist(student);
            assertNotNull(session.get(Student.class, student.getId()));
            session.getTransaction();


        } catch (HibernateException e) {
            throw new RuntimeException(e);
        }
    }

    @Test
    void testMappingObjectSubjectt(){

        Subject subject = new Subject("Mathematics", 1);

        try (Session session = sessionFactory.openSession()) {
            session.beginTransaction();

            session.persist(subject);
            assertNotNull(session.get(Subject.class, subject.getId()));
            session.getTransaction().rollback();


        } catch (HibernateException e) {
            throw new RuntimeException(e);
        }
    }

    @Test
    void testMappingObjectDepartment(){

        Department dep = new Department("Power engineeringg",2);

        try (Session session = sessionFactory.openSession()) {
            session.beginTransaction();

            session.persist(dep);
            assertNotNull(session.get(Department.class, dep.getId()));
            session.getTransaction();


        } catch (HibernateException e) {
            throw new RuntimeException(e);
        }
    }

    @Test
    void testMappingObjectFaculty(){

        Faculty fac = new Faculty("Computer science");

        try (Session session = sessionFactory.openSession()) {
            session.beginTransaction();

            session.persist(fac);
            assertNotNull(session.get(Faculty.class, fac.getId()));
            session.getTransaction();


        } catch (HibernateException e) {
            throw new RuntimeException(e);
        }
    }

    @Test
    void testMappingObjectStudentGrade(){

        Student_grade grade = new Student_grade(4.56, 1, 2);

        try (Session session = sessionFactory.openSession()) {
            session.beginTransaction();

            session.persist(grade);
            assertNotNull(session.get(Student_grade.class, grade.getId()));
            session.getTransaction();


        } catch (HibernateException e) {
            throw new RuntimeException(e);
        }
    }

    @Test
    void testMappingObjectMajor(){

        Major major = new Major("Navigation and Shipbuilding", 7);

        try (Session session = sessionFactory.openSession()) {
            session.beginTransaction();

            session.persist(major);
            assertNotNull(session.get(Major.class, major.getId()));
            session.getTransaction();


        } catch (HibernateException e) {
            throw new RuntimeException(e);
        }
    }
}
