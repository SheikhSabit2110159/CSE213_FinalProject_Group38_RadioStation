package radiostation,user7and8;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class ContentStrategyController {


    @FXML
    private TextField campaigntype;

    @FXML
    private TextArea strategysummaryTA;

    @FXML
    private ComboBox<String> targetedaudienceCB;

    @javafx.fxml.FXML
    public void initialize() {
        targetedaudienceCB.getItems().addAll("Male", "Female", "Teen");



    @FXML
    void validatestrategyOA(ActionEvent event) {

    }

}
