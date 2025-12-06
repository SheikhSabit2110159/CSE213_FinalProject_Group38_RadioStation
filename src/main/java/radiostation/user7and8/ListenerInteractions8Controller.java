package radiostation,user7and8;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;

public class ListenerInteractions8Controller {
    private String caller, message,panel;
    private int mail,time;

    @FXML
    private TableColumn<caller, String> callerTC;

    @FXML
    private TableColumn<mail, Integer> mailTC;

    @FXML
    private TableColumn<message, String> messageTC;

    @FXML
    private TableView<panel> panelTV;

    @FXML
    private TableColumn<time, Integer> timeTC;

    @FXML
    void approveOA(ActionEvent event) {

    }

    @FXML
    void rejectOA(ActionEvent event) {

    }

}
