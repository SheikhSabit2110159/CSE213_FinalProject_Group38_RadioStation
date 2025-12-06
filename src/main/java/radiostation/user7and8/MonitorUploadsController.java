package radiostation,user7and8;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;

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

    @FXML
    void dashboardOA(ActionEvent event) {

    }

    @FXML
    void displayOA(ActionEvent event) {

    }

}
