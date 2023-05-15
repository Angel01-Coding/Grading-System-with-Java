package ApplicationStart;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;
import javafx.scene.image.Image;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class GradingSystem extends Application {
    public static void main(String[] args) {
        launch();
    }

    @Override
    public void start(Stage stage) throws IOException {

        FXMLLoader fxmlLoader = new FXMLLoader(GradingSystem.class.getResource("grading-system-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 320, 240);
        stage.setTitle("Grading system");
        stage.setWidth(750.0);
        stage.setHeight(500.0);
        stage.setScene(scene);

        InputStream stream = new FileInputStream("C:\\Users\\aatan\\OneDrive\\Desktop\\Grading system with Java\\Grading System\\src\\A+.jpg");
        Image image = new Image(stream);
        ImageView iv = new ImageView();
        iv.setImage(image);
        //imageView.setImage(image);
        stage.getIcons().add(image);

        stage.show();
    }
}