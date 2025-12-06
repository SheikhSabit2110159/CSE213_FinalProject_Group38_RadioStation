package radiostation,user7and8;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;

public class ComplianceCheck8Controller {
    private String showduration, showfiles,showname;
    private int date,showserial;

    @FXML
    private TableColumn<date, Integer> dateTC;

    @FXML
    private TextField enterprogramfileTF;

    @FXML
    private TableColumn<showduration, String> showdurationTC;

    @FXML
    private TableView<?> showfilesTV;

    @FXML
    private TableColumn<showname, String> shownameTC;

    @FXML
    private TableColumn<showserial, Integer> showserialTC;

    @FXML
    void savereportOA(ActionEvent event) {

    }

    @FXML
    void startcheckOA(ActionEvent event) {

    }

    @FXML
    void verifypolicyOA(ActionEvent event) {

    }

}
