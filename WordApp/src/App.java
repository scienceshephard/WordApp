import java.io.IOException;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class App extends Application{

    private Parent createContent() throws IOException{
        return FXMLLoader.load(getClass().getResource("word.fxml"));
    }

    @Override
    public void start(Stage stage) throws Exception {
        Scene scene= new Scene(createContent());
        stage.setScene(scene);
        stage.setTitle("Shephard Editor");
        stage.show();
        
    }
    public static void main(String[] args) throws Exception {
        launch(args);
    }
}
