package entity;
import jakarta.persistence.*;

import java.util.Objects;
@Entity
@Table(name = "grades")
public class Student_grade {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private double grade;
    private int student_id;
    private int subject_id;

    public Student_grade(double grade, int student_id, int subject_id) {

        this.grade = grade;
        this.student_id = student_id;
        this.subject_id = subject_id;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getGrade() {
        return grade;
    }

    public void setGrade(double grade) {
        this.grade = grade;
    }

    public int getStudent_id() {
        return student_id;
    }

    public void setStudent_id(int student_id) {
        this.student_id = student_id;
    }

    public int getSubject_id() {
        return subject_id;
    }

    public void setSubject_id(int subject_id) {
        this.subject_id = subject_id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student_grade that = (Student_grade) o;
        return getId() == that.getId() && Double.compare(that.getGrade(), getGrade()) == 0 && getStudent_id() == that.getStudent_id() && getSubject_id() == that.getSubject_id();
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId(), getGrade(), getStudent_id(), getSubject_id());
    }

    @Override
    public String toString() {
        return "Student_grade{" +
                "id=" + id +
                ", grade=" + grade +
                ", student_id=" + student_id +
                ", subject_id=" + subject_id +
                '}';
    }
}
