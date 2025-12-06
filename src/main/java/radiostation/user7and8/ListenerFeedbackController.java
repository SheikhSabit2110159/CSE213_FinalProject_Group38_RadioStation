package radiostation,user7and8;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;

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

    @javafx.fxml.FXML
    public void initialize() {
        dateTC.setCellValueFactory(new PropertyValueFactory<date, String>("dateTC"));
        feedbackmessageTC.setCellValueFactory(new PropertyValueFactory<feedbackmessage, String>("feedbackmessageTC"));
        ratingTC.setCellValueFactory(new PropertyValueFactory<rating, String>("ratingTC"));
        summaryTC.setCellValueFactory(new PropertyValueFactory<summary, String>("summaryTC"));

    @FXML
    void RequestOA(ActionEvent event) {

    }

    @FXML
    void fetchfeedbackOA(ActionEvent event) {

    }

}
