package com.example.simulating_operations_of_a_fm_radio_station;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;

public class AppPerformance {

    @FXML
    private TextField analysis;

    @FXML
    private TextField validationCheck;

    @FXML
    void requestLog(ActionEvent event) {

    }

    public AppPerformance(TextField analysis, TextField validationCheck) {
        this.analysis = analysis;
        this.validationCheck = validationCheck;
    }

    public TextField getAnalysis() {
        return analysis;
    }

    public TextField getValidationCheck() {
        return validationCheck;
    }

    public void setAnalysis(TextField analysis) {
        this.analysis = analysis;
    }

    @Override
    public String toString() {
        return "AppPerformance{" +
                "analysis=" + analysis +
                ", validationCheck=" + validationCheck +
                '}';
    }
}
