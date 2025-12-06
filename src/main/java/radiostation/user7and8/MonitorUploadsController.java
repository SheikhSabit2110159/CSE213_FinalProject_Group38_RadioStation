package radiostation,user7and8;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;

public class MonitorUploadsController {
    private String display, filename,uploader;
    private int date,time;

    @FXML
    private TableColumn<date, Integer> dateTC;

    @FXML
    private TableView<display> displayTV;

    @FXML
    private TableColumn<filename, String> filenameTC;

    @FXML
    private TableColumn<time, Integer> timeTC;

    @FXML
    private TableColumn<uploader, String> uploaderTC;

    @javafx.fxml.FXML
    public void initialize() {
        dateTC.setCellValueFactory(new PropertyValueFactory<date, String>("dateTC"));
        filenameTC.setCellValueFactory(new PropertyValueFactory<filename, String>("filenameTC"));
        uploaderTC.setCellValueFactory(new PropertyValueFactory<uploader, String>("uploaderTC"));
        timeTC.setCellValueFactory(new PropertyValueFactory<time, String>("timeTC"));

    @FXML
    void dashboardOA(ActionEvent event) {

    }

    @FXML
    void displayOA(ActionEvent event) {

    }

}
