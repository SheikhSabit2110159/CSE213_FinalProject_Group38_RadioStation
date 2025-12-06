package radiostation,user7and8;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TableColumn;

public class Advertisements8Controller {
    private String adname, sponsor;
    private int date,length;

    @FXML
    private TableColumn<adname, String> adnameTC;

    @FXML
    private TableColumn<date, Integer> dateTC;

    @FXML
    private TableColumn<length, Integer> lengthTC;

    @FXML
    private TableColumn<sponsor, String> sponsorTC;

    @FXML
    void ApproveOA(ActionEvent event) {

    }

    @FXML
    void previewOA(ActionEvent event) {

    }

}
