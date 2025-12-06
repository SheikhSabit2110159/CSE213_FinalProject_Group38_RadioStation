package radiostation,user7and8;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;

public class FinalVerificationController {
    private String showdetails;

    @FXML
    private TextField enteridTF;

    @FXML
    private TableColumn<showdetails, String> showdetailsTC;

    @FXML
    private TableView<showdetails> showdetailsTV;

    @javafx.fxml.FXML
    public void initialize() {
        showdetailsTC.setCellValueFactory(new PropertyValueFactory<showdetails, String>("showdetailsTC"));

    @FXML
    void fetchfileOA(ActionEvent event) {

    }

    @FXML
    void previewOA(ActionEvent event) {

    }

    @FXML
    void reviewOA(ActionEvent event) {

    }

    @FXML
    void validatesequenceOA(ActionEvent event) {

    }

    @FXML
    void verifyOA(ActionEvent event) {

    }

}
