package radiostation,user7and8;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;

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
