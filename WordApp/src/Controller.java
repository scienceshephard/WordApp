import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ComboBox;
import javafx.scene.control.MenuItem;
import javafx.scene.control.TextArea;
import javafx.scene.text.Font;
import java.net.URL;
import java.util.List;
import java.util.ResourceBundle;

public class Controller implements Initializable{
    @FXML
    private ComboBox<String> fami;
    @FXML
    private MenuItem newitem, openitem, saveitem, about, train;
    @FXML
    private TextArea txt;
    
    @FXML 
    private ComboBox<Integer> font_size;

    List<String> fm=Font.getFamilies();

    // final String[] fam= GraphicsEnvironment.getLocalGraphicsEnvironment().getAvailableFontFamilyNames();
    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        
        
        // fam.length;224
        // fm.size()222

        fami.getItems().addAll(fm);
        fami.getItems().add(fm.getLast());
        fami.setOnAction(this::txtfield);
        
        int i=0;
        while (i <= 50) {
            font_size.getItems().add(i);
            i++;
        }
        font_size.setOnAction(this::txtfield);
    }

    public void txtfield(ActionEvent event){
        txt.setFont(Font.font(fami.getValue(), font_size.getValue()));
    }
    public void newitem(ActionEvent event){
    }

    public void openitem(ActionEvent event){
    }

    public void saveitem(ActionEvent event){
    }

    public void about(ActionEvent event){
    }

    public void train(ActionEvent event){
    }

}
