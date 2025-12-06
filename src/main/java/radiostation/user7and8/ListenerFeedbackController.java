package radiostation,user7and8;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;

public class ListenerFeedbackController {

    @FXML
    private TableColumn<?, ?> dateTC;

    @FXML
    private TableView<?> feedbackTV;

    @FXML
    private TableColumn<?, ?> feedbackmessageTC;

    @FXML
    private TextField fromdateTF;

    @FXML
    private TableColumn<?, ?> ratingTC;

    @FXML
    private TableColumn<?, ?> summaryTC;

    @FXML
    private TextField todateTF;

    @FXML
    void RequestOA(ActionEvent event) {

    }

    @FXML
    void fetchfeedbackOA(ActionEvent event) {

    }

}
