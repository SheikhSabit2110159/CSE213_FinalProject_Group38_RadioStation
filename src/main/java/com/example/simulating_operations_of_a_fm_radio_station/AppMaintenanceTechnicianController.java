package com.example.simulating_operations_of_a_fm_radio_station;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;

public class AppMaintenanceTechnician {

    @FXML
    private TextField id;

    @FXML
    private TextField name;

    @FXML
    private TextField password;

    @FXML
    void ensureAppSecurity(ActionEvent event) {

    }

    @FXML
    void fixApplicationBugs(ActionEvent event) {

    }

    @FXML
    void generateTechnical(ActionEvent event) {

    }

    @FXML
    void maintainRadioStreamingServers(ActionEvent event) {

    }

    @FXML
    void managerUserInterface(ActionEvent event) {

    }

    @FXML
    void monitorAppSystemHealth(ActionEvent event) {

    }

    @FXML
    void monitorListenerAppPerformance(ActionEvent event) {

    }

    @FXML
    void updateFMAppSoftware(ActionEvent event) {

    }

    public AppMaintenanceTechnician(TextField name, TextField id, TextField password) {
        this.name = name;
        this.id = id;
        this.password = password;
    }

    public TextField getId() {
        return id;
    }

    public TextField getName() {
        return name;
    }

    public TextField getPassword() {
        return password;
    }

    public void setId(TextField id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "AppMaintenanceTechnician{" +
                "id=" + id +
                ", name=" + name +
                ", password=" + password +
                '}';
    }
}
