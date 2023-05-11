package ApplicationStart;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
public class Controller {

    @FXML
    private Label welcomeText;

    @FXML
    protected void onWelcomeButtonClick(){
        welcomeText.setText("Welcome to the best grading system!");
    }
}
