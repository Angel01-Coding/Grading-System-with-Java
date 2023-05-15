package ApplicationStart;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;

import java.net.URL;
import java.util.ResourceBundle;

public class Controller implements Initializable {
    public TableView<ProductStudentTableView> tableview;
    public TableColumn<ProductStudentTableView, String> colName;
    public TableColumn<ProductStudentTableView, String> colMiddleName;
    public TableColumn<ProductStudentTableView, String> colFamilyName;
    public TableColumn<ProductStudentTableView, String> colEmail;
    public TableColumn<ProductStudentTableView, String> colFacultyNumber;
    public TableColumn<ProductStudentTableView, Integer> colGroup;
    public TableColumn<ProductStudentTableView, Integer> colMajorID;
    public TableColumn<ProductStudentTableView, Double> colAverageGrade;

    @FXML
    private Label welcomeText;

    @FXML
    protected void onWelcomeButtonClick(){

        welcomeText.setText("Welcome to the best grading system!");
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

        colName.setCellValueFactory(new PropertyValueFactory<>("Name"));
        colMiddleName.setCellValueFactory(new PropertyValueFactory<>("MiddleName"));
        colFamilyName.setCellValueFactory(new PropertyValueFactory<>("FamilyName"));
        colEmail.setCellValueFactory(new PropertyValueFactory<>("Email"));
        colFacultyNumber.setCellValueFactory(new PropertyValueFactory<>("FacultyNumber"));
        colGroup.setCellValueFactory(new PropertyValueFactory<>("Group"));
        colMajorID.setCellValueFactory(new PropertyValueFactory<>("MajorId"));
    }
}
