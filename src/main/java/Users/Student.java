package Users;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import org.hibernate.annotations.Table;

@Entity
@Table(appliesTo = "student")
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;
    private String middleName;
    private String familyName;
    private String email;
    private String password;
    private int facultyNum;
    private int groupNum;
    private double averageGrade;
    private int idMajor;

    public Student(int id,
                   String name,
                   String middleName,
                   String familyName,
                   String email,
                   String password,
                   int facultyNum,
                   int groupNum,
                   double averageGrade,
                   int idMajor) {

        this.id = id;
        this.name = name;
        this.middleName = middleName;
        this.familyName = familyName;
        this.email = email;
        this.password = password;
        this.facultyNum = facultyNum;
        this.groupNum = groupNum;
        this.averageGrade = averageGrade;
        this.idMajor = idMajor;
    }


}
