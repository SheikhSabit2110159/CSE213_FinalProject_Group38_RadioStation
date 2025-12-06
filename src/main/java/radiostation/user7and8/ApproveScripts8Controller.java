package radiostation,user7and8;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;

public class ApproveScripts8Controller {
    private String Script, author,scriptname;
    private int date,length;


    @FXML
    private TableView<Script> ScriptTV;

    @FXML
    private TableColumn<author, String> authorTC;

    @FXML
    private TableColumn<date, Integer> dateTC;

    @FXML
    private TableColumn<scriptname, String> scriptnameTC;

    @FXML
    void loadOA(ActionEvent event) {

    }

}
