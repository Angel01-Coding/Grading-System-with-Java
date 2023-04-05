package Users;

public class Teacher {

    private int id;
    private String name;
    private String middle_name;
    private String family_name;
    private String email;
    private String password;
    private int idRank;
    private int idSubject;

    public Teacher(int id,
                   String name,
                   String middle_name,
                   String family_name,
                   String email,
                   String password,
                   int rank_id,
                   int subject_id) {

        this.id = id;
        this.name = name;
        this.middle_name = middle_name;
        this.family_name = family_name;
        this.email = email;
        this.password = password;
        this.idRank = rank_id;
        this.idSubject = subject_id;
    }
}
