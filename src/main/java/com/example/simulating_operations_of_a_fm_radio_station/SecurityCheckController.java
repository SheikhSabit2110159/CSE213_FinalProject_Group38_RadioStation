package com.example.simulating_operations_of_a_fm_radio_station;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class SecurityCheck {

    @FXML
    private TextField autoPitch;

    @FXML
    private Label displayInfo;

    @FXML
    private TextField scanInfo;

    @FXML
    private TextField validationInfo;


    public SecurityCheck(TextField autoPitch, Label displayInfo, TextField scanInfo, TextField validationInfo) {
        this.autoPitch = autoPitch;
        this.displayInfo = displayInfo;
        this.scanInfo = scanInfo;
        this.validationInfo = validationInfo;
    }

    public TextField getAutoPitch() {
        return autoPitch;
    }

    public Label getDisplayInfo() {
        return displayInfo;
    }

    public TextField getScanInfo() {
        return scanInfo;
    }

    public TextField getValidationInfo() {
        return validationInfo;
    }

    public void setAutoPitch(TextField autoPitch) {
        this.autoPitch = autoPitch;
    }

    public void setDisplayInfo(Label displayInfo) {
        this.displayInfo = displayInfo;
    }

    @Override
    public String toString() {
        return "SecurityCheck{" +
                "autoPitch=" + autoPitch +
                ", displayInfo=" + displayInfo +
                ", scanInfo=" + scanInfo +
                ", validationInfo=" + validationInfo +
                '}';
    }

    
}