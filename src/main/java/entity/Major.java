package entity;

import jakarta.persistence.*;

import java.util.Objects;
@Entity
@Table(name = "major")
public class Major {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;
    private int department_id;

    public Major(String name, int department_id) {

        this.name = name;
        this.department_id = department_id;
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

    public int getDepartment_id() {
        return department_id;
    }

    public void setDepartment_id(int department_id) {
        this.department_id = department_id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Major major = (Major) o;
        return getId() == major.getId() && getDepartment_id() == major.getDepartment_id() && getName().equals(major.getName());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId(), getName(), getDepartment_id());
    }

    @Override
    public String toString() {
        return "Major{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", department_id=" + department_id +
                '}';
    }
}
