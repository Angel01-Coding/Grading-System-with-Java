package ApplicationStart;

import DbConnection.DbConnection;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;

import java.net.URL;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ResourceBundle;

public class Controller implements Initializable {
    @FXML
    private TableView<StudentTableView> tableview;
    @FXML
    private TableColumn<StudentTableView, String> colName;
    @FXML
    private TableColumn<StudentTableView, String> colMiddleName;
    @FXML
    private TableColumn<StudentTableView, String> colFamilyName;
    @FXML
    private TableColumn<StudentTableView, String> colEmail;
    @FXML
    private TableColumn<StudentTableView, String> colFacultyNumber;
    @FXML
    private TableColumn<StudentTableView, Integer> colGroup;
    @FXML
    private TableColumn<StudentTableView, Integer> colMajorID;
    @FXML
    private TableColumn<StudentTableView, Double> colAverageGrade;
    private ObservableList<StudentTableView> studentData;
    private DbConnection connection = null;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

        connection = new DbConnection();
    }
    @FXML
    public void loadDataFromDataBase(javafx.event.ActionEvent actionEvent) {
        try {
            Connection conn = connection.connect();
            studentData = FXCollections.observableArrayList();

            ResultSet resultSet = conn.createStatement().executeQuery("SELECT * FROM student");

            while (resultSet.next()) {

                studentData.add(new StudentTableView(resultSet.getString(2),
                        resultSet.getString(3),
                        resultSet.getString(4),
                        resultSet.getString(5),
                        resultSet.getString(6),
                        resultSet.getString(7),
                        resultSet.getInt(8),
                        resultSet.getDouble(9),
                        resultSet.getInt(10)));
            }
        } catch (SQLException ex) {
            System.out.println("Error" + ex);
        }

        colName.setCellValueFactory(new PropertyValueFactory<>("name"));
        colMiddleName.setCellValueFactory(new PropertyValueFactory<>("middle_name"));
        colFamilyName.setCellValueFactory(new PropertyValueFactory<>("family_name"));
        colEmail.setCellValueFactory(new PropertyValueFactory<>("email"));
        colFacultyNumber.setCellValueFactory(new PropertyValueFactory<>("faculty_number"));
        colGroup.setCellValueFactory(new PropertyValueFactory<>("groupp"));
        colAverageGrade.setCellValueFactory(new PropertyValueFactory<>("average_grade"));
        colMajorID.setCellValueFactory(new PropertyValueFactory<>("major_Id"));

        tableview.setItems(null);
        tableview.setItems(studentData);
    }

//    public void deleteStudents(ActionEvent actionEvent) {
//
//        ObservableList<StudentTableView>
//    }



    public void addStudents(){

    }
}

