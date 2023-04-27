package entity;

import jakarta.persistence.*;

import java.util.Objects;

@Entity
@Table(name = "student")
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;
    private String middle_name;
    private String family_name;
    private String email;
    private String password;
    private String faculty_number;
    private int groupp;
    private double average_grade;
    private int major_id;

    public Student(String name,
                   String middleName,
                   String familyName,
                   String email,
                   String password,
                   String facultyNum,
                   int groupNum,
                   double averageGrade,
                   int idMajor) {

        this.name = name;
        this.middle_name = middleName;
        this.family_name = familyName;
        this.email = email;
        this.password = password;
        this.faculty_number = facultyNum;
        this.groupp = groupNum;
        this.average_grade = averageGrade;
        this.major_id = idMajor;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMiddleName() {
        return middle_name;
    }

    public void setMiddleName(String middleName) {
        this.middle_name = middleName;
    }

    public String getFamilyName() {
        return family_name;
    }

    public void setFamilyName(String familyName) {
        this.family_name = familyName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getFacultyNum() {
        return faculty_number;
    }

    public void setFacultyNum(String facultyNum) {
        this.faculty_number = facultyNum;
    }

    public int getGroupNum() {
        return groupp;
    }

    public void setGroupNum(int groupNum) {
        this.groupp = groupNum;
    }

    public double getAverageGrade() {
        return average_grade;
    }

    public void setAverageGrade(double averageGrade) {
        this.average_grade = averageGrade;
    }

    public int getIdMajor() {
        return major_id;
    }

    public void setIdMajor(int idMajor) {
        this.major_id = idMajor;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return getId() == student.getId() && getGroupNum() == student.getGroupNum() && Double.compare(student.average_grade, average_grade) == 0 && major_id == student.major_id && getName().equals(student.getName()) && middle_name.equals(student.middle_name) && family_name.equals(student.family_name) && getEmail().equals(student.getEmail()) && getPassword().equals(student.getPassword()) && faculty_number.equals(student.faculty_number);
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId(),
                getName(),
                getMiddleName(),
                getFamilyName(),
                getEmail(),
                getPassword(),
                getFacultyNum(),
                getGroupNum(),
                getAverageGrade(),
                getIdMajor());
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", middleName='" + middle_name + '\'' +
                ", familyName='" + family_name + '\'' +
                ", email='" + email + '\'' +
                ", password='" + password + '\'' +
                ", facultyNum='" + faculty_number + '\'' +
                ", groupNum=" + groupp +
                ", averageGrade=" + average_grade +
                ", idMajor=" + major_id +
                '}';
    }
}
