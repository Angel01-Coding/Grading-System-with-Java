package ApplicationStart;

import javafx.beans.property.SimpleDoubleProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;

public class ProductStudentTableView {

    private SimpleStringProperty name;
    private SimpleStringProperty middleName;
    private SimpleStringProperty familyName;
    private SimpleStringProperty email;
    private SimpleStringProperty facultyNumber;
    private SimpleIntegerProperty group;
    private SimpleIntegerProperty majorId;
    private SimpleDoubleProperty averageGrade;

    public ProductStudentTableView(String name,
                                   String middleName,
                                   String familyName,
                                   String email,
                                   String facultyNumber,
                                   int group,
                                   int majorId,
                                   double averageGrade) {
        this.name = new SimpleStringProperty(name);
        this.middleName = new SimpleStringProperty(middleName);
        this.familyName = new SimpleStringProperty(familyName);
        this.email = new SimpleStringProperty(email);
        this.facultyNumber = new SimpleStringProperty(facultyNumber);
        this.group = new SimpleIntegerProperty(group);
        this.majorId = new SimpleIntegerProperty(majorId);
        this.averageGrade = new SimpleDoubleProperty(averageGrade);
    }

    public String getName() {
        return name.get();
    }

    public void setName(String name) {
        this.name = new SimpleStringProperty(name);
    }

    public String getMiddleName() {
        return middleName.get();
    }

    public void setMiddleName(String middleName) {
        this.middleName = new SimpleStringProperty(middleName);
    }

    public String getFamilyName() {
        return familyName.get();
    }

    public void setFamilyName(String familyName) {
        this.familyName = new SimpleStringProperty(familyName);
    }

    public String getEmail() {
        return email.get();
    }

    public void setEmail(String email) {
        this.email = new SimpleStringProperty(email);
    }

    public String getFacultyNumber() {
        return facultyNumber.get();
    }

    public void setFacultyNumber(String facultyNumber) {
        this.facultyNumber = new SimpleStringProperty(facultyNumber);
    }

    public int getGroup() {
        return group.get();
    }

    public void setGroup(int group) {
        this.group = new SimpleIntegerProperty(group);
    }

    public int getMajorId() {
        return majorId.get();
    }

    public void setMajorId(int majorId) {
        this.majorId = new SimpleIntegerProperty(majorId);
    }

    public double getAverageGrade(){
        return averageGrade.get();
    }

    public void setAverageGrade(double averageGrade){
        this.averageGrade = new SimpleDoubleProperty(averageGrade);
    }
}
