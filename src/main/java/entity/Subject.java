package entity;

import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Objects;

@Entity
@Table(name = "subjectt")
public class Subject {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;
    private int major_id;
    @OneToMany(mappedBy = "grade")
    private Collection<Student_grade> grades = new ArrayList<>();

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

    public int getMajor_id() {
        return major_id;
    }

    public void setMajor_id(int major_id) {
        this.major_id = major_id;
    }

    public Collection<Student_grade> getGrades() {
        return grades;
    }

    public void setGrades(Collection<Student_grade> grades) {
        this.grades = grades;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Subject subject = (Subject) o;
        return getId() == subject.getId() && getMajor_id() == subject.getMajor_id() && getName().equals(subject.getName());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId(), getName(), getMajor_id());
    }

    @Override
    public String toString() {
        return "Subject{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", major_id=" + major_id +
                '}';
    }
}
