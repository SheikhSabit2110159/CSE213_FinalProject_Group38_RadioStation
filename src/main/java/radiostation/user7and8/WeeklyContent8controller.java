package radiostation,user7and8;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.ComboBox;

public class WeeklyContent8controller {

    @FXML
    private ComboBox<String> selectweekCB;

    @javafx.fxml.FXML
    public void initialize() {
        selectweekCB.getItems().addAll("Week 1-7", "Week 8-14", "Week 15-last");

    @FXML
    void loadOA(ActionEvent event) {

    }

    @FXML
    void runOA(ActionEvent event) {

    }

    @FXML
    void verifyOA(ActionEvent event) {

    }

}
