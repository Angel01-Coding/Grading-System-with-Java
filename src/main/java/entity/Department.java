package entity;

import jakarta.persistence.*;

import java.util.Objects;
@Entity
@Table(name = "department")
public class Department {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;
    private int faculty_id;

    public Department(String name, int idFaculty) {

        this.name = name;
        this.faculty_id = idFaculty;
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

    public int getIdFaculty() {
        return faculty_id;
    }

    public void setIdFaculty(int idFaculty) {
        this.faculty_id = idFaculty;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Department that = (Department) o;
        return getId() == that.getId() && getIdFaculty() == that.getIdFaculty() && getName().equals(that.getName());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId(), getName(), getIdFaculty());
    }

    @Override
    public String toString() {
        return "Department{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", idFaculty=" + faculty_id +
                '}';
    }
}
