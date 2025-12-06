package radiostation,user7and8;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;

public class ApproveContentController {
    private String Category, submittedby, title,request;
    private int ID,submitteddate;

    @FXML
    private TableColumn<Category, String> categoryTC;

    @FXML
    private TableColumn<ID, String> idTC;

    @FXML
    private TableView<request> requestTV;

    @FXML
    private TableColumn<submittedby, String> submittedbyTC;

    @FXML
    private TableColumn<submitteddate, Integer> submitteddateTC;

    @FXML
    private TableColumn<title, String> titleTC;

    @javafx.fxml.FXML
    public void initialize() {
        categoryTC.setCellValueFactory(new PropertyValueFactory<Category, String>("categoryTC"));
        idTC.setCellValueFactory(new PropertyValueFactory<ID, String>("idTC"));
        submittedbyTC.setCellValueFactory(new PropertyValueFactory<submittedby, String>("submittedbyTC"));
        submitteddateTC.setCellValueFactory(new PropertyValueFactory<submitteddate, String>("submitteddateTC"));
        titleTC.setCellValueFactory(new PropertyValueFactory<title, String>("titleTC"));

    @FXML
    void approveOA(ActionEvent event) {

    }

    @FXML
    void rejectOA(ActionEvent event) {

    }

    @FXML
    void viewdetailsOA(ActionEvent event) {

    }

}
