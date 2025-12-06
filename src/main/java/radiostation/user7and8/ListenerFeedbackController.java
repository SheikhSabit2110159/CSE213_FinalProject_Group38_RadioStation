package radiostation,user7and8;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;

public class ListenerFeedbackController {
    private String feedback, feedbackmessage,scriptname,summary;
    private int date,fromdate,rating;

    @FXML
    private TableColumn<date, Integer> dateTC;

    @FXML
    private TableView<feedback> feedbackTV;

    @FXML
    private TableColumn<feedbackmessage, String> feedbackmessageTC;

    @FXML
    private TextField fromdateTF;

    @FXML
    private TableColumn<rating, Integer> ratingTC;

    @FXML
    private TableColumn<summary, String> summaryTC;

    @FXML
    private TextField todateTF;

    @FXML
    void RequestOA(ActionEvent event) {

    }

    @FXML
    void fetchfeedbackOA(ActionEvent event) {

    }

}
