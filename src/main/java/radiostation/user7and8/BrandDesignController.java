package radiostation,user7and8;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;

public class BrandDesignController {
    private String logofile, logoshape, themecolor,tagline,design;

    @FXML
    private TableView<design> designTV;

    @FXML
    private TableColumn<logofile, String> logofileTC;

    @FXML
    private TextField logofileTF;

    @FXML
    private TableColumn<logoshape, String> logoshapeTC;

    @FXML
    private TextField logoshapeTF;

    @FXML
    private TableColumn<tagline, String> taglineTC;

    @FXML
    private TextField taglineTF;

    @FXML
    private TableColumn<themecolor, String> themecolorTC;

    @FXML
    private TextField themecolorTF;

    @FXML
    void showpreviewOA(ActionEvent event) {

    }

    @FXML
    void uploadOA(ActionEvent event) {

    }

    @FXML
    void validateOA(ActionEvent event) {

    }

}
