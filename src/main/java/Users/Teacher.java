package Users;

import jakarta.persistence.*;

import java.util.Objects;

@Entity
@Table(name = "teacher")
public class Teacher {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;
    private String middle_name;
    private String family_name;
    private String email;
    private String password;
    private String ranks;
    private int subject_id;

    public Teacher(String name,
                   String middle_name,
                   String family_name,
                   String email,
                   String password,
                   String ranks,
                   int subject_id) {

        this.name = name;
        this.middle_name = middle_name;
        this.family_name = family_name;
        this.email = email;
        this.password = password;
        this.ranks = ranks;
        this.subject_id = subject_id;
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

    public String getMiddle_name() {
        return middle_name;
    }

    public void setMiddle_name(String middle_name) {
        this.middle_name = middle_name;
    }

    public String getFamily_name() {
        return family_name;
    }

    public void setFamily_name(String family_name) {
        this.family_name = family_name;
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

    public String getRanks() {
        return ranks;
    }

    public void setRanks(String ranks) {
        this.ranks = ranks;
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
        Teacher teacher = (Teacher) o;
        return getId() == teacher.getId() && getSubject_id() == teacher.getSubject_id() && getName().equals(teacher.getName()) && getMiddle_name().equals(teacher.getMiddle_name()) && getFamily_name().equals(teacher.getFamily_name()) && getEmail().equals(teacher.getEmail()) && getPassword().equals(teacher.getPassword()) && Objects.equals(getRanks(), teacher.getRanks());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId(), getName(), getMiddle_name(), getFamily_name(), getEmail(), getPassword(), getRanks(), getSubject_id());
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", middle_name='" + middle_name + '\'' +
                ", family_name='" + family_name + '\'' +
                ", email='" + email + '\''+
                ", ranks='" + ranks + '\'' +
                ", idSubject=" + subject_id +
                '}';
    }
}
