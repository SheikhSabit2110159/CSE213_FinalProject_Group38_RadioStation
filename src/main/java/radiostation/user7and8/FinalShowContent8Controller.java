package radiostation,user7and8;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.ComboBox;

public class FinalShowContent8Controller {

    @FXML
    private ComboBox<String> shoeselectorCB;

    @javafx.fxml.FXML
    public void initialize() {
        shoeselectorCB.getItems().addAll("Week 1-7", "Week 8-14", "Week 15-last");

    @FXML
    void approveOA(ActionEvent event) {

    }

    @FXML
    void runOA(ActionEvent event) {

    }

}
