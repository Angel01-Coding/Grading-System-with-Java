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
    @ManyToOne
    private Student student;
    @ManyToOne
    private Subject subject;

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

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    public Subject getSubject() {
        return subject;
    }

    public void setSubject(Subject subject) {
        this.subject = subject;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student_grade that = (Student_grade) o;
        return getId() == that.getId() && Double.compare(that.getGrade(), getGrade()) == 0 && getStudent() == that.getStudent() && getSubject() == that.getSubject();
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId(), getGrade(), getStudent(), getSubject());
    }

    @Override
    public String toString() {
        return "Student_grade{" +
                "id=" + id +
                ", grade=" + grade +
                ", student=" + student +
                ", subject=" + subject +
                '}';
    }
}
