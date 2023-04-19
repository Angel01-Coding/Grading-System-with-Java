import Users.Teacher;
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
    void firstTestForMappingObject() {

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
}
