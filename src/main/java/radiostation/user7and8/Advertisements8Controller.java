package radiostation,user7and8;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TableColumn;
import javafx.scene.control.cell.PropertyValueFactory;

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

    @javafx.fxml.FXML
    public void initialize() {
        adnameTC.setCellValueFactory(new PropertyValueFactory<adname, String>("adnameTC"));
        dateTC.setCellValueFactory(new PropertyValueFactory<date, String>("dateTC"));
        lengthTC.setCellValueFactory(new PropertyValueFactory<length, String>("lengthTC"));
        sponsorTC.setCellValueFactory(new PropertyValueFactory<sponsor, String>("sponsorTC"));

    @FXML
    void ApproveOA(ActionEvent event) {

    }

    @FXML
    void previewOA(ActionEvent event) {

    }

}
