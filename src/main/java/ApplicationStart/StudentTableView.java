package ApplicationStart;

import javafx.beans.property.*;

public class StudentTableView {

    private SimpleStringProperty name;
    private SimpleStringProperty middle_name;
    private SimpleStringProperty family_name;
    private SimpleStringProperty email;
    private SimpleStringProperty password;
    private SimpleStringProperty faculty_number;
    private SimpleIntegerProperty groupp;
    private SimpleDoubleProperty average_grade;
    private SimpleIntegerProperty major_Id;


    public StudentTableView(String name,
                            String middleName,
                            String familyName,
                            String email,
                            String password,
                            String facultyNumber,
                            int group,
                            double averageGrade,
                            int majorId
                            ) {
        this.name = new SimpleStringProperty(name);
        this.middle_name = new SimpleStringProperty(middleName);
        this.family_name = new SimpleStringProperty(familyName);
        this.email = new SimpleStringProperty(email);
        this.password = new SimpleStringProperty(password);
        this.faculty_number = new SimpleStringProperty(facultyNumber);
        this.groupp = new SimpleIntegerProperty(group);
        this.average_grade = new SimpleDoubleProperty(averageGrade);
        this.major_Id = new SimpleIntegerProperty(majorId);
    }

    public String getName() {
        return name.get();
    }

    public void setName(String name) {
        this.name.set(name);
    }

    public String getMiddle_name() {
        return middle_name.get();
    }

    public SimpleStringProperty middle_nameProperty() {
        return middle_name;
    }

    public void setMiddle_name(String middle_name) {
        this.middle_name.set(middle_name);
    }

    public String getFamily_name() {
        return family_name.get();
    }

    public SimpleStringProperty family_nameProperty() {
        return family_name;
    }

    public void setFamily_name(String family_name) {
        this.family_name.set(family_name);
    }

    public String getEmail() {
        return email.get();
    }

    public void setEmail(String email) {
        this.email.set(email);
    }

    public String getPassword(){
        return password.get();
    }

    public void setPassword(String password){
        this.password.set(password);
    }

    public String getFaculty_number() {
        return faculty_number.get();
    }

    public SimpleStringProperty faculty_numberProperty() {
        return faculty_number;
    }

    public void setFaculty_number(String faculty_number) {
        this.faculty_number.set(faculty_number);
    }

    public int getGroupp() {
        return groupp.get();
    }

    public SimpleIntegerProperty grouppProperty() {
        return groupp;
    }

    public void setGroupp(int groupp) {
        this.groupp.set(groupp);
    }

    public double getAverage_grade() {
        return average_grade.get();
    }

    public SimpleDoubleProperty average_gradeProperty() {
        return average_grade;
    }

    public void setAverage_grade(double average_grade) {
        this.average_grade.set(average_grade);
    }

    public int getMajor_Id() {
        return major_Id.get();
    }

    public SimpleIntegerProperty major_IdProperty() {
        return major_Id;
    }

    public void setMajor_Id(int major_Id) {
        this.major_Id.set(major_Id);
    }

    public StringProperty nameProperty() {return name;}
    public StringProperty middleNameProperty() {return middle_name;}
    public StringProperty familyNameProperty() {return family_name;}
    public StringProperty emailProperty() {return email;}
    public StringProperty facultyNumberProperty() {return faculty_number;}
    public IntegerProperty groupProperty() {return groupp;}
    public IntegerProperty majorIdProperty() {return major_Id;}
    public DoubleProperty averageGradeProperty() {return average_grade;}
}
